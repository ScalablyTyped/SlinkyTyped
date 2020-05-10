package typingsSlinky.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration used for Asset Discovery runs.
  */
@js.native
trait SchemaAssetDiscoveryConfig extends js.Object {
  /**
    * The mode to use for filtering asset discovery.
    */
  var inclusionMode: js.UndefOr[String] = js.native
  /**
    * The project ids to use for filtering asset discovery.
    */
  var projectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAssetDiscoveryConfig {
  @scala.inline
  def apply(): SchemaAssetDiscoveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssetDiscoveryConfig]
  }
  @scala.inline
  implicit class SchemaAssetDiscoveryConfigOps[Self <: SchemaAssetDiscoveryConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclusionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectIds")(js.undefined)
        ret
    }
  }
  
}

