package typingsSlinky.awsSdkClientS3Node.typesServerSideEncryptionConfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesServerSideEncryptionRuleMod.UnmarshalledServerSideEncryptionRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledServerSideEncryptionConfiguration extends ServerSideEncryptionConfiguration {
  /**
    * <p>Container for information about a particular server-side encryption configuration rule.</p>
    */
  @JSName("Rules")
  var Rules_UnmarshalledServerSideEncryptionConfiguration: js.Array[UnmarshalledServerSideEncryptionRule] = js.native
}

object UnmarshalledServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: js.Array[UnmarshalledServerSideEncryptionRule]): UnmarshalledServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledServerSideEncryptionConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledServerSideEncryptionConfigurationOps[Self <: UnmarshalledServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: js.Array[UnmarshalledServerSideEncryptionRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

