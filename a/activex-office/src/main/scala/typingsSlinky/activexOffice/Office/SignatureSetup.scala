package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureSetup extends js.Object {
  var AdditionalXml: String = js.native
  var AllowComments: Boolean = js.native
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Id: String = js.native
  @JSName("Office.SignatureSetup_typekey")
  var OfficeDotSignatureSetup_typekey: SignatureSetup = js.native
  val ReadOnly: Boolean = js.native
  var ShowSignDate: Boolean = js.native
  val SignatureProvider: String = js.native
  var SigningInstructions: String = js.native
  var SuggestedSigner: String = js.native
  var SuggestedSignerEmail: String = js.native
  var SuggestedSignerLine2: String = js.native
}

object SignatureSetup {
  @scala.inline
  def apply(
    AdditionalXml: String,
    AllowComments: Boolean,
    Application: js.Any,
    Creator: Double,
    Id: String,
    OfficeDotSignatureSetup_typekey: SignatureSetup,
    ReadOnly: Boolean,
    ShowSignDate: Boolean,
    SignatureProvider: String,
    SigningInstructions: String,
    SuggestedSigner: String,
    SuggestedSignerEmail: String,
    SuggestedSignerLine2: String
  ): SignatureSetup = {
    val __obj = js.Dynamic.literal(AdditionalXml = AdditionalXml.asInstanceOf[js.Any], AllowComments = AllowComments.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], ShowSignDate = ShowSignDate.asInstanceOf[js.Any], SignatureProvider = SignatureProvider.asInstanceOf[js.Any], SigningInstructions = SigningInstructions.asInstanceOf[js.Any], SuggestedSigner = SuggestedSigner.asInstanceOf[js.Any], SuggestedSignerEmail = SuggestedSignerEmail.asInstanceOf[js.Any], SuggestedSignerLine2 = SuggestedSignerLine2.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SignatureSetup_typekey")(OfficeDotSignatureSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureSetup]
  }
  @scala.inline
  implicit class SignatureSetupOps[Self <: SignatureSetup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalXml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotSignatureSetup_typekey(value: SignatureSetup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.SignatureSetup_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSignDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowSignDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningInstructions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedSigner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestedSigner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedSignerEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestedSignerEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedSignerLine2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestedSignerLine2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

