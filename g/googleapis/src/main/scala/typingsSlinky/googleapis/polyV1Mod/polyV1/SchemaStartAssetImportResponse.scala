package typingsSlinky.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message from a request to startImport. This is returned in the
  * response field of the Operation.
  */
@js.native
trait SchemaStartAssetImportResponse extends js.Object {
  /**
    * The id of newly created asset. If this is empty when the operation is
    * complete it means the import failed. Please refer to the
    * assetImportMessages field to understand what went wrong.
    */
  var assetId: js.UndefOr[String] = js.native
  /**
    * The id of the asset import.
    */
  var assetImportId: js.UndefOr[String] = js.native
  /**
    * The message from the asset import. This will contain any warnings (or -
    * in the case of failure - errors) that occurred during import.
    */
  var assetImportMessages: js.UndefOr[js.Array[SchemaAssetImportMessage]] = js.native
  /**
    * The publish URL for the asset.
    */
  var publishUrl: js.UndefOr[String] = js.native
}

object SchemaStartAssetImportResponse {
  @scala.inline
  def apply(): SchemaStartAssetImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartAssetImportResponse]
  }
  @scala.inline
  implicit class SchemaStartAssetImportResponseOps[Self <: SchemaStartAssetImportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetImportId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetImportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetImportId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetImportId")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetImportMessages(value: js.Array[SchemaAssetImportMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetImportMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetImportMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetImportMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishUrl")(js.undefined)
        ret
    }
  }
  
}

