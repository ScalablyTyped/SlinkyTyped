package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserStorageMetadata extends js.Object {
  /**
    * The storage for a user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.native
  /**
    * The amount of storage used, in bytes.
    */
  var StorageUtilizedInBytes: js.UndefOr[SizeType] = js.native
}

object UserStorageMetadata {
  @scala.inline
  def apply(): UserStorageMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserStorageMetadata]
  }
  @scala.inline
  implicit class UserStorageMetadataOps[Self <: UserStorageMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorageRule(value: StorageRuleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageRule")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageUtilizedInBytes(value: SizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageUtilizedInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageUtilizedInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageUtilizedInBytes")(js.undefined)
        ret
    }
  }
  
}

