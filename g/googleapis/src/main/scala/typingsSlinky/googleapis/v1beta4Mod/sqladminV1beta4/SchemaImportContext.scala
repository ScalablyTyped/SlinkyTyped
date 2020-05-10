package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import typingsSlinky.googleapis.AnonColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance import context.
  */
@js.native
trait SchemaImportContext extends js.Object {
  /**
    * Options for importing data as CSV.
    */
  var csvImportOptions: js.UndefOr[AnonColumns] = js.native
  /**
    * The target database for the import. If fileType is SQL, this field is
    * required only if the import file does not specify a database, and is
    * overridden by any database specification in the import file. If fileType
    * is CSV, one database must be specified.
    */
  var database: js.UndefOr[String] = js.native
  /**
    * The file type for the specified uri. SQL: The file contains SQL
    * statements. CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * The PostgreSQL user for this import operation. PostgreSQL instances only.
    */
  var importUser: js.UndefOr[String] = js.native
  /**
    * This is always sql#importContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Path to the import file in Cloud Storage, in the form
    * gs://bucketName/fileName. Compressed gzip files (.gz) are supported when
    * fileType is SQL. The instance must have write permissions to the bucket
    * and read access to the file.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaImportContext {
  @scala.inline
  def apply(): SchemaImportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportContext]
  }
  @scala.inline
  implicit class SchemaImportContextOps[Self <: SchemaImportContext] (val x: Self) extends AnyVal {
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

