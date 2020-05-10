package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskMap extends js.Object {
  /**
    * The new disk name (e.g., my-new-disk).
    */
  var newDiskName: js.UndefOr[ResourceName] = js.native
  /**
    * The original disk path exposed to the instance (for example, /dev/sdh).
    */
  var originalDiskPath: js.UndefOr[NonEmptyString] = js.native
}

object DiskMap {
  @scala.inline
  def apply(): DiskMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskMap]
  }
  @scala.inline
  implicit class DiskMapOps[Self <: DiskMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewDiskName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDiskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewDiskName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDiskName")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalDiskPath(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalDiskPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalDiskPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalDiskPath")(js.undefined)
        ret
    }
  }
  
}

