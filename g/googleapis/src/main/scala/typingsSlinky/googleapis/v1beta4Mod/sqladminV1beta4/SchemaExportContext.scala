package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import typingsSlinky.googleapis.AnonMysqlExportOptions
import typingsSlinky.googleapis.AnonSelectQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance export context.
  */
@js.native
trait SchemaExportContext extends js.Object {
  /**
    * Options for exporting data as CSV.
    */
  var csvExportOptions: js.UndefOr[AnonSelectQuery] = js.native
  /**
    * Databases to be exported. MySQL instances: If fileType is SQL and no
    * database is specified, all databases are exported, except for the mysql
    * system database. If fileType is CSV, you can specify one database, either
    * by using this property or by using the csvExportOptions.selectQuery
    * property, which takes precedence over this property. PostgreSQL
    * instances: Specify exactly one database to be exported. If fileType is
    * CSV, this database must match the database used in the
    * csvExportOptions.selectQuery property.
    */
  var databases: js.UndefOr[js.Array[String]] = js.native
  /**
    * The file type for the specified uri. SQL: The file contains SQL
    * statements. CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * This is always sql#exportContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Options for exporting data as SQL statements.
    */
  var sqlExportOptions: js.UndefOr[AnonMysqlExportOptions] = js.native
  /**
    * The path to the file in Google Cloud Storage where the export will be
    * stored. The URI is in the form gs://bucketName/fileName. If the file
    * already exists, the requests succeeds, but the operation fails. If
    * fileType is SQL and the filename ends with .gz, the contents are
    * compressed.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaExportContext {
  @scala.inline
  def apply(): SchemaExportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportContext]
  }
  @scala.inline
  implicit class SchemaExportContextOps[Self <: SchemaExportContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsvExportOptions(value: AnonSelectQuery): Self = {
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
    def withSqlExportOptions(value: AnonMysqlExportOptions): Self = {
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

