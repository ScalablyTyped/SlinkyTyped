package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFSignaturePromptInfoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignatureSettings extends js.Object {
  var AdditionalInfo: String = js.native
  var FreeFormTextPropertyID: Double = js.native
  var IsFreeFormTextPrompted: Boolean = js.native
  var IsRequired: Boolean = js.native
  var IsSeparateSignatureObject: Boolean = js.native
  var ManifestationPropertyID: Double = js.native
  val PromptInfoType: MFSignaturePromptInfoType = js.native
  var SignatureIdentifier: String = js.native
  var SignaturePromptInfoFixed: ISignaturePromptInfo = js.native
  var SignaturePromptInfoMetadataBased: ISignaturePromptInfoMetadataBased = js.native
  var SignaturePromptInfoSelectable: ISignaturePromptInfoSelectable = js.native
  def Clone(): ISignatureSettings = js.native
}

object ISignatureSettings {
  @scala.inline
  def apply(
    AdditionalInfo: String,
    Clone: () => ISignatureSettings,
    FreeFormTextPropertyID: Double,
    IsFreeFormTextPrompted: Boolean,
    IsRequired: Boolean,
    IsSeparateSignatureObject: Boolean,
    ManifestationPropertyID: Double,
    PromptInfoType: MFSignaturePromptInfoType,
    SignatureIdentifier: String,
    SignaturePromptInfoFixed: ISignaturePromptInfo,
    SignaturePromptInfoMetadataBased: ISignaturePromptInfoMetadataBased,
    SignaturePromptInfoSelectable: ISignaturePromptInfoSelectable
  ): ISignatureSettings = {
    val __obj = js.Dynamic.literal(AdditionalInfo = AdditionalInfo.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), FreeFormTextPropertyID = FreeFormTextPropertyID.asInstanceOf[js.Any], IsFreeFormTextPrompted = IsFreeFormTextPrompted.asInstanceOf[js.Any], IsRequired = IsRequired.asInstanceOf[js.Any], IsSeparateSignatureObject = IsSeparateSignatureObject.asInstanceOf[js.Any], ManifestationPropertyID = ManifestationPropertyID.asInstanceOf[js.Any], PromptInfoType = PromptInfoType.asInstanceOf[js.Any], SignatureIdentifier = SignatureIdentifier.asInstanceOf[js.Any], SignaturePromptInfoFixed = SignaturePromptInfoFixed.asInstanceOf[js.Any], SignaturePromptInfoMetadataBased = SignaturePromptInfoMetadataBased.asInstanceOf[js.Any], SignaturePromptInfoSelectable = SignaturePromptInfoSelectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignatureSettings]
  }
  @scala.inline
  implicit class ISignatureSettingsOps[Self <: ISignatureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => ISignatureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFreeFormTextPropertyID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FreeFormTextPropertyID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFreeFormTextPrompted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFreeFormTextPrompted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSeparateSignatureObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSeparateSignatureObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifestationPropertyID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestationPropertyID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromptInfoType(value: MFSignaturePromptInfoType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PromptInfoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignaturePromptInfoFixed(value: ISignaturePromptInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignaturePromptInfoFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignaturePromptInfoMetadataBased(value: ISignaturePromptInfoMetadataBased): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignaturePromptInfoMetadataBased")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignaturePromptInfoSelectable(value: ISignaturePromptInfoSelectable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignaturePromptInfoSelectable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

