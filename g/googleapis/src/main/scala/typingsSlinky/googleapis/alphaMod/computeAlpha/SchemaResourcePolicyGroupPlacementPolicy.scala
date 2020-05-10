package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GroupPlacementPolicy specifies resource placement configuration. It
  * specifies the failure bucket separation as well as network locality
  */
@js.native
trait SchemaResourcePolicyGroupPlacementPolicy extends js.Object {
  /**
    * Specifies network locality
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Specifies instances to hosts placement relationship
    */
  var style: js.UndefOr[String] = js.native
  /**
    * Number of vms in this placement group
    */
  var vmCount: js.UndefOr[Double] = js.native
}

object SchemaResourcePolicyGroupPlacementPolicy {
  @scala.inline
  def apply(): SchemaResourcePolicyGroupPlacementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyGroupPlacementPolicy]
  }
  @scala.inline
  implicit class SchemaResourcePolicyGroupPlacementPolicyOps[Self <: SchemaResourcePolicyGroupPlacementPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withVmCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmCount")(js.undefined)
        ret
    }
  }
  
}

