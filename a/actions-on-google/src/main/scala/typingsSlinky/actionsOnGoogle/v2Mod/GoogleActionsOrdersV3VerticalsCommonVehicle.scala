package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsCommonVehicle extends js.Object {
  /**
    * Vehicle color name, eg. black
    * Optional.
    */
  var colorName: js.UndefOr[String] = js.native
  /**
    * URL to a photo of the vehicle.
    * The photo will be displayed at approximately 256x256px.
    * Must be a jpg or png.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Vehicle license plate number (e.g. \"1ABC234\").
    * Required.
    */
  var licensePlate: js.UndefOr[String] = js.native
  /**
    * Vehicle make (e.g. \"Honda\").
    * This is displayed to the user and must be localized.
    * Required.
    */
  var make: js.UndefOr[String] = js.native
  /**
    * Vehicle model (e.g. \"Grom\").
    * This is displayed to the user and must be localized.
    * Required.
    */
  var model: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3VerticalsCommonVehicle {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsCommonVehicle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsCommonVehicle]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsCommonVehicleOps[Self <: GoogleActionsOrdersV3VerticalsCommonVehicle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorName")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: GoogleActionsV2UiElementsImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLicensePlate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensePlate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicensePlate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensePlate")(js.undefined)
        ret
    }
    @scala.inline
    def withMake(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
  }
  
}

