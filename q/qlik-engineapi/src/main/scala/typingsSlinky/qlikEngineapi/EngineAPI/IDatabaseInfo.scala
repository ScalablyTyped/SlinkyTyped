package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DatabaseInfo...
  */
@js.native
trait IDatabaseInfo extends js.Object {
  /**
    *  If set to true, it means that the database is displayed first, before the owners and tables.
    */
  var qDBFirst: Boolean = js.native
  /**
    * Name of the product accessed by the provider
    */
  var qDBMSName: String = js.native
  /**
    * Character string used after the database name
    * Example with separator ".":
    * FROM LinkedTablesData.dbo.Months
    * Where:
    *       - LinkedTablesData is the database name
    *       - dbo is the owner name
    *       - Months is the table name
    */
  var qDBSeparator: String = js.native
  /**
    * If set to true, it means that the data source contains some databases.
    */
  var qDBUsage: Boolean = js.native
  /**
    * Name of the default database
    */
  var qDefaultDatabase: String = js.native
  /**
    * List of the script keywords
    */
  var qKeywords: js.Array[String] = js.native
  /**
    * Character string used after the owner name
    * Example with separator ".":
    * FROM LinkedTablesData.dbo.Months
    * Where:
    *       - LinkedTablesData is the database name
    *       - dbo is the owner name
    *       - Months is the table name
    */
  var qOwnerSeparator: String = js.native
  /**
    * If set to true, it means that the data source contains some owners.
    */
  var qOwnerUsage: Boolean = js.native
  /**
    * Prefix used with field, database or owner names that contain special characters or keywords.
    */
  var qQuotePreffix: String = js.native
  /**
    * Suffix used with field, database or owner names that contain special characters or keywords.
    */
  var qQuoteSuffix: String = js.native
  /**
    * List of the special characters
    */
  var qSpecialChars: String = js.native
}

object IDatabaseInfo {
  @scala.inline
  def apply(
    qDBFirst: Boolean,
    qDBMSName: String,
    qDBSeparator: String,
    qDBUsage: Boolean,
    qDefaultDatabase: String,
    qKeywords: js.Array[String],
    qOwnerSeparator: String,
    qOwnerUsage: Boolean,
    qQuotePreffix: String,
    qQuoteSuffix: String,
    qSpecialChars: String
  ): IDatabaseInfo = {
    val __obj = js.Dynamic.literal(qDBFirst = qDBFirst.asInstanceOf[js.Any], qDBMSName = qDBMSName.asInstanceOf[js.Any], qDBSeparator = qDBSeparator.asInstanceOf[js.Any], qDBUsage = qDBUsage.asInstanceOf[js.Any], qDefaultDatabase = qDefaultDatabase.asInstanceOf[js.Any], qKeywords = qKeywords.asInstanceOf[js.Any], qOwnerSeparator = qOwnerSeparator.asInstanceOf[js.Any], qOwnerUsage = qOwnerUsage.asInstanceOf[js.Any], qQuotePreffix = qQuotePreffix.asInstanceOf[js.Any], qQuoteSuffix = qQuoteSuffix.asInstanceOf[js.Any], qSpecialChars = qSpecialChars.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatabaseInfo]
  }
  @scala.inline
  implicit class IDatabaseInfoOps[Self <: IDatabaseInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDBFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDBFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDBMSName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDBMSName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDBSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDBSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDBUsage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDBUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDefaultDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDefaultDatabase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOwnerSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOwnerSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOwnerUsage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOwnerUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQQuotePreffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qQuotePreffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQQuoteSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qQuoteSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSpecialChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSpecialChars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

