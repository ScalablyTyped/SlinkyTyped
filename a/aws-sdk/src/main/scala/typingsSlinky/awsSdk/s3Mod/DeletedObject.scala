package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletedObject extends js.Object {
  /**
    * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker. In a simple DELETE, this header indicates whether (true) or not (false) a delete marker was created.
    */
  var DeleteMarker: js.UndefOr[typingsSlinky.awsSdk.s3Mod.DeleteMarker] = js.native
  /**
    * The version ID of the delete marker created as a result of the DELETE operation. If you delete a specific object version, the value returned by this header is the version ID of the object version deleted.
    */
  var DeleteMarkerVersionId: js.UndefOr[typingsSlinky.awsSdk.s3Mod.DeleteMarkerVersionId] = js.native
  /**
    * The name of the deleted object.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * The version ID of the deleted object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object DeletedObject {
  @scala.inline
  def apply(): DeletedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletedObject]
  }
  @scala.inline
  implicit class DeletedObjectOps[Self <: DeletedObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteMarker(value: DeleteMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteMarkerVersionId(value: DeleteMarkerVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarkerVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteMarkerVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarkerVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: ObjectKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: ObjectVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

