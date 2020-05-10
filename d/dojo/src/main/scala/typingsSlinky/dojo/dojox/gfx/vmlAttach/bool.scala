package typingsSlinky.dojo.dojox.gfx.vmlAttach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/vml_attach._bool.html
  *
  *
  */
@js.native
trait bool extends js.Object {
  /**
    *
    */
  var t: Double = js.native
  /**
    *
    */
  var `true`: Double = js.native
}

object bool {
  @scala.inline
  def apply(t: Double, `true`: Double): bool = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[bool]
  }
  @scala.inline
  implicit class boolOps[Self <: bool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("true")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

