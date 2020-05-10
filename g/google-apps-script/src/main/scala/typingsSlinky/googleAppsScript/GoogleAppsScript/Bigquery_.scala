package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Collection.DatasetsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Collection.JobsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Collection.ProjectsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Collection.TabledataCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Collection.TablesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigQueryModelTraining
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigtableColumn
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigtableColumnFamily
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigtableOptions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BqmlIterationResult
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BqmlTrainingRun
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BqmlTrainingRunTrainingOptions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Clustering
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.CsvOptions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Dataset
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.DatasetAccess
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.DatasetReference
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.DestinationTableProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.EncryptionConfiguration
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ErrorProto
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ExplainQueryStage
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ExplainQueryStep
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ExternalDataConfiguration
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.GoogleSheetsOptions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Job
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfiguration
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationExtract
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationLoad
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationQuery
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationTableCopy
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobReference
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics2
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics2ReservationUsage
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics3
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics4
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatisticsReservationUsage
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatus
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.MaterializedViewDefinition
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ModelDefinition
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ModelDefinitionModelOptions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameter
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameterType
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameterTypeStructTypes
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameterValue
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryTimelineSample
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.RangePartitioning
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.RangePartitioningRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.RoutineReference
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Streamingbuffer
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Table
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableDataInsertAllRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableDataInsertAllRequestRows
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableFieldSchema
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableFieldSchemaCategories
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableReference
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableSchema
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TimePartitioning
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.UserDefinedFunctionResource
import typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ViewDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bigquery_ extends js.Object {
  var Datasets: js.UndefOr[DatasetsCollection] = js.native
  var Jobs: js.UndefOr[JobsCollection] = js.native
  var Projects: js.UndefOr[ProjectsCollection] = js.native
  var Tabledata: js.UndefOr[TabledataCollection] = js.native
  var Tables: js.UndefOr[TablesCollection] = js.native
  // Create a new instance of BigQueryModelTraining
  def newBigQueryModelTraining(): BigQueryModelTraining = js.native
  // Create a new instance of BigtableColumn
  def newBigtableColumn(): BigtableColumn = js.native
  // Create a new instance of BigtableColumnFamily
  def newBigtableColumnFamily(): BigtableColumnFamily = js.native
  // Create a new instance of BigtableOptions
  def newBigtableOptions(): BigtableOptions = js.native
  // Create a new instance of BqmlIterationResult
  def newBqmlIterationResult(): BqmlIterationResult = js.native
  // Create a new instance of BqmlTrainingRun
  def newBqmlTrainingRun(): BqmlTrainingRun = js.native
  // Create a new instance of BqmlTrainingRunTrainingOptions
  def newBqmlTrainingRunTrainingOptions(): BqmlTrainingRunTrainingOptions = js.native
  // Create a new instance of Clustering
  def newClustering(): Clustering = js.native
  // Create a new instance of CsvOptions
  def newCsvOptions(): CsvOptions = js.native
  // Create a new instance of Dataset
  def newDataset(): Dataset = js.native
  // Create a new instance of DatasetAccess
  def newDatasetAccess(): DatasetAccess = js.native
  // Create a new instance of DatasetReference
  def newDatasetReference(): DatasetReference = js.native
  // Create a new instance of DestinationTableProperties
  def newDestinationTableProperties(): DestinationTableProperties = js.native
  // Create a new instance of EncryptionConfiguration
  def newEncryptionConfiguration(): EncryptionConfiguration = js.native
  // Create a new instance of ErrorProto
  def newErrorProto(): ErrorProto = js.native
  // Create a new instance of ExplainQueryStage
  def newExplainQueryStage(): ExplainQueryStage = js.native
  // Create a new instance of ExplainQueryStep
  def newExplainQueryStep(): ExplainQueryStep = js.native
  // Create a new instance of ExternalDataConfiguration
  def newExternalDataConfiguration(): ExternalDataConfiguration = js.native
  // Create a new instance of GoogleSheetsOptions
  def newGoogleSheetsOptions(): GoogleSheetsOptions = js.native
  // Create a new instance of Job
  def newJob(): Job = js.native
  // Create a new instance of JobConfiguration
  def newJobConfiguration(): JobConfiguration = js.native
  // Create a new instance of JobConfigurationExtract
  def newJobConfigurationExtract(): JobConfigurationExtract = js.native
  // Create a new instance of JobConfigurationLoad
  def newJobConfigurationLoad(): JobConfigurationLoad = js.native
  // Create a new instance of JobConfigurationQuery
  def newJobConfigurationQuery(): JobConfigurationQuery = js.native
  // Create a new instance of JobConfigurationTableCopy
  def newJobConfigurationTableCopy(): JobConfigurationTableCopy = js.native
  // Create a new instance of JobReference
  def newJobReference(): JobReference = js.native
  // Create a new instance of JobStatistics
  def newJobStatistics(): JobStatistics = js.native
  // Create a new instance of JobStatistics2
  def newJobStatistics2(): JobStatistics2 = js.native
  // Create a new instance of JobStatistics2ReservationUsage
  def newJobStatistics2ReservationUsage(): JobStatistics2ReservationUsage = js.native
  // Create a new instance of JobStatistics3
  def newJobStatistics3(): JobStatistics3 = js.native
  // Create a new instance of JobStatistics4
  def newJobStatistics4(): JobStatistics4 = js.native
  // Create a new instance of JobStatisticsReservationUsage
  def newJobStatisticsReservationUsage(): JobStatisticsReservationUsage = js.native
  // Create a new instance of JobStatus
  def newJobStatus(): JobStatus = js.native
  // Create a new instance of MaterializedViewDefinition
  def newMaterializedViewDefinition(): MaterializedViewDefinition = js.native
  // Create a new instance of ModelDefinition
  def newModelDefinition(): ModelDefinition = js.native
  // Create a new instance of ModelDefinitionModelOptions
  def newModelDefinitionModelOptions(): ModelDefinitionModelOptions = js.native
  // Create a new instance of QueryParameter
  def newQueryParameter(): QueryParameter = js.native
  // Create a new instance of QueryParameterType
  def newQueryParameterType(): QueryParameterType = js.native
  // Create a new instance of QueryParameterTypeStructTypes
  def newQueryParameterTypeStructTypes(): QueryParameterTypeStructTypes = js.native
  // Create a new instance of QueryParameterValue
  def newQueryParameterValue(): QueryParameterValue = js.native
  // Create a new instance of QueryRequest
  def newQueryRequest(): QueryRequest = js.native
  // Create a new instance of QueryTimelineSample
  def newQueryTimelineSample(): QueryTimelineSample = js.native
  // Create a new instance of RangePartitioning
  def newRangePartitioning(): RangePartitioning = js.native
  // Create a new instance of RangePartitioningRange
  def newRangePartitioningRange(): RangePartitioningRange = js.native
  // Create a new instance of RoutineReference
  def newRoutineReference(): RoutineReference = js.native
  // Create a new instance of Streamingbuffer
  def newStreamingbuffer(): Streamingbuffer = js.native
  // Create a new instance of Table
  def newTable(): Table = js.native
  // Create a new instance of TableDataInsertAllRequest
  def newTableDataInsertAllRequest(): TableDataInsertAllRequest = js.native
  // Create a new instance of TableDataInsertAllRequestRows
  def newTableDataInsertAllRequestRows(): TableDataInsertAllRequestRows = js.native
  // Create a new instance of TableFieldSchema
  def newTableFieldSchema(): TableFieldSchema = js.native
  // Create a new instance of TableFieldSchemaCategories
  def newTableFieldSchemaCategories(): TableFieldSchemaCategories = js.native
  // Create a new instance of TableReference
  def newTableReference(): TableReference = js.native
  // Create a new instance of TableSchema
  def newTableSchema(): TableSchema = js.native
  // Create a new instance of TimePartitioning
  def newTimePartitioning(): TimePartitioning = js.native
  // Create a new instance of UserDefinedFunctionResource
  def newUserDefinedFunctionResource(): UserDefinedFunctionResource = js.native
  // Create a new instance of ViewDefinition
  def newViewDefinition(): ViewDefinition = js.native
}

