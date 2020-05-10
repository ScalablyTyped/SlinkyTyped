package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageInfo extends js.Object {
  /**
    * 
    EBS volume information.
    
    */
  var EbsStorageInfo: js.UndefOr[EBSStorageInfo] = js.native
}

object StorageInfo {
  @scala.inline
  def apply(): StorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageInfo]
  }
  @scala.inline
  implicit class StorageInfoOps[Self <: StorageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEbsStorageInfo(value: EBSStorageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsStorageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsStorageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsStorageInfo")(js.undefined)
        ret
    }
  }
  
}

