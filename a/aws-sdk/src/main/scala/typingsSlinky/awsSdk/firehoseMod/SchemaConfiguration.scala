package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConfiguration extends js.Object {
  /**
    * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  /**
    * Specifies the name of the AWS Glue database that contains the schema for the output data.
    */
  var DatabaseName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  /**
    * If you don't specify an AWS Region, the default is the current Region.
    */
  var Region: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var RoleARN: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  /**
    * Specifies the AWS Glue table that contains the column information that constitutes your data schema.
    */
  var TableName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  /**
    * Specifies the table version for the output data schema. If you don't specify this version ID, or if you set it to LATEST, Kinesis Data Firehose uses the most recent version. This means that any updates to the table are automatically picked up.
    */
  var VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
}

object SchemaConfiguration {
  @scala.inline
  def apply(): SchemaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfiguration]
  }
  @scala.inline
  implicit class SchemaConfigurationOps[Self <: SchemaConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalogId(value: NonEmptyStringWithoutWhitespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseName(value: NonEmptyStringWithoutWhitespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: NonEmptyStringWithoutWhitespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARN(value: NonEmptyStringWithoutWhitespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: NonEmptyStringWithoutWhitespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: NonEmptyStringWithoutWhitespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

