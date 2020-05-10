package typingsSlinky.carbonIconHelpers.mod

import typingsSlinky.carbonIconHelpers.AnonD
import typingsSlinky.carbonIconHelpers.carbonIconHelpersStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends js.Object {
  var attrs: AnonD = js.native
  var elem: path = js.native
}

object Path {
  @scala.inline
  def apply(attrs: AnonD, elem: path): Path = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], elem = elem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: AnonD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElem(value: path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

