package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClientSqladmin.AnonColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportContext extends js.Object {
  /** Options for importing data as CSV. */
  var csvImportOptions: js.UndefOr[AnonColumns] = js.native
  /**
    * The database (for example, guestbook) to which the import is made. If fileType is SQL and no database is specified, it is assumed that the database is
    * specified in the file to be imported. If fileType is CSV, it must be specified.
    */
  var database: js.UndefOr[String] = js.native
  /**
    * The file type for the specified uri.
    * SQL: The file contains SQL statements.
    * CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[String] = js.native
  /** The PostgreSQL user for this import operation. Defaults to cloudsqlsuperuser. Used only for PostgreSQL instances. */
  var importUser: js.UndefOr[String] = js.native
  /** This is always sql#importContext. */
  var kind: js.UndefOr[String] = js.native
  /**
    * A path to the file in Google Cloud Storage from which the import is made. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz)
    * are supported when fileType is SQL.
    */
  var uri: js.UndefOr[String] = js.native
}

object ImportContext {
  @scala.inline
  def apply(): ImportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportContext]
  }
  @scala.inline
  implicit class ImportContextOps[Self <: ImportContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsvImportOptions(value: AnonColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvImportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvImportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvImportOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.undefined)
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
    def withImportUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importUser")(js.undefined)
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

