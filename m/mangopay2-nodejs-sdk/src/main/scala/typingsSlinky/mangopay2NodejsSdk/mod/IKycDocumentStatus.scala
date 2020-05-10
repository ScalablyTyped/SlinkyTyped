package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKycDocumentStatus extends js.Object {
  var Created: CREATED = js.native
  var Refused: REFUSED = js.native
  var Validated: VALIDATED = js.native
  var ValidationAsked: VALIDATION_ASKED = js.native
}

object IKycDocumentStatus {
  @scala.inline
  def apply(Created: CREATED, Refused: REFUSED, Validated: VALIDATED, ValidationAsked: VALIDATION_ASKED): IKycDocumentStatus = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], Refused = Refused.asInstanceOf[js.Any], Validated = Validated.asInstanceOf[js.Any], ValidationAsked = ValidationAsked.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKycDocumentStatus]
  }
  @scala.inline
  implicit class IKycDocumentStatusOps[Self <: IKycDocumentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: CREATED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefused(value: REFUSED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidated(value: VALIDATED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationAsked(value: VALIDATION_ASKED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationAsked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

