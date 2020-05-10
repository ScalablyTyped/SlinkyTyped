package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMarkerEntry extends js.Object {
  /**
    * Specifies whether the object is (true) or is not (false) the latest version of an object.
    */
  var IsLatest: js.UndefOr[typingsSlinky.awsSdk.s3Mod.IsLatest] = js.native
  /**
    * The object key.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * Date and time the object was last modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * The account that created the delete marker.&gt;
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Owner] = js.native
  /**
    * Version ID of an object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object DeleteMarkerEntry {
  @scala.inline
  def apply(): DeleteMarkerEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMarkerEntry]
  }
  @scala.inline
  implicit class DeleteMarkerEntryOps[Self <: DeleteMarkerEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLatest(value: IsLatest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLatest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLatest")(js.undefined)
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
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: Owner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
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

