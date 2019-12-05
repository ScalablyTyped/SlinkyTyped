package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreServerSideEncryptionConfigurationMod

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreServerSideEncryptionRuleMod._ServerSideEncryptionRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ServerSideEncryptionConfiguration extends js.Object {
  /**
    * <p>Container for information about a particular server-side encryption configuration rule.</p>
    */
  var Rules: js.Array[_ServerSideEncryptionRule] | js.Iterable[_ServerSideEncryptionRule]
}

object _ServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: js.Array[_ServerSideEncryptionRule] | js.Iterable[_ServerSideEncryptionRule]): _ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ServerSideEncryptionConfiguration]
  }
}

