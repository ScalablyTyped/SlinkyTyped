package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limits extends js.Object {
  /**
    *  List of additional limits that are specific to a given InstanceType and for each of it's  InstanceRole  . 
    */
  var AdditionalLimits: js.UndefOr[AdditionalLimitList] = js.native
  var InstanceLimits: js.UndefOr[typingsSlinky.awsSdk.esMod.InstanceLimits] = js.native
  /**
    * StorageType represents the list of storage related types and attributes that are available for given InstanceType. 
    */
  var StorageTypes: js.UndefOr[StorageTypeList] = js.native
}

object Limits {
  @scala.inline
  def apply(): Limits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Limits]
  }
  @scala.inline
  implicit class LimitsOps[Self <: Limits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalLimits(value: AdditionalLimitList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceLimits(value: InstanceLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageTypes(value: StorageTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageTypes")(js.undefined)
        ret
    }
  }
  
}

