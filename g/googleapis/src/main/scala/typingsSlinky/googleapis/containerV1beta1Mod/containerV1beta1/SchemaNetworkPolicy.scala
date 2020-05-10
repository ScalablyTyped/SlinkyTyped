package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the NetworkPolicy feature.
  * https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
  */
@js.native
trait SchemaNetworkPolicy extends js.Object {
  /**
    * Whether network policy is enabled on the cluster.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The selected network policy provider.
    */
  var provider: js.UndefOr[String] = js.native
}

object SchemaNetworkPolicy {
  @scala.inline
  def apply(): SchemaNetworkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkPolicy]
  }
  @scala.inline
  implicit class SchemaNetworkPolicyOps[Self <: SchemaNetworkPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
  }
  
}

