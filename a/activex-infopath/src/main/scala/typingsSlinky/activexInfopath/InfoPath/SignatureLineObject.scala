package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureLineObject extends js.Object {
  val Id: String = js.native
  @JSName("InfoPath.SignatureLineObject_typekey")
  var InfoPathDotSignatureLineObject_typekey: SignatureLineObject = js.native
  val Signature: SignatureObject = js.native
  val SignatureAppearanceType: XdSignatureAppearanceType = js.native
  var SuggestedSigner: String = js.native
  var SuggestedSignerEmailAddress: String = js.native
  var SuggestedSignerTitle: String = js.native
  def Sign(
    bstrImageURL: String,
    bstrSuggestedSigner: String,
    bstrSuggestedSignerTitle: String,
    bstrSuggestedSignerEmailAddress: String
  ): Boolean = js.native
}

object SignatureLineObject {
  @scala.inline
  def apply(
    Id: String,
    InfoPathDotSignatureLineObject_typekey: SignatureLineObject,
    Sign: (String, String, String, String) => Boolean,
    Signature: SignatureObject,
    SignatureAppearanceType: XdSignatureAppearanceType,
    SuggestedSigner: String,
    SuggestedSignerEmailAddress: String,
    SuggestedSignerTitle: String
  ): SignatureLineObject = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Sign = js.Any.fromFunction4(Sign), Signature = Signature.asInstanceOf[js.Any], SignatureAppearanceType = SignatureAppearanceType.asInstanceOf[js.Any], SuggestedSigner = SuggestedSigner.asInstanceOf[js.Any], SuggestedSignerEmailAddress = SuggestedSignerEmailAddress.asInstanceOf[js.Any], SuggestedSignerTitle = SuggestedSignerTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SignatureLineObject_typekey")(InfoPathDotSignatureLineObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureLineObject]
  }
  @scala.inline
  implicit class SignatureLineObjectOps[Self <: SignatureLineObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotSignatureLineObject_typekey(value: SignatureLineObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.SignatureLineObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSign(value: (String, String, String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sign")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSignature(value: SignatureObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureAppearanceType(value: XdSignatureAppearanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureAppearanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedSigner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestedSigner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedSignerEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestedSignerEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedSignerTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestedSignerTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

