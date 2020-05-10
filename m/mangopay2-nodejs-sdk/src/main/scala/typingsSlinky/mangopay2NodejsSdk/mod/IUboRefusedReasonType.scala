package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_DECLARED_UBO
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_UBO_DETAILS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUboRefusedReasonType extends js.Object {
  /**
    * When user should not be declared as UBO
    */
  var InvalidDeclaredUbo: INVALID_DECLARED_UBO = js.native
  /**
    * When user declared as UBO was created with wrong
    * details (i.e. date of birth, country of residence)
    */
  var InvalidUboDetails: INVALID_UBO_DETAILS = js.native
}

object IUboRefusedReasonType {
  @scala.inline
  def apply(InvalidDeclaredUbo: INVALID_DECLARED_UBO, InvalidUboDetails: INVALID_UBO_DETAILS): IUboRefusedReasonType = {
    val __obj = js.Dynamic.literal(InvalidDeclaredUbo = InvalidDeclaredUbo.asInstanceOf[js.Any], InvalidUboDetails = InvalidUboDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUboRefusedReasonType]
  }
  @scala.inline
  implicit class IUboRefusedReasonTypeOps[Self <: IUboRefusedReasonType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidDeclaredUbo(value: INVALID_DECLARED_UBO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidDeclaredUbo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidUboDetails(value: INVALID_UBO_DETAILS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidUboDetails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

