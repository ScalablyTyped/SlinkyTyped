package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageType extends js.Object {
  var StorageSubTypeName: js.UndefOr[typingsSlinky.awsSdk.esMod.StorageSubTypeName] = js.native
  /**
    * List of limits that are applicable for given storage type. 
    */
  var StorageTypeLimits: js.UndefOr[StorageTypeLimitList] = js.native
  var StorageTypeName: js.UndefOr[typingsSlinky.awsSdk.esMod.StorageTypeName] = js.native
}

object StorageType {
  @scala.inline
  def apply(): StorageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageType]
  }
  @scala.inline
  implicit class StorageTypeOps[Self <: StorageType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorageSubTypeName(value: StorageSubTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageSubTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageSubTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageSubTypeName")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageTypeLimits(value: StorageTypeLimitList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageTypeLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageTypeLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageTypeLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageTypeName(value: StorageTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageTypeName")(js.undefined)
        ret
    }
  }
  
}

