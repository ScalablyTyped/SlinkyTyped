package typingsSlinky.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.typesServerSideEncryptionRuleMod.UnmarshalledServerSideEncryptionRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledServerSideEncryptionConfiguration extends ServerSideEncryptionConfiguration {
  /**
    * <p>Container for information about a particular server-side encryption configuration rule.</p>
    */
  @JSName("Rules")
  var Rules_UnmarshalledServerSideEncryptionConfiguration: js.Array[UnmarshalledServerSideEncryptionRule]
}

object UnmarshalledServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: js.Array[UnmarshalledServerSideEncryptionRule]): UnmarshalledServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledServerSideEncryptionConfiguration]
  }
}

