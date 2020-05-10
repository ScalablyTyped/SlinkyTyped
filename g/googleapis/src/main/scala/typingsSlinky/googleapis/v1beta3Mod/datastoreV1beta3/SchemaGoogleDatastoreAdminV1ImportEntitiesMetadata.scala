package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for ImportEntities operations.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1ImportEntitiesMetadata extends js.Object {
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1CommonMetadata] = js.native
  /**
    * Description of which entities are being imported.
    */
  var entityFilter: js.UndefOr[SchemaGoogleDatastoreAdminV1EntityFilter] = js.native
  /**
    * The location of the import metadata file. This will be the same value as
    * the google.datastore.admin.v1.ExportEntitiesResponse.output_url field.
    */
  var inputUrl: js.UndefOr[String] = js.native
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[SchemaGoogleDatastoreAdminV1Progress] = js.native
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1Progress] = js.native
}

object SchemaGoogleDatastoreAdminV1ImportEntitiesMetadata {
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1ImportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ImportEntitiesMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1ImportEntitiesMetadataOps[Self <: SchemaGoogleDatastoreAdminV1ImportEntitiesMetadata] (val x: Self) extends AnyVal {
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
    def withEntityFilter(value: SchemaGoogleDatastoreAdminV1EntityFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withInputUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressBytes(value: SchemaGoogleDatastoreAdminV1Progress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBytes")(js.undefined)
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

