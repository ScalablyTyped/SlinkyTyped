package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsamManifestConfirmConditionNotification extends js.Object {
  /**
    * Provide your ESAM ManifestConfirmConditionNotification XML document inside your JSON job settings. Form the XML document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest Conditioning instructions in the message that you supply.
    */
  var MccXml: js.UndefOr[stringPatternSNManifestConfirmConditionNotificationNS] = js.native
}

object EsamManifestConfirmConditionNotification {
  @scala.inline
  def apply(): EsamManifestConfirmConditionNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsamManifestConfirmConditionNotification]
  }
  @scala.inline
  implicit class EsamManifestConfirmConditionNotificationOps[Self <: EsamManifestConfirmConditionNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMccXml(value: stringPatternSNManifestConfirmConditionNotificationNS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MccXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMccXml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MccXml")(js.undefined)
        ret
    }
  }
  
}

