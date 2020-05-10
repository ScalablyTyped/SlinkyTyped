package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceFromRedshiftInput extends js.Object {
  /**
    * The compute statistics for a DataSource. The statistics are generated from the observation data referenced by a DataSource. Amazon ML uses the statistics internally during MLModel training. This parameter must be set to true if the DataSource needs to be used for MLModel training.
    */
  var ComputeStatistics: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.ComputeStatistics] = js.native
  /**
    * A user-supplied ID that uniquely identifies the DataSource.
    */
  var DataSourceId: EntityId = js.native
  /**
    * A user-supplied name or description of the DataSource. 
    */
  var DataSourceName: js.UndefOr[EntityName] = js.native
  /**
    * The data specification of an Amazon Redshift DataSource:  DatabaseInformation -   DatabaseName - The name of the Amazon Redshift database.    ClusterIdentifier - The unique ID for the Amazon Redshift cluster.  DatabaseCredentials - The AWS Identity and Access Management (IAM) credentials that are used to connect to the Amazon Redshift database. SelectSqlQuery - The query that is used to retrieve the observation data for the Datasource. S3StagingLocation - The Amazon Simple Storage Service (Amazon S3) location for staging Amazon Redshift data. The data retrieved from Amazon Redshift using the SelectSqlQuery query is stored in this location. DataSchemaUri - The Amazon S3 location of the DataSchema. DataSchema - A JSON string representing the schema. This is not required if DataSchemaUri is specified.   DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the DataSource.  Sample -  "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"   
    */
  var DataSpec: RedshiftDataSpec = js.native
  /**
    * A fully specified role Amazon Resource Name (ARN). Amazon ML assumes the role on behalf of the user to create the following:    A security group to allow Amazon ML to execute the SelectSqlQuery query on an Amazon Redshift cluster An Amazon S3 bucket policy to grant Amazon ML read/write permissions on the S3StagingLocation  
    */
  var RoleARN: typingsSlinky.awsSdk.machinelearningMod.RoleARN = js.native
}

object CreateDataSourceFromRedshiftInput {
  @scala.inline
  def apply(DataSourceId: EntityId, DataSpec: RedshiftDataSpec, RoleARN: RoleARN): CreateDataSourceFromRedshiftInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], DataSpec = DataSpec.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceFromRedshiftInput]
  }
  @scala.inline
  implicit class CreateDataSourceFromRedshiftInputOps[Self <: CreateDataSourceFromRedshiftInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSpec(value: RedshiftDataSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeStatistics(value: ComputeStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceName")(js.undefined)
        ret
    }
  }
  
}

