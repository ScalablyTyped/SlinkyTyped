package typingsSlinky.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the necessary strings to get/set a hyperlink (XHL) object.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait RangeHyperlink extends js.Object {
  /**
    *
    * Represents the url target for the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: js.UndefOr[String] = js.native
  /**
    *
    * Represents the document reference target for the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var documentReference: js.UndefOr[String] = js.native
  /**
    *
    * Represents the string displayed when hovering over the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var screenTip: js.UndefOr[String] = js.native
  /**
    *
    * Represents the string that is displayed in the top left most cell in the range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textToDisplay: js.UndefOr[String] = js.native
}

object RangeHyperlink {
  @scala.inline
  def apply(): RangeHyperlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeHyperlink]
  }
  @scala.inline
  implicit class RangeHyperlinkOps[Self <: RangeHyperlink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentReference")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenTip")(js.undefined)
        ret
    }
    @scala.inline
    def withTextToDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextToDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToDisplay")(js.undefined)
        ret
    }
  }
  
}

