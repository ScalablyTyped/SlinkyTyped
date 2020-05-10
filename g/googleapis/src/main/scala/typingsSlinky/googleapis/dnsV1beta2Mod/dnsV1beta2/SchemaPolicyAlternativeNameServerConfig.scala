package typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPolicyAlternativeNameServerConfig extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policyAlternativeNameServerConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var targetNameServers: js.UndefOr[js.Array[SchemaPolicyAlternativeNameServerConfigTargetNameServer]] = js.native
}

object SchemaPolicyAlternativeNameServerConfig {
  @scala.inline
  def apply(): SchemaPolicyAlternativeNameServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyAlternativeNameServerConfig]
  }
  @scala.inline
  implicit class SchemaPolicyAlternativeNameServerConfigOps[Self <: SchemaPolicyAlternativeNameServerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNameServers(value: js.Array[SchemaPolicyAlternativeNameServerConfigTargetNameServer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetNameServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNameServers")(js.undefined)
        ret
    }
  }
  
}

