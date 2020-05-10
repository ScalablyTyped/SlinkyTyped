package typingsSlinky.awsSdkClientS3Node.typesDeletedObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletedObject extends js.Object {
  /**
    * _DeleteMarker shape
    */
  var DeleteMarker: js.UndefOr[Boolean] = js.native
  /**
    * _DeleteMarkerVersionId shape
    */
  var DeleteMarkerVersionId: js.UndefOr[String] = js.native
  /**
    * _ObjectKey shape
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * _ObjectVersionId shape
    */
  var VersionId: js.UndefOr[String] = js.native
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
    def withDeleteMarker(value: Boolean): Self = {
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
    def withDeleteMarkerVersionId(value: String): Self = {
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
    def withKey(value: String): Self = {
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
    def withVersionId(value: String): Self = {
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

