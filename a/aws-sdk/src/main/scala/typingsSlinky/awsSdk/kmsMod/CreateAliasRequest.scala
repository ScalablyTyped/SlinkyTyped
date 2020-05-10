package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAliasRequest extends js.Object {
  /**
    * Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
    */
  var AliasName: AliasNameType = js.native
  /**
    * Identifies the CMK to which the alias refers. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. You cannot specify another alias. For help finding the key ID and ARN, see Finding the Key ID and ARN in the AWS Key Management Service Developer Guide.
    */
  var TargetKeyId: KeyIdType = js.native
}

object CreateAliasRequest {
  @scala.inline
  def apply(AliasName: AliasNameType, TargetKeyId: KeyIdType): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasRequest]
  }
  @scala.inline
  implicit class CreateAliasRequestOps[Self <: CreateAliasRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasName(value: AliasNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetKeyId(value: KeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetKeyId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

