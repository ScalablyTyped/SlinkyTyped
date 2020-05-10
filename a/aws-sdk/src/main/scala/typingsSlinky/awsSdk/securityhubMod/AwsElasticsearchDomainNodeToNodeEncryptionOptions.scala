package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElasticsearchDomainNodeToNodeEncryptionOptions extends js.Object {
  /**
    * Whether node-to-node encryption is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object AwsElasticsearchDomainNodeToNodeEncryptionOptions {
  @scala.inline
  def apply(): AwsElasticsearchDomainNodeToNodeEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainNodeToNodeEncryptionOptions]
  }
  @scala.inline
  implicit class AwsElasticsearchDomainNodeToNodeEncryptionOptionsOps[Self <: AwsElasticsearchDomainNodeToNodeEncryptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
  }
  
}

