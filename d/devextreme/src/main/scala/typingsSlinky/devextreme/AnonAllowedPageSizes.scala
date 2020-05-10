package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowedPageSizes extends js.Object {
  var allowedPageSizes: js.UndefOr[js.Array[Double] | auto] = js.native
  var infoText: js.UndefOr[String] = js.native
  var showInfo: js.UndefOr[Boolean] = js.native
  var showNavigationButtons: js.UndefOr[Boolean] = js.native
  var showPageSizeSelector: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean | auto] = js.native
}

object AnonAllowedPageSizes {
  @scala.inline
  def apply(): AnonAllowedPageSizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowedPageSizes]
  }
  @scala.inline
  implicit class AnonAllowedPageSizesOps[Self <: AnonAllowedPageSizes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedPageSizes(value: js.Array[Double] | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPageSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedPageSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPageSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavigationButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigationButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavigationButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigationButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPageSizeSelector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageSizeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPageSizeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageSizeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

