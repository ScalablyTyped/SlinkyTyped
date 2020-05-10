package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosCustomConfiguration extends DeviceConfiguration {
  // Payload. (UTF8 encoded byte array)
  var payload: js.UndefOr[Double] = js.native
  // Payload file name (.mobileconfig
  var payloadFileName: js.UndefOr[String] = js.native
  // Name that is displayed to the user.
  var payloadName: js.UndefOr[String] = js.native
}

object IosCustomConfiguration {
  @scala.inline
  def apply(): IosCustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosCustomConfiguration]
  }
  @scala.inline
  implicit class IosCustomConfigurationOps[Self <: IosCustomConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadName")(js.undefined)
        ret
    }
  }
  
}

