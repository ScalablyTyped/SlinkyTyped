package typingsSlinky.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEncryptionConfig extends js.Object {
  /**
    * Configuration block with provider for encryption. Detailed below.
    */
  var provider: ClusterEncryptionConfigProvider = js.native
  /**
    * List of strings with resources to be encrypted. Valid values: `secrets`
    */
  var resources: js.Array[String] = js.native
}

object ClusterEncryptionConfig {
  @scala.inline
  def apply(provider: ClusterEncryptionConfigProvider, resources: js.Array[String]): ClusterEncryptionConfig = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEncryptionConfig]
  }
  @scala.inline
  implicit class ClusterEncryptionConfigOps[Self <: ClusterEncryptionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: ClusterEncryptionConfigProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

