package typingsSlinky.pulumiAws.getDefaultKmsKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultKmsKeyResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Amazon Resource Name (ARN) of the default KMS key uses to encrypt an EBS volume in this region when no key is specified in an API call that creates the volume and encryption by default is enabled.
    */
  val keyArn: String = js.native
}

object GetDefaultKmsKeyResult {
  @scala.inline
  def apply(id: String, keyArn: String): GetDefaultKmsKeyResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], keyArn = keyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultKmsKeyResult]
  }
  @scala.inline
  implicit class GetDefaultKmsKeyResultOps[Self <: GetDefaultKmsKeyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

