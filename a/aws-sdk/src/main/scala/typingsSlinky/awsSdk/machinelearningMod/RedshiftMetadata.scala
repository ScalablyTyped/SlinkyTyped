package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftMetadata extends js.Object {
  var DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername] = js.native
  var RedshiftDatabase: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.RedshiftDatabase] = js.native
  /**
    *  The SQL query that is specified during CreateDataSourceFromRedshift. Returns only if Verbose is true in GetDataSourceInput. 
    */
  var SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.native
}

object RedshiftMetadata {
  @scala.inline
  def apply(): RedshiftMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftMetadata]
  }
  @scala.inline
  implicit class RedshiftMetadataOps[Self <: RedshiftMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseUserName(value: RedshiftDatabaseUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseUserName")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshiftDatabase(value: RedshiftDatabase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftDatabase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshiftDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftDatabase")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectSqlQuery(value: RedshiftSelectSqlQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectSqlQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectSqlQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectSqlQuery")(js.undefined)
        ret
    }
  }
  
}

