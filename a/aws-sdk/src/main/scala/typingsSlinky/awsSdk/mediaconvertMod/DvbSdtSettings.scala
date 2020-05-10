package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbSdtSettings extends js.Object {
  /**
    * Selects method of inserting SDT information into output stream.  "Follow input SDT" copies SDT information from input stream to  output stream. "Follow input SDT if present" copies SDT information from  input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT  Manually" means user will enter the SDT information. "No SDT" means output  stream will not contain SDT information.
    */
  var OutputSdt: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.OutputSdt] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var SdtInterval: js.UndefOr[integerMin25Max2000] = js.native
  /**
    * The service name placed in the service_descriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceName: js.UndefOr[stringMin1Max256] = js.native
  /**
    * The service provider name placed in the service_descriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceProviderName: js.UndefOr[stringMin1Max256] = js.native
}

object DvbSdtSettings {
  @scala.inline
  def apply(): DvbSdtSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbSdtSettings]
  }
  @scala.inline
  implicit class DvbSdtSettingsOps[Self <: DvbSdtSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputSdt(value: OutputSdt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSdt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSdt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSdt")(js.undefined)
        ret
    }
    @scala.inline
    def withSdtInterval(value: integerMin25Max2000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SdtInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdtInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SdtInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: stringMin1Max256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceProviderName(value: stringMin1Max256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceProviderName")(js.undefined)
        ret
    }
  }
  
}

