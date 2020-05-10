package typingsSlinky.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata returned for an upload operation.
  */
@js.native
trait SchemaUpload extends js.Object {
  /**
    * Account Id to which this upload belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Custom data source Id to which this data import belongs.
    */
  var customDataSourceId: js.UndefOr[String] = js.native
  /**
    * Data import errors collection.
    */
  var errors: js.UndefOr[js.Array[String]] = js.native
  /**
    * A unique ID for this upload.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics upload.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Upload status. Possible values: PENDING, COMPLETED, FAILED, DELETING,
    * DELETED.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Time this file is uploaded.
    */
  var uploadTime: js.UndefOr[String] = js.native
}

object SchemaUpload {
  @scala.inline
  def apply(): SchemaUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpload]
  }
  @scala.inline
  implicit class SchemaUploadOps[Self <: SchemaUpload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDataSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDataSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadTime")(js.undefined)
        ret
    }
  }
  
}

