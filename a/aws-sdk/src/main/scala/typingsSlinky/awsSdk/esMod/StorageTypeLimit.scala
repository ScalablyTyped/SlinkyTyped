package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageTypeLimit extends js.Object {
  /**
    *  Name of storage limits that are applicable for given storage type. If  StorageType  is ebs, following storage options are applicable  MinimumVolumeSize Minimum amount of volume size that is applicable for given storage type.It can be empty if it is not applicable. MaximumVolumeSize Maximum amount of volume size that is applicable for given storage type.It can be empty if it is not applicable. MaximumIops Maximum amount of Iops that is applicable for given storage type.It can be empty if it is not applicable. MinimumIops Minimum amount of Iops that is applicable for given storage type.It can be empty if it is not applicable.  
    */
  var LimitName: js.UndefOr[typingsSlinky.awsSdk.esMod.LimitName] = js.native
  /**
    *  Values for the  StorageTypeLimit$LimitName  . 
    */
  var LimitValues: js.UndefOr[LimitValueList] = js.native
}

object StorageTypeLimit {
  @scala.inline
  def apply(): StorageTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageTypeLimit]
  }
  @scala.inline
  implicit class StorageTypeLimitOps[Self <: StorageTypeLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimitName(value: LimitName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitName")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitValues(value: LimitValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitValues")(js.undefined)
        ret
    }
  }
  
}

