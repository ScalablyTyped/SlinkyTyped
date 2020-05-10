package typingsSlinky.ejWebAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomIcon extends js.Object {
  /** This class name set to collapsing header.
    */
  var header: js.UndefOr[String] = js.native
  /** This class name set to expanded (active) header.
    */
  var selectedHeader: js.UndefOr[String] = js.native
}

object CustomIcon {
  @scala.inline
  def apply(): CustomIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomIcon]
  }
  @scala.inline
  implicit class CustomIconOps[Self <: CustomIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedHeader")(js.undefined)
        ret
    }
  }
  
}

