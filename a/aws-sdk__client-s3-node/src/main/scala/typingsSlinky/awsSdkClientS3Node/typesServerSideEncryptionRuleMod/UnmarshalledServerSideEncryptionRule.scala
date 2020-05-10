package typingsSlinky.awsSdkClientS3Node.typesServerSideEncryptionRuleMod

import typingsSlinky.awsSdkClientS3Node.typesServerSideEncryptionByDefaultMod.UnmarshalledServerSideEncryptionByDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledServerSideEncryptionRule extends ServerSideEncryptionRule {
  /**
    * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
    */
  @JSName("ApplyServerSideEncryptionByDefault")
  var ApplyServerSideEncryptionByDefault_UnmarshalledServerSideEncryptionRule: js.UndefOr[UnmarshalledServerSideEncryptionByDefault] = js.native
}

object UnmarshalledServerSideEncryptionRule {
  @scala.inline
  def apply(): UnmarshalledServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledServerSideEncryptionRule]
  }
  @scala.inline
  implicit class UnmarshalledServerSideEncryptionRuleOps[Self <: UnmarshalledServerSideEncryptionRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyServerSideEncryptionByDefault(value: UnmarshalledServerSideEncryptionByDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyServerSideEncryptionByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyServerSideEncryptionByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyServerSideEncryptionByDefault")(js.undefined)
        ret
    }
  }
  
}

