package typingsSlinky.awsSdkClientS3Node.typesDeleteMarkerEntryMod

import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.Owner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMarkerEntry extends js.Object {
  /**
    * <p>Specifies whether the object is (true) or is not (false) the latest version of an object.</p>
    */
  var IsLatest: js.UndefOr[Boolean] = js.native
  /**
    * <p>The object key.</p>
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * <p>Date and time the object was last modified.</p>
    */
  var LastModified: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesOwnerMod.Owner] = js.native
  /**
    * <p>Version ID of an object.</p>
    */
  var VersionId: js.UndefOr[String] = js.native
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
    def withIsLatest(value: Boolean): Self = {
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
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModified(value: js.Date | String | Double): Self = {
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

