package typingsSlinky.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClassAttr extends js.Object {
  var classAttr: js.UndefOr[String] = js.native
  var styleAttr: js.UndefOr[String] = js.native
}

object AnonClassAttr {
  @scala.inline
  def apply(): AnonClassAttr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClassAttr]
  }
  @scala.inline
  implicit class AnonClassAttrOps[Self <: AnonClassAttr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleAttr")(js.undefined)
        ret
    }
  }
  
}

