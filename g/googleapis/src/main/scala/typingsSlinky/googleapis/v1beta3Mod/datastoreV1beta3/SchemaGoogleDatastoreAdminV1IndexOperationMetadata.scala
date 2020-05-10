package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for Index operations.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1IndexOperationMetadata extends js.Object {
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1CommonMetadata] = js.native
  /**
    * The index resource ID that this operation is acting on.
    */
  var indexId: js.UndefOr[String] = js.native
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1Progress] = js.native
}

object SchemaGoogleDatastoreAdminV1IndexOperationMetadata {
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1IndexOperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1IndexOperationMetadataOps[Self <: SchemaGoogleDatastoreAdminV1IndexOperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommon(value: SchemaGoogleDatastoreAdminV1CommonMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexId")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressEntities(value: SchemaGoogleDatastoreAdminV1Progress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressEntities")(js.undefined)
        ret
    }
  }
  
}

