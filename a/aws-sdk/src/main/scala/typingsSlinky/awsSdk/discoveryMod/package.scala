package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object discoveryMod {
  
  type AgentConfigurationStatusList = js.Array[typingsSlinky.awsSdk.discoveryMod.AgentConfigurationStatus]
  
  type AgentId = java.lang.String
  
  type AgentIds = js.Array[typingsSlinky.awsSdk.discoveryMod.AgentId]
  
  type AgentNetworkInfoList = js.Array[typingsSlinky.awsSdk.discoveryMod.AgentNetworkInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - typingsSlinky.awsSdk.awsSdkStrings.BLACKLISTED
    - typingsSlinky.awsSdk.awsSdkStrings.SHUTDOWN
    - java.lang.String
  */
  type AgentStatus = typingsSlinky.awsSdk.discoveryMod._AgentStatus | java.lang.String
  
  type AgentsInfo = js.Array[typingsSlinky.awsSdk.discoveryMod.AgentInfo]
  
  type ApplicationId = java.lang.String
  
  type ApplicationIdsList = js.Array[typingsSlinky.awsSdk.discoveryMod.ApplicationId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_SERVER_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.OVER_LIMIT
    - java.lang.String
  */
  type BatchDeleteImportDataErrorCode = typingsSlinky.awsSdk.discoveryMod._BatchDeleteImportDataErrorCode | java.lang.String
  
  type BatchDeleteImportDataErrorDescription = java.lang.String
  
  type BatchDeleteImportDataErrorList = js.Array[typingsSlinky.awsSdk.discoveryMod.BatchDeleteImportDataError]
  
  type Boolean = scala.Boolean
  
  type BoxedInteger = scala.Double
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.discoveryMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type Condition = java.lang.String
  
  type Configuration = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.discoveryMod.String]
  
  type ConfigurationId = java.lang.String
  
  type ConfigurationIdList = js.Array[typingsSlinky.awsSdk.discoveryMod.ConfigurationId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER
    - typingsSlinky.awsSdk.awsSdkStrings.PROCESS
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTION
    - typingsSlinky.awsSdk.awsSdkStrings.APPLICATION
    - java.lang.String
  */
  type ConfigurationItemType = typingsSlinky.awsSdk.discoveryMod._ConfigurationItemType | java.lang.String
  
  type ConfigurationTagSet = js.Array[typingsSlinky.awsSdk.discoveryMod.ConfigurationTag]
  
  type Configurations = js.Array[typingsSlinky.awsSdk.discoveryMod.Configuration]
  
  type ConfigurationsDownloadUrl = java.lang.String
  
  type ConfigurationsExportId = java.lang.String
  
  type ContinuousExportDescriptions = js.Array[typingsSlinky.awsSdk.discoveryMod.ContinuousExportDescription]
  
  type ContinuousExportIds = js.Array[typingsSlinky.awsSdk.discoveryMod.ConfigurationsExportId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.START_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.START_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type ContinuousExportStatus = typingsSlinky.awsSdk.discoveryMod._ContinuousExportStatus | java.lang.String
  
  type DataSource = typingsSlinky.awsSdk.awsSdkStrings.AGENT | java.lang.String
  
  type DatabaseName = java.lang.String
  
  type DescribeConfigurationsAttribute = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.discoveryMod.String]
  
  type DescribeConfigurationsAttributes = js.Array[typingsSlinky.awsSdk.discoveryMod.DescribeConfigurationsAttribute]
  
  type DescribeContinuousExportsMaxResults = scala.Double
  
  type DescribeImportTasksFilterList = js.Array[typingsSlinky.awsSdk.discoveryMod.ImportTaskFilter]
  
  type DescribeImportTasksMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CSV
    - typingsSlinky.awsSdk.awsSdkStrings.GRAPHML
    - java.lang.String
  */
  type ExportDataFormat = typingsSlinky.awsSdk.discoveryMod._ExportDataFormat | java.lang.String
  
  type ExportDataFormats = js.Array[typingsSlinky.awsSdk.discoveryMod.ExportDataFormat]
  
  type ExportFilters = js.Array[typingsSlinky.awsSdk.discoveryMod.ExportFilter]
  
  type ExportIds = js.Array[typingsSlinky.awsSdk.discoveryMod.ConfigurationsExportId]
  
  type ExportRequestTime = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - java.lang.String
  */
  type ExportStatus = typingsSlinky.awsSdk.discoveryMod._ExportStatus | java.lang.String
  
  type ExportStatusMessage = java.lang.String
  
  type ExportsInfo = js.Array[typingsSlinky.awsSdk.discoveryMod.ExportInfo]
  
  type FilterName = java.lang.String
  
  type FilterValue = java.lang.String
  
  type FilterValues = js.Array[typingsSlinky.awsSdk.discoveryMod.FilterValue]
  
  type Filters = js.Array[typingsSlinky.awsSdk.discoveryMod.Filter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_COMPLETE_WITH_ERRORS
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_FAILED_SERVER_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_FAILED_RECORD_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type ImportStatus = typingsSlinky.awsSdk.discoveryMod._ImportStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_TASK_ID
    - typingsSlinky.awsSdk.awsSdkStrings.STATUS
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - java.lang.String
  */
  type ImportTaskFilterName = typingsSlinky.awsSdk.discoveryMod._ImportTaskFilterName | java.lang.String
  
  type ImportTaskFilterValue = java.lang.String
  
  type ImportTaskFilterValueList = js.Array[typingsSlinky.awsSdk.discoveryMod.ImportTaskFilterValue]
  
  type ImportTaskIdentifier = java.lang.String
  
  type ImportTaskList = js.Array[typingsSlinky.awsSdk.discoveryMod.ImportTask]
  
  type ImportTaskName = java.lang.String
  
  type ImportURL = java.lang.String
  
  type Integer = scala.Double
  
  type Long = scala.Double
  
  type NeighborDetailsList = js.Array[typingsSlinky.awsSdk.discoveryMod.NeighborConnectionDetail]
  
  type NextToken = java.lang.String
  
  type OrderByList = js.Array[typingsSlinky.awsSdk.discoveryMod.OrderByElement]
  
  type S3Bucket = java.lang.String
  
  type S3PresignedUrl = java.lang.String
  
  type SchemaStorageConfig = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.discoveryMod.String]
  
  type String = java.lang.String
  
  type StringMax255 = java.lang.String
  
  type TagFilters = js.Array[typingsSlinky.awsSdk.discoveryMod.TagFilter]
  
  type TagKey = java.lang.String
  
  type TagSet = js.Array[typingsSlinky.awsSdk.discoveryMod.Tag]
  
  type TagValue = java.lang.String
  
  type TimeStamp = js.Date
  
  type ToDeleteIdentifierList = js.Array[typingsSlinky.awsSdk.discoveryMod.ImportTaskIdentifier]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-11-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.discoveryMod._apiVersion | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASC
    - typingsSlinky.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type orderString = typingsSlinky.awsSdk.discoveryMod._orderString | java.lang.String
}
