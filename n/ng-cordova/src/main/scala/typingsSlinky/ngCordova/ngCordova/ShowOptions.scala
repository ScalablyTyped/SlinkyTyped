package typingsSlinky.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowOptions extends js.Object {
  var addCancelButtonWithLabel: js.UndefOr[String] = js.native
  var addDestructiveButtonWithLabel: js.UndefOr[String] = js.native
  var androidEnableCancelButton: js.UndefOr[Boolean] = js.native
  var buttonLabels: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var winphoneEnableCancelButton: js.UndefOr[Boolean] = js.native
}

object ShowOptions {
  @scala.inline
  def apply(): ShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowOptions]
  }
  @scala.inline
  implicit class ShowOptionsOps[Self <: ShowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCancelButtonWithLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCancelButtonWithLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddCancelButtonWithLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCancelButtonWithLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAddDestructiveButtonWithLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDestructiveButtonWithLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddDestructiveButtonWithLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDestructiveButtonWithLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidEnableCancelButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidEnableCancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidEnableCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidEnableCancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWinphoneEnableCancelButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winphoneEnableCancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWinphoneEnableCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winphoneEnableCancelButton")(js.undefined)
        ret
    }
  }
  
}

