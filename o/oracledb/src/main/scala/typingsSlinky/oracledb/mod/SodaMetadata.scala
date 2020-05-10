package typingsSlinky.oracledb.mod

import typingsSlinky.oracledb.AnonAssignmentMethod
import typingsSlinky.oracledb.AnonCache
import typingsSlinky.oracledb.AnonIndex
import typingsSlinky.oracledb.AnonMethod
import typingsSlinky.oracledb.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata specifying various details about the collection, such as its database storage, whether it should
  * track version and time stamp document components, how such components are generated, and what document
  * types are.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-collection-metadata-components-reference.html#GUID-46E36926-7E6C-4561-A19F-01C09428C56D
  */
@js.native
trait SodaMetadata extends js.Object {
  /** Object containing information related to the content column. */
  var contentColumn: js.UndefOr[AnonCache] = js.native
  /** Object containing information related to the creation time column. */
  var creationTimeColumn: js.UndefOr[AnonName] = js.native
  /** Object containing information related to the key column. */
  var keyColumn: js.UndefOr[AnonAssignmentMethod] = js.native
  /** Object containing information related to the last modified column. */
  var lastModifiedColumn: js.UndefOr[AnonIndex] = js.native
  /** Object containing information related to the media type column. */
  var mediaTypeColumn: js.UndefOr[AnonName] = js.native
  /** Specifies whether or not the collection is read-only. */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Name of the Oracle Database schema that owns the table or view to which the collection is mapped. */
  var schemaName: js.UndefOr[String] = js.native
  /** Name of the table to which the collection is mapped. */
  var tableName: js.UndefOr[String] = js.native
  /** Object containing information related to the version column. */
  var versionColumn: js.UndefOr[AnonMethod] = js.native
  /** Name of the view to which the collection is mapped. */
  var viewName: js.UndefOr[String] = js.native
}

object SodaMetadata {
  @scala.inline
  def apply(): SodaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SodaMetadata]
  }
  @scala.inline
  implicit class SodaMetadataOps[Self <: SodaMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentColumn(value: AnonCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimeColumn(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimeColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimeColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyColumn(value: AnonAssignmentMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedColumn(value: AnonIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaTypeColumn(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypeColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaTypeColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypeColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionColumn(value: AnonMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withViewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewName")(js.undefined)
        ret
    }
  }
  
}

