package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageRuleType extends js.Object {
  /**
    * The amount of storage allocated, in bytes.
    */
  var StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.native
  /**
    * The type of storage.
    */
  var StorageType: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.StorageType] = js.native
}

object StorageRuleType {
  @scala.inline
  def apply(): StorageRuleType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageRuleType]
  }
  @scala.inline
  implicit class StorageRuleTypeOps[Self <: StorageRuleType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorageAllocatedInBytes(value: PositiveSizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageAllocatedInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageAllocatedInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageAllocatedInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageType(value: StorageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(js.undefined)
        ret
    }
  }
  
}

