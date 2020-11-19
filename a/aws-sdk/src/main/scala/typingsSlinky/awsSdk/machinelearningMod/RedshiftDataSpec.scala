package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftDataSpec extends js.Object {
  
  /**
    * A JSON string that represents the splitting and rearrangement processing to be applied to a DataSource. If the DataRearrangement parameter is not provided, all of the input data is used to create the Datasource. There are multiple parameters that control what data is used to create a datasource:  percentBegin Use percentBegin to indicate the beginning of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource. percentEnd Use percentEnd to indicate the end of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource. complement The complement parameter instructs Amazon ML to use the data that is not included in the range of percentBegin to percentEnd to create a datasource. The complement parameter is useful if you need to create complementary datasources for training and evaluation. To create a complementary datasource, use the same values for percentBegin and percentEnd, along with the complement parameter. For example, the following two datasources do not share any data, and can be used to train and evaluate a model. The first datasource has 25 percent of the data, and the second one has 75 percent of the data. Datasource for evaluation: {"splitting":{"percentBegin":0, "percentEnd":25}} Datasource for training: {"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}  strategy To change how Amazon ML splits the data for a datasource, use the strategy parameter. The default value for the strategy parameter is sequential, meaning that Amazon ML takes all of the data records between the percentBegin and percentEnd parameters for the datasource, in the order that the records appear in the input data. The following two DataRearrangement lines are examples of sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}} Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}} To randomly split the input data into the proportions indicated by the percentBegin and percentEnd parameters, set the strategy parameter to random and provide a string that is used as the seed value for the random data splitting (for example, you can use the S3 path to your data as the random seed string). If you choose the random split strategy, Amazon ML assigns each row of data a pseudo-random number between 0 and 100, and then selects the rows that have an assigned number between percentBegin and percentEnd. Pseudo-random numbers are assigned using both the input seed string value and the byte offset as a seed, so changing the data results in a different split. Any existing ordering is preserved. The random splitting strategy ensures that variables in the training and evaluation data are distributed similarly. It is useful in the cases where the input data may have an implicit sort order, which would otherwise result in training and evaluation datasources containing non-similar data records. The following two DataRearrangement lines are examples of non-sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}} Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}  
    */
  var DataRearrangement: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.DataRearrangement] = js.native
  
  /**
    * A JSON string that represents the schema for an Amazon Redshift DataSource. The DataSchema defines the structure of the observation data in the data file(s) referenced in the DataSource. A DataSchema is not required if you specify a DataSchemaUri. Define your DataSchema as a series of key-value pairs. attributes and excludedVariableNames have an array of key-value pairs for their value. Use the following format to define your DataSchema. { "version": "1.0",  "recordAnnotationFieldName": "F1",  "recordWeightFieldName": "F2",  "targetFieldName": "F3",  "dataFormat": "CSV",  "dataFileContainsHeader": true,  "attributes": [  { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5", "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType": "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],  "excludedVariableNames": [ "F6" ] } 
    */
  var DataSchema: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.DataSchema] = js.native
  
  /**
    * Describes the schema location for an Amazon Redshift DataSource.
    */
  var DataSchemaUri: js.UndefOr[S3Url] = js.native
  
  /**
    * Describes AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon Redshift database.
    */
  var DatabaseCredentials: RedshiftDatabaseCredentials = js.native
  
  /**
    * Describes the DatabaseName and ClusterIdentifier for an Amazon Redshift DataSource.
    */
  var DatabaseInformation: RedshiftDatabase = js.native
  
  /**
    * Describes an Amazon S3 location to store the result set of the SelectSqlQuery query.
    */
  var S3StagingLocation: S3Url = js.native
  
  /**
    * Describes the SQL Query to execute on an Amazon Redshift database for an Amazon Redshift DataSource.
    */
  var SelectSqlQuery: RedshiftSelectSqlQuery = js.native
}
object RedshiftDataSpec {
  
  @scala.inline
  def apply(
    DatabaseCredentials: RedshiftDatabaseCredentials,
    DatabaseInformation: RedshiftDatabase,
    S3StagingLocation: S3Url,
    SelectSqlQuery: RedshiftSelectSqlQuery
  ): RedshiftDataSpec = {
    val __obj = js.Dynamic.literal(DatabaseCredentials = DatabaseCredentials.asInstanceOf[js.Any], DatabaseInformation = DatabaseInformation.asInstanceOf[js.Any], S3StagingLocation = S3StagingLocation.asInstanceOf[js.Any], SelectSqlQuery = SelectSqlQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDataSpec]
  }
  
  @scala.inline
  implicit class RedshiftDataSpecOps[Self <: RedshiftDataSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatabaseCredentials(value: RedshiftDatabaseCredentials): Self = this.set("DatabaseCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseInformation(value: RedshiftDatabase): Self = this.set("DatabaseInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3StagingLocation(value: S3Url): Self = this.set("S3StagingLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectSqlQuery(value: RedshiftSelectSqlQuery): Self = this.set("SelectSqlQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRearrangement(value: DataRearrangement): Self = this.set("DataRearrangement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRearrangement: Self = this.set("DataRearrangement", js.undefined)
    
    @scala.inline
    def setDataSchema(value: DataSchema): Self = this.set("DataSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSchema: Self = this.set("DataSchema", js.undefined)
    
    @scala.inline
    def setDataSchemaUri(value: S3Url): Self = this.set("DataSchemaUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSchemaUri: Self = this.set("DataSchemaUri", js.undefined)
  }
}
