package typingsSlinky.awsSdkClientS3Node.typesServerSideEncryptionConfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesServerSideEncryptionRuleMod.ServerSideEncryptionRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSideEncryptionConfiguration extends js.Object {
  /**
    * <p>Container for information about a particular server-side encryption configuration rule.</p>
    */
  var Rules: js.Array[ServerSideEncryptionRule] | js.Iterable[ServerSideEncryptionRule]
}

object ServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: js.Array[ServerSideEncryptionRule] | js.Iterable[ServerSideEncryptionRule]): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
}