object Bigquery_ {
  @scala.inline
  def apply(
    newBigQueryModelTraining: () => BigQueryModelTraining,
    newBigtableColumn: () => BigtableColumn,
    newBigtableColumnFamily: () => BigtableColumnFamily,
    newBigtableOptions: () => BigtableOptions,
    newBqmlIterationResult: () => BqmlIterationResult,
    newBqmlTrainingRun: () => BqmlTrainingRun,
    newBqmlTrainingRunTrainingOptions: () => BqmlTrainingRunTrainingOptions,
    newClustering: () => Clustering,
    newCsvOptions: () => CsvOptions,
    newDataset: () => Dataset,
    newDatasetAccess: () => DatasetAccess,
    newDatasetReference: () => DatasetReference,
    newDestinationTableProperties: () => DestinationTableProperties,
    newEncryptionConfiguration: () => EncryptionConfiguration,
    newErrorProto: () => ErrorProto,
    newExplainQueryStage: () => ExplainQueryStage,
    newExplainQueryStep: () => ExplainQueryStep,
    newExternalDataConfiguration: () => ExternalDataConfiguration,
    newGoogleSheetsOptions: () => GoogleSheetsOptions,
    newJob: () => Job,
    newJobConfiguration: () => JobConfiguration,
    newJobConfigurationExtract: () => JobConfigurationExtract,
    newJobConfigurationLoad: () => JobConfigurationLoad,
    newJobConfigurationQuery: () => JobConfigurationQuery,
    newJobConfigurationTableCopy: () => JobConfigurationTableCopy,
    newJobReference: () => JobReference,
    newJobStatistics: () => JobStatistics,
    newJobStatistics2: () => JobStatistics2,
    newJobStatistics2ReservationUsage: () => JobStatistics2ReservationUsage,
    newJobStatistics3: () => JobStatistics3,
    newJobStatistics4: () => JobStatistics4,
    newJobStatisticsReservationUsage: () => JobStatisticsReservationUsage,
    newJobStatus: () => JobStatus,
    newMaterializedViewDefinition: () => MaterializedViewDefinition,
    newModelDefinition: () => ModelDefinition,
    newModelDefinitionModelOptions: () => ModelDefinitionModelOptions,
    newQueryParameter: () => QueryParameter,
    newQueryParameterType: () => QueryParameterType,
    newQueryParameterTypeStructTypes: () => QueryParameterTypeStructTypes,
    newQueryParameterValue: () => QueryParameterValue,
    newQueryRequest: () => QueryRequest,
    newQueryTimelineSample: () => QueryTimelineSample,
    newRangePartitioning: () => RangePartitioning,
    newRangePartitioningRange: () => RangePartitioningRange,
    newRoutineReference: () => RoutineReference,
    newStreamingbuffer: () => Streamingbuffer,
    newTable: () => Table,
    newTableDataInsertAllRequest: () => TableDataInsertAllRequest,
    newTableDataInsertAllRequestRows: () => TableDataInsertAllRequestRows,
    newTableFieldSchema: () => TableFieldSchema,
    newTableFieldSchemaCategories: () => TableFieldSchemaCategories,
    newTableReference: () => TableReference,
    newTableSchema: () => TableSchema,
    newTimePartitioning: () => TimePartitioning,
    newUserDefinedFunctionResource: () => UserDefinedFunctionResource,
    newViewDefinition: () => ViewDefinition
  ): Bigquery_ = {
    val __obj = js.Dynamic.literal(newBigQueryModelTraining = js.Any.fromFunction0(newBigQueryModelTraining), newBigtableColumn = js.Any.fromFunction0(newBigtableColumn), newBigtableColumnFamily = js.Any.fromFunction0(newBigtableColumnFamily), newBigtableOptions = js.Any.fromFunction0(newBigtableOptions), newBqmlIterationResult = js.Any.fromFunction0(newBqmlIterationResult), newBqmlTrainingRun = js.Any.fromFunction0(newBqmlTrainingRun), newBqmlTrainingRunTrainingOptions = js.Any.fromFunction0(newBqmlTrainingRunTrainingOptions), newClustering = js.Any.fromFunction0(newClustering), newCsvOptions = js.Any.fromFunction0(newCsvOptions), newDataset = js.Any.fromFunction0(newDataset), newDatasetAccess = js.Any.fromFunction0(newDatasetAccess), newDatasetReference = js.Any.fromFunction0(newDatasetReference), newDestinationTableProperties = js.Any.fromFunction0(newDestinationTableProperties), newEncryptionConfiguration = js.Any.fromFunction0(newEncryptionConfiguration), newErrorProto = js.Any.fromFunction0(newErrorProto), newExplainQueryStage = js.Any.fromFunction0(newExplainQueryStage), newExplainQueryStep = js.Any.fromFunction0(newExplainQueryStep), newExternalDataConfiguration = js.Any.fromFunction0(newExternalDataConfiguration), newGoogleSheetsOptions = js.Any.fromFunction0(newGoogleSheetsOptions), newJob = js.Any.fromFunction0(newJob), newJobConfiguration = js.Any.fromFunction0(newJobConfiguration), newJobConfigurationExtract = js.Any.fromFunction0(newJobConfigurationExtract), newJobConfigurationLoad = js.Any.fromFunction0(newJobConfigurationLoad), newJobConfigurationQuery = js.Any.fromFunction0(newJobConfigurationQuery), newJobConfigurationTableCopy = js.Any.fromFunction0(newJobConfigurationTableCopy), newJobReference = js.Any.fromFunction0(newJobReference), newJobStatistics = js.Any.fromFunction0(newJobStatistics), newJobStatistics2 = js.Any.fromFunction0(newJobStatistics2), newJobStatistics2ReservationUsage = js.Any.fromFunction0(newJobStatistics2ReservationUsage), newJobStatistics3 = js.Any.fromFunction0(newJobStatistics3), newJobStatistics4 = js.Any.fromFunction0(newJobStatistics4), newJobStatisticsReservationUsage = js.Any.fromFunction0(newJobStatisticsReservationUsage), newJobStatus = js.Any.fromFunction0(newJobStatus), newMaterializedViewDefinition = js.Any.fromFunction0(newMaterializedViewDefinition), newModelDefinition = js.Any.fromFunction0(newModelDefinition), newModelDefinitionModelOptions = js.Any.fromFunction0(newModelDefinitionModelOptions), newQueryParameter = js.Any.fromFunction0(newQueryParameter), newQueryParameterType = js.Any.fromFunction0(newQueryParameterType), newQueryParameterTypeStructTypes = js.Any.fromFunction0(newQueryParameterTypeStructTypes), newQueryParameterValue = js.Any.fromFunction0(newQueryParameterValue), newQueryRequest = js.Any.fromFunction0(newQueryRequest), newQueryTimelineSample = js.Any.fromFunction0(newQueryTimelineSample), newRangePartitioning = js.Any.fromFunction0(newRangePartitioning), newRangePartitioningRange = js.Any.fromFunction0(newRangePartitioningRange), newRoutineReference = js.Any.fromFunction0(newRoutineReference), newStreamingbuffer = js.Any.fromFunction0(newStreamingbuffer), newTable = js.Any.fromFunction0(newTable), newTableDataInsertAllRequest = js.Any.fromFunction0(newTableDataInsertAllRequest), newTableDataInsertAllRequestRows = js.Any.fromFunction0(newTableDataInsertAllRequestRows), newTableFieldSchema = js.Any.fromFunction0(newTableFieldSchema), newTableFieldSchemaCategories = js.Any.fromFunction0(newTableFieldSchemaCategories), newTableReference = js.Any.fromFunction0(newTableReference), newTableSchema = js.Any.fromFunction0(newTableSchema), newTimePartitioning = js.Any.fromFunction0(newTimePartitioning), newUserDefinedFunctionResource = js.Any.fromFunction0(newUserDefinedFunctionResource), newViewDefinition = js.Any.fromFunction0(newViewDefinition))
    __obj.asInstanceOf[Bigquery_]
  }
  @scala.inline
  implicit class Bigquery_Ops[Self <: Bigquery_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewBigQueryModelTraining(value: () => BigQueryModelTraining): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBigQueryModelTraining")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBigtableColumn(value: () => BigtableColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBigtableColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBigtableColumnFamily(value: () => BigtableColumnFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBigtableColumnFamily")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBigtableOptions(value: () => BigtableOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBigtableOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBqmlIterationResult(value: () => BqmlIterationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBqmlIterationResult")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBqmlTrainingRun(value: () => BqmlTrainingRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBqmlTrainingRun")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBqmlTrainingRunTrainingOptions(value: () => BqmlTrainingRunTrainingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBqmlTrainingRunTrainingOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewClustering(value: () => Clustering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClustering")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCsvOptions(value: () => CsvOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCsvOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDataset(value: () => Dataset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDataset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDatasetAccess(value: () => DatasetAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDatasetAccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDatasetReference(value: () => DatasetReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDatasetReference")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDestinationTableProperties(value: () => DestinationTableProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDestinationTableProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEncryptionConfiguration(value: () => EncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEncryptionConfiguration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewErrorProto(value: () => ErrorProto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newErrorProto")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewExplainQueryStage(value: () => ExplainQueryStage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExplainQueryStage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewExplainQueryStep(value: () => ExplainQueryStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExplainQueryStep")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewExternalDataConfiguration(value: () => ExternalDataConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExternalDataConfiguration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGoogleSheetsOptions(value: () => GoogleSheetsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGoogleSheetsOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJob(value: () => Job): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobConfiguration(value: () => JobConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobConfiguration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobConfigurationExtract(value: () => JobConfigurationExtract): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobConfigurationExtract")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobConfigurationLoad(value: () => JobConfigurationLoad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobConfigurationLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobConfigurationQuery(value: () => JobConfigurationQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobConfigurationQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobConfigurationTableCopy(value: () => JobConfigurationTableCopy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobConfigurationTableCopy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobReference(value: () => JobReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobReference")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobStatistics(value: () => JobStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobStatistics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobStatistics2(value: () => JobStatistics2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobStatistics2")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobStatistics2ReservationUsage(value: () => JobStatistics2ReservationUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobStatistics2ReservationUsage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobStatistics3(value: () => JobStatistics3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobStatistics3")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobStatistics4(value: () => JobStatistics4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobStatistics4")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobStatisticsReservationUsage(value: () => JobStatisticsReservationUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobStatisticsReservationUsage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewJobStatus(value: () => JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newJobStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMaterializedViewDefinition(value: () => MaterializedViewDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMaterializedViewDefinition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewModelDefinition(value: () => ModelDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModelDefinition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewModelDefinitionModelOptions(value: () => ModelDefinitionModelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModelDefinitionModelOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewQueryParameter(value: () => QueryParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newQueryParameter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewQueryParameterType(value: () => QueryParameterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newQueryParameterType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewQueryParameterTypeStructTypes(value: () => QueryParameterTypeStructTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newQueryParameterTypeStructTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewQueryParameterValue(value: () => QueryParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newQueryParameterValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewQueryRequest(value: () => QueryRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newQueryRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewQueryTimelineSample(value: () => QueryTimelineSample): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newQueryTimelineSample")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRangePartitioning(value: () => RangePartitioning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRangePartitioning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRangePartitioningRange(value: () => RangePartitioningRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRangePartitioningRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRoutineReference(value: () => RoutineReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRoutineReference")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewStreamingbuffer(value: () => Streamingbuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStreamingbuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTable(value: () => Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableDataInsertAllRequest(value: () => TableDataInsertAllRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableDataInsertAllRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableDataInsertAllRequestRows(value: () => TableDataInsertAllRequestRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableDataInsertAllRequestRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableFieldSchema(value: () => TableFieldSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableFieldSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableFieldSchemaCategories(value: () => TableFieldSchemaCategories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableFieldSchemaCategories")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableReference(value: () => TableReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableReference")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableSchema(value: () => TableSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTimePartitioning(value: () => TimePartitioning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTimePartitioning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserDefinedFunctionResource(value: () => UserDefinedFunctionResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserDefinedFunctionResource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewViewDefinition(value: () => ViewDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newViewDefinition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDatasets(value: DatasetsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datasets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datasets")(js.undefined)
        ret
    }
    @scala.inline
    def withJobs(value: JobsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jobs")(js.undefined)
        ret
    }
    @scala.inline
    def withProjects(value: ProjectsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Projects")(js.undefined)
        ret
    }
    @scala.inline
    def withTabledata(value: TabledataCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tabledata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabledata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tabledata")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: TablesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tables")(js.undefined)
        ret
    }
  }
  
}

