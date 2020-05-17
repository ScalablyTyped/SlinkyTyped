package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClientSqladmin.anon.SchemaOnly
import typingsSlinky.gapiClientSqladmin.anon.SelectQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportContext extends js.Object {
  /** Options for exporting data as CSV. */
  var csvExportOptions: js.UndefOr[SelectQuery] = js.native
  /**
    * Databases (for example, guestbook) from which the export is made. If fileType is SQL and no database is specified, all databases are exported. If
    * fileType is CSV, you can optionally specify at most one database to export. If csvExportOptions.selectQuery also specifies the database, this field
    * will be ignored.
    */
  var databases: js.UndefOr[js.Array[String]] = js.native
  /**
    * The file type for the specified uri.
    * SQL: The file contains SQL statements.
    * CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[String] = js.native
  /** This is always sql#exportContext. */
  var kind: js.UndefOr[String] = js.native
  /** Options for exporting data as SQL statements. */
  var sqlExportOptions: js.UndefOr[SchemaOnly] = js.native
  /**
    * The path to the file in Google Cloud Storage where the export will be stored. The URI is in the form gs://bucketName/fileName. If the file already
    * exists, the operation fails. If fileType is SQL and the filename ends with .gz, the contents are compressed.
    */
  var uri: js.UndefOr[String] = js.native
}

object ExportContext {
  @scala.inline
  def apply(): ExportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportContext]
  }
  @scala.inline
  implicit class ExportContextOps[Self <: ExportContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsvExportOptions(value: SelectQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvExportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvExportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvExportOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databases")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
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
    def withSqlExportOptions(value: SchemaOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlExportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlExportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlExportOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

