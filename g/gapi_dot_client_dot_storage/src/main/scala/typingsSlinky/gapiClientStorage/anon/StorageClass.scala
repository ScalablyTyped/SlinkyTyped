package typingsSlinky.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageClass extends js.Object {
  /** Target storage class. Required iff the type of the action is SetStorageClass. */
  var storageClass: js.UndefOr[String] = js.native
  /** Type of the action. Currently, only Delete and SetStorageClass are supported. */
  var `type`: js.UndefOr[String] = js.native
}

object StorageClass {
  @scala.inline
  def apply(): StorageClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageClass]
  }
  @scala.inline
  implicit class StorageClassOps[Self <: StorageClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

