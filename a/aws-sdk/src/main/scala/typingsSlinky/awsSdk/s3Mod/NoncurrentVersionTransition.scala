package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoncurrentVersionTransition extends js.Object {
  /**
    * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates How Long an Object Has Been Noncurrent in the Amazon Simple Storage Service Developer Guide.
    */
  var NoncurrentDays: js.UndefOr[Days] = js.native
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[TransitionStorageClass] = js.native
}

object NoncurrentVersionTransition {
  @scala.inline
  def apply(): NoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoncurrentVersionTransition]
  }
  @scala.inline
  implicit class NoncurrentVersionTransitionOps[Self <: NoncurrentVersionTransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoncurrentDays(value: Days): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoncurrentDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoncurrentDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoncurrentDays")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClass(value: TransitionStorageClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(js.undefined)
        ret
    }
  }
  
}

