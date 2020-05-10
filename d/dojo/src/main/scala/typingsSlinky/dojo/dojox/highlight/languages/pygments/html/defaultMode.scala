package typingsSlinky.dojo.dojox.highlight.languages.pygments.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/pygments/html.defaultMode.html
  *
  *
  */
@js.native
trait defaultMode extends js.Object {
  /**
    *
    */
  var contains: js.Array[_] = js.native
}

object defaultMode {
  @scala.inline
  def apply(contains: js.Array[_]): defaultMode = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultMode]
  }
  @scala.inline
  implicit class defaultModeOps[Self <: defaultMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

