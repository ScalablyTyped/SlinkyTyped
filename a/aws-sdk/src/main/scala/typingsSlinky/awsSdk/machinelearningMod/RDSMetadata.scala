package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSMetadata extends js.Object {
  /**
    * The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You can use the ID to find details about the instance in the Data Pipeline console.
    */
  var DataPipelineId: js.UndefOr[EDPPipelineId] = js.native
  /**
    * The database details required to connect to an Amazon RDS.
    */
  var Database: js.UndefOr[RDSDatabase] = js.native
  var DatabaseUserName: js.UndefOr[RDSDatabaseUsername] = js.native
  /**
    * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines.
    */
  var ResourceRole: js.UndefOr[EDPResourceRole] = js.native
  /**
    * The SQL query that is supplied during CreateDataSourceFromRDS. Returns only if Verbose is true in GetDataSourceInput. 
    */
  var SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery] = js.native
  /**
    * The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines.
    */
  var ServiceRole: js.UndefOr[EDPServiceRole] = js.native
}

object RDSMetadata {
  @scala.inline
  def apply(): RDSMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RDSMetadata]
  }
  @scala.inline
  implicit class RDSMetadataOps[Self <: RDSMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataPipelineId(value: EDPPipelineId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataPipelineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataPipelineId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataPipelineId")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabase(value: RDSDatabase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Database")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseUserName(value: RDSDatabaseUsername): Self = {
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
    def withResourceRole(value: EDPResourceRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRole")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectSqlQuery(value: RDSSelectSqlQuery): Self = {
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
    @scala.inline
    def withServiceRole(value: EDPServiceRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(js.undefined)
        ret
    }
  }
  
}

