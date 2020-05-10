package typingsSlinky.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for NetworkPolicy. This only tracks whether the addon is
  * enabled or not on the Master, it does not track whether network policy is
  * enabled for the nodes.
  */
@js.native
trait SchemaNetworkPolicyConfig extends js.Object {
  /**
    * Whether NetworkPolicy is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object SchemaNetworkPolicyConfig {
  @scala.inline
  def apply(): SchemaNetworkPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkPolicyConfig]
  }
  @scala.inline
  implicit class SchemaNetworkPolicyConfigOps[Self <: SchemaNetworkPolicyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
  }
  
}

