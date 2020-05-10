package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleDatastoreAdminV1beta1ExportEntitiesMetadata extends js.Object {
  /** Metadata common to all Datastore Admin operations. */
  var common: js.UndefOr[GoogleDatastoreAdminV1beta1CommonMetadata] = js.native
  /** Description of which entities are being exported. */
  var entityFilter: js.UndefOr[GoogleDatastoreAdminV1beta1EntityFilter] = js.native
  /**
    * Location for the export metadata and data files. This will be the same
    * value as the
    * google.datastore.admin.v1beta1.ExportEntitiesRequest.output_url_prefix
    * field. The final output location is provided in
    * google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url.
    */
  var outputUrlPrefix: js.UndefOr[String] = js.native
  /** An estimate of the number of bytes processed. */
  var progressBytes: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.native
  /** An estimate of the number of entities processed. */
  var progressEntities: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.native
}

object GoogleDatastoreAdminV1beta1ExportEntitiesMetadata {
  @scala.inline
  def apply(): GoogleDatastoreAdminV1beta1ExportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1ExportEntitiesMetadata]
  }
  @scala.inline
  implicit class GoogleDatastoreAdminV1beta1ExportEntitiesMetadataOps[Self <: GoogleDatastoreAdminV1beta1ExportEntitiesMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommon(value: GoogleDatastoreAdminV1beta1CommonMetadata): Self = {
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
    def withEntityFilter(value: GoogleDatastoreAdminV1beta1EntityFilter): Self = {
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
    def withOutputUrlPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUrlPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUrlPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUrlPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressBytes(value: GoogleDatastoreAdminV1beta1Progress): Self = {
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
    def withProgressEntities(value: GoogleDatastoreAdminV1beta1Progress): Self = {
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

