package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Difference extends js.Object {
  /**
    * Information about an afterBlob data type object, including the ID, the file mode permission code, and the path.
    */
  var afterBlob: js.UndefOr[BlobMetadata] = js.native
  /**
    * Information about a beforeBlob data type object, including the ID, the file mode permission code, and the path.
    */
  var beforeBlob: js.UndefOr[BlobMetadata] = js.native
  /**
    * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
    */
  var changeType: js.UndefOr[ChangeTypeEnum] = js.native
}

object Difference {
  @scala.inline
  def apply(): Difference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Difference]
  }
  @scala.inline
  implicit class DifferenceOps[Self <: Difference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterBlob(value: BlobMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBlob")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBlob(value: BlobMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlob")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeType(value: ChangeTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(js.undefined)
        ret
    }
  }
  
}

