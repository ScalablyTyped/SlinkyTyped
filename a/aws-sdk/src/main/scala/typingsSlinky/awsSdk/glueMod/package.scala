package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object glueMod {
  
  type ActionList = js.Array[typingsSlinky.awsSdk.glueMod.Action]
  
  type AdditionalPlanOptionsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glueMod.GenericString]
  
  type AttemptCount = scala.Double
  
  type BatchDeletePartitionValueList = js.Array[typingsSlinky.awsSdk.glueMod.PartitionValueList]
  
  type BatchDeleteTableNameList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type BatchDeleteTableVersionList = js.Array[typingsSlinky.awsSdk.glueMod.VersionString]
  
  type BatchGetPartitionValueList = js.Array[typingsSlinky.awsSdk.glueMod.PartitionValueList]
  
  type BatchStopJobRunErrorList = js.Array[typingsSlinky.awsSdk.glueMod.BatchStopJobRunError]
  
  type BatchStopJobRunJobRunIdList = js.Array[typingsSlinky.awsSdk.glueMod.IdString]
  
  type BatchStopJobRunSuccessfulSubmissionList = js.Array[typingsSlinky.awsSdk.glueMod.BatchStopJobRunSuccessfulSubmission]
  
  type BatchUpdatePartitionFailureList = js.Array[typingsSlinky.awsSdk.glueMod.BatchUpdatePartitionFailureEntry]
  
  type BatchUpdatePartitionRequestEntryList = js.Array[typingsSlinky.awsSdk.glueMod.BatchUpdatePartitionRequestEntry]
  
  type Boolean = scala.Boolean
  
  type BooleanNullable = scala.Boolean
  
  type BooleanValue = scala.Boolean
  
  type BoundedPartitionValueList = js.Array[typingsSlinky.awsSdk.glueMod.ValueString]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS`
    - java.lang.String
  */
  type CatalogEncryptionMode = typingsSlinky.awsSdk.glueMod._CatalogEncryptionMode | java.lang.String
  
  type CatalogEntries = js.Array[typingsSlinky.awsSdk.glueMod.CatalogEntry]
  
  type CatalogIdString = java.lang.String
  
  type CatalogTablesList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type CatalogTargetList = js.Array[typingsSlinky.awsSdk.glueMod.CatalogTarget]
  
  type Classification = java.lang.String
  
  type ClassifierList = js.Array[typingsSlinky.awsSdk.glueMod.Classifier]
  
  type ClassifierNameList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.glueMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS`
    - java.lang.String
  */
  type CloudWatchEncryptionMode = typingsSlinky.awsSdk.glueMod._CloudWatchEncryptionMode | java.lang.String
  
  type CodeGenArgName = java.lang.String
  
  type CodeGenArgValue = java.lang.String
  
  type CodeGenIdentifier = java.lang.String
  
  type CodeGenNodeArgs = js.Array[typingsSlinky.awsSdk.glueMod.CodeGenNodeArg]
  
  type CodeGenNodeType = java.lang.String
  
  type ColumnErrors = js.Array[typingsSlinky.awsSdk.glueMod.ColumnError]
  
  type ColumnList = js.Array[typingsSlinky.awsSdk.glueMod.Column]
  
  type ColumnNameString = java.lang.String
  
  type ColumnStatisticsErrors = js.Array[typingsSlinky.awsSdk.glueMod.ColumnStatisticsError]
  
  type ColumnStatisticsList = js.Array[typingsSlinky.awsSdk.glueMod.ColumnStatistics]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BOOLEAN
    - typingsSlinky.awsSdk.awsSdkStrings.DATE
    - typingsSlinky.awsSdk.awsSdkStrings.DECIMAL
    - typingsSlinky.awsSdk.awsSdkStrings.DOUBLE
    - typingsSlinky.awsSdk.awsSdkStrings.LONG
    - typingsSlinky.awsSdk.awsSdkStrings.STRING
    - typingsSlinky.awsSdk.awsSdkStrings.BINARY
    - java.lang.String
  */
  type ColumnStatisticsType = typingsSlinky.awsSdk.glueMod._ColumnStatisticsType | java.lang.String
  
  type ColumnTypeString = java.lang.String
  
  type ColumnValueStringList = js.Array[typingsSlinky.awsSdk.glueMod.ColumnValuesString]
  
  type ColumnValuesString = java.lang.String
  
  type CommentString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQUALS
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN_EQUALS
    - typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN_EQUALS
    - java.lang.String
  */
  type Comparator = typingsSlinky.awsSdk.glueMod._Comparator | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.BACKWARD
    - typingsSlinky.awsSdk.awsSdkStrings.BACKWARD_ALL
    - typingsSlinky.awsSdk.awsSdkStrings.FORWARD
    - typingsSlinky.awsSdk.awsSdkStrings.FORWARD_ALL
    - typingsSlinky.awsSdk.awsSdkStrings.FULL
    - typingsSlinky.awsSdk.awsSdkStrings.FULL_ALL
    - java.lang.String
  */
  type Compatibility = typingsSlinky.awsSdk.glueMod._Compatibility | java.lang.String
  
  type ConditionList = js.Array[typingsSlinky.awsSdk.glueMod.Condition]
  
  type ConnectionList = js.Array[typingsSlinky.awsSdk.glueMod.Connection]
  
  type ConnectionName = java.lang.String
  
  type ConnectionProperties = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glueMod.ValueString]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HOST
    - typingsSlinky.awsSdk.awsSdkStrings.PORT
    - typingsSlinky.awsSdk.awsSdkStrings.USERNAME
    - typingsSlinky.awsSdk.awsSdkStrings.PASSWORD
    - typingsSlinky.awsSdk.awsSdkStrings.ENCRYPTED_PASSWORD
    - typingsSlinky.awsSdk.awsSdkStrings.JDBC_DRIVER_JAR_URI
    - typingsSlinky.awsSdk.awsSdkStrings.JDBC_DRIVER_CLASS_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.JDBC_ENGINE
    - typingsSlinky.awsSdk.awsSdkStrings.JDBC_ENGINE_VERSION
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIG_FILES
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_ID
    - typingsSlinky.awsSdk.awsSdkStrings.JDBC_CONNECTION_URL
    - typingsSlinky.awsSdk.awsSdkStrings.JDBC_ENFORCE_SSL
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM_JDBC_CERT
    - typingsSlinky.awsSdk.awsSdkStrings.SKIP_CUSTOM_JDBC_CERT_VALIDATION
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM_JDBC_CERT_STRING
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_URL
    - typingsSlinky.awsSdk.awsSdkStrings.KAFKA_BOOTSTRAP_SERVERS
    - typingsSlinky.awsSdk.awsSdkStrings.KAFKA_SSL_ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.KAFKA_CUSTOM_CERT
    - typingsSlinky.awsSdk.awsSdkStrings.KAFKA_SKIP_CUSTOM_CERT_VALIDATION
    - java.lang.String
  */
  type ConnectionPropertyKey = typingsSlinky.awsSdk.glueMod._ConnectionPropertyKey | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JDBC
    - typingsSlinky.awsSdk.awsSdkStrings.SFTP
    - typingsSlinky.awsSdk.awsSdkStrings.MONGODB
    - typingsSlinky.awsSdk.awsSdkStrings.KAFKA
    - typingsSlinky.awsSdk.awsSdkStrings.NETWORK
    - java.lang.String
  */
  type ConnectionType = typingsSlinky.awsSdk.glueMod._ConnectionType | java.lang.String
  
  type CrawlList = js.Array[typingsSlinky.awsSdk.glueMod.Crawl]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLING
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CrawlState = typingsSlinky.awsSdk.glueMod._CrawlState | java.lang.String
  
  type CrawlerConfiguration = java.lang.String
  
  type CrawlerList = js.Array[typingsSlinky.awsSdk.glueMod.Crawler]
  
  type CrawlerMetricsList = js.Array[typingsSlinky.awsSdk.glueMod.CrawlerMetrics]
  
  type CrawlerNameList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type CrawlerSecurityConfiguration = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - java.lang.String
  */
  type CrawlerState = typingsSlinky.awsSdk.glueMod._CrawlerState | java.lang.String
  
  type CreatedTimestamp = java.lang.String
  
  type CronExpression = java.lang.String
  
  type CsvColumnDelimiter = java.lang.String
  
  type CsvHeader = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - typingsSlinky.awsSdk.awsSdkStrings.PRESENT
    - typingsSlinky.awsSdk.awsSdkStrings.ABSENT
    - java.lang.String
  */
  type CsvHeaderOption = typingsSlinky.awsSdk.glueMod._CsvHeaderOption | java.lang.String
  
  type CsvQuoteSymbol = java.lang.String
  
  type CustomPatterns = java.lang.String
  
  type DagEdges = js.Array[typingsSlinky.awsSdk.glueMod.CodeGenEdge]
  
  type DagNodes = js.Array[typingsSlinky.awsSdk.glueMod.CodeGenNode]
  
  type DataFormat = typingsSlinky.awsSdk.awsSdkStrings.AVRO | java.lang.String
  
  type DataLakePrincipalString = java.lang.String
  
  type DatabaseList = js.Array[typingsSlinky.awsSdk.glueMod.Database]
  
  type DatabaseName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LOG
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FROM_DATABASE
    - typingsSlinky.awsSdk.awsSdkStrings.DEPRECATE_IN_DATABASE
    - java.lang.String
  */
  type DeleteBehavior = typingsSlinky.awsSdk.glueMod._DeleteBehavior | java.lang.String
  
  type DeleteConnectionNameList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type DescriptionString = java.lang.String
  
  type DescriptionStringRemovable = java.lang.String
  
  type DevEndpointList = js.Array[typingsSlinky.awsSdk.glueMod.DevEndpoint]
  
  type DevEndpointNameList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type DevEndpointNames = js.Array[typingsSlinky.awsSdk.glueMod.GenericString]
  
  type Double = scala.Double
  
  type DynamoDBTargetList = js.Array[typingsSlinky.awsSdk.glueMod.DynamoDBTarget]
  
  type EdgeList = js.Array[typingsSlinky.awsSdk.glueMod.Edge]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRUE
    - typingsSlinky.awsSdk.awsSdkStrings.FALSE
    - java.lang.String
  */
  type EnableHybridValues = typingsSlinky.awsSdk.glueMod._EnableHybridValues | java.lang.String
  
  type ErrorByName = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glueMod.ErrorDetail]
  
  type ErrorCodeString = java.lang.String
  
  type ErrorMessageString = java.lang.String
  
  type ErrorString = java.lang.String
  
  type ExecutionTime = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MUST_EXIST
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_EXIST
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ExistCondition = typingsSlinky.awsSdk.glueMod._ExistCondition | java.lang.String
  
  type FieldType = java.lang.String
  
  type FilterString = java.lang.String
  
  type FormatString = java.lang.String
  
  type GenericBoundedDouble = scala.Double
  
  type GenericMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glueMod.GenericString]
  
  type GenericString = java.lang.String
  
  type GetColumnNamesList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type GetResourcePoliciesResponseList = js.Array[typingsSlinky.awsSdk.glueMod.GluePolicy]
  
  type GetTableVersionsList = js.Array[typingsSlinky.awsSdk.glueMod.TableVersion]
  
  type GlueResourceArn = java.lang.String
  
  type GlueTables = js.Array[typingsSlinky.awsSdk.glueMod.GlueTable]
  
  type GlueVersionString = java.lang.String
  
  type GrokPattern = java.lang.String
  
  type HashString = java.lang.String
  
  type IdString = java.lang.String
  
  type Integer = scala.Double
  
  type IntegerFlag = scala.Double
  
  type IntegerValue = scala.Double
  
  type IsVersionValid = scala.Boolean
  
  type JdbcTargetList = js.Array[typingsSlinky.awsSdk.glueMod.JdbcTarget]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.`CSE-KMS`
    - java.lang.String
  */
  type JobBookmarksEncryptionMode = typingsSlinky.awsSdk.glueMod._JobBookmarksEncryptionMode | java.lang.String
  
  type JobList = js.Array[typingsSlinky.awsSdk.glueMod.Job]
  
  type JobName = java.lang.String
  
  type JobNameList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type JobRunList = js.Array[typingsSlinky.awsSdk.glueMod.JobRun]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMEOUT
    - java.lang.String
  */
  type JobRunState = typingsSlinky.awsSdk.glueMod._JobRunState | java.lang.String
  
  type JsonPath = java.lang.String
  
  type JsonValue = java.lang.String
  
  type KeyList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type KeySchemaElementList = js.Array[typingsSlinky.awsSdk.glueMod.KeySchemaElement]
  
  type KeyString = java.lang.String
  
  type KmsKeyArn = java.lang.String
  
  type LabelCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PYTHON
    - typingsSlinky.awsSdk.awsSdkStrings.SCALA
    - java.lang.String
  */
  type Language = typingsSlinky.awsSdk.glueMod._Language | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type LastCrawlStatus = typingsSlinky.awsSdk.glueMod._LastCrawlStatus | java.lang.String
  
  type LatestSchemaVersionBoolean = scala.Boolean
  
  type LocationMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glueMod.ColumnValuesString]
  
  type LocationString = java.lang.String
  
  type LogGroup = java.lang.String
  
  type LogStream = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AND
    - typingsSlinky.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type Logical = typingsSlinky.awsSdk.glueMod._Logical | java.lang.String
  
  type LogicalOperator = typingsSlinky.awsSdk.awsSdkStrings.EQUALS | java.lang.String
  
  type Long = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS`
    - java.lang.String
  */
  type MLUserDataEncryptionModeString = typingsSlinky.awsSdk.glueMod._MLUserDataEncryptionModeString | java.lang.String
  
  type MapValue = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glueMod.GenericString]
  
  type MappingList = js.Array[typingsSlinky.awsSdk.glueMod.MappingEntry]
  
  type MatchCriteria = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type MaxConcurrentRuns = scala.Double
  
  type MaxResultsNumber = scala.Double
  
  type MaxRetries = scala.Double
  
  type MessagePrefix = java.lang.String
  
  type MetadataInfoMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glueMod.MetadataInfo]
  
  type MetadataKeyString = java.lang.String
  
  type MetadataList = js.Array[typingsSlinky.awsSdk.glueMod.MetadataKeyValuePair]
  
  type MetadataValueString = java.lang.String
  
  type MillisecondsCount = scala.Double
  
  type MongoDBTargetList = js.Array[typingsSlinky.awsSdk.glueMod.MongoDBTarget]
  
  type NameString = java.lang.String
  
  type NameStringList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type NodeIdList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type NodeList = js.Array[typingsSlinky.awsSdk.glueMod.Node]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CRAWLER
    - typingsSlinky.awsSdk.awsSdkStrings.JOB
    - typingsSlinky.awsSdk.awsSdkStrings.TRIGGER
    - java.lang.String
  */
  type NodeType = typingsSlinky.awsSdk.glueMod._NodeType | java.lang.String
  
  type NonNegativeDouble = scala.Double
  
  type NonNegativeInteger = scala.Double
  
  type NonNegativeLong = scala.Double
  
  type NotifyDelayAfter = scala.Double
  
  type NullableBoolean = scala.Boolean
  
  type NullableDouble = scala.Double
  
  type NullableInteger = scala.Double
  
  type OrchestrationStringList = js.Array[typingsSlinky.awsSdk.glueMod.GenericString]
  
  type OrderList = js.Array[typingsSlinky.awsSdk.glueMod.Order]
  
  type PageSize = scala.Double
  
  type PaginationToken = java.lang.String
  
  type ParametersMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glueMod.ParametersMapValue]
  
  type ParametersMapValue = java.lang.String
  
  type PartitionErrors = js.Array[typingsSlinky.awsSdk.glueMod.PartitionError]
  
  type PartitionIndexDescriptorList = js.Array[typingsSlinky.awsSdk.glueMod.PartitionIndexDescriptor]
  
  type PartitionIndexList = js.Array[typingsSlinky.awsSdk.glueMod.PartitionIndex]
  
  type PartitionIndexStatus = typingsSlinky.awsSdk.awsSdkStrings.ACTIVE | java.lang.String
  
  type PartitionInputList = js.Array[typingsSlinky.awsSdk.glueMod.PartitionInput]
  
  type PartitionList = js.Array[typingsSlinky.awsSdk.glueMod.Partition]
  
  type Path = java.lang.String
  
  type PathList = js.Array[typingsSlinky.awsSdk.glueMod.Path]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - typingsSlinky.awsSdk.awsSdkStrings.SELECT
    - typingsSlinky.awsSdk.awsSdkStrings.ALTER
    - typingsSlinky.awsSdk.awsSdkStrings.DROP
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.INSERT
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_DATABASE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_TABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_LOCATION_ACCESS
    - java.lang.String
  */
  type Permission = typingsSlinky.awsSdk.glueMod._Permission | java.lang.String
  
  type PermissionList = js.Array[typingsSlinky.awsSdk.glueMod.Permission]
  
  type PolicyJsonString = java.lang.String
  
  type PredecessorList = js.Array[typingsSlinky.awsSdk.glueMod.Predecessor]
  
  type PredicateString = java.lang.String
  
  type PrincipalPermissionsList = js.Array[typingsSlinky.awsSdk.glueMod.PrincipalPermissions]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.ROLE
    - typingsSlinky.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type PrincipalType = typingsSlinky.awsSdk.glueMod._PrincipalType | java.lang.String
  
  type PublicKeysList = js.Array[typingsSlinky.awsSdk.glueMod.GenericString]
  
  type PythonScript = java.lang.String
  
  type PythonVersionString = java.lang.String
  
  type QuerySchemaVersionMetadataMaxResults = scala.Double
  
  type RecordsCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CRAWL_EVERYTHING
    - typingsSlinky.awsSdk.awsSdkStrings.CRAWL_NEW_FOLDERS_ONLY
    - java.lang.String
  */
  type RecrawlBehavior = typingsSlinky.awsSdk.glueMod._RecrawlBehavior | java.lang.String
  
  type RegistryListDefinition = js.Array[typingsSlinky.awsSdk.glueMod.RegistryListItem]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type RegistryStatus = typingsSlinky.awsSdk.glueMod._RegistryStatus | java.lang.String
  
  type ReplaceBoolean = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FOREIGN
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type ResourceShareType = typingsSlinky.awsSdk.glueMod._ResourceShareType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JAR
    - typingsSlinky.awsSdk.awsSdkStrings.FILE
    - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.glueMod._ResourceType | java.lang.String
  
  type ResourceUriList = js.Array[typingsSlinky.awsSdk.glueMod.ResourceUri]
  
  type Role = java.lang.String
  
  type RoleArn = java.lang.String
  
  type RoleString = java.lang.String
  
  type RowTag = java.lang.String
  
  type RunId = java.lang.String
  
  type S3EncryptionList = js.Array[typingsSlinky.awsSdk.glueMod.S3Encryption]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS`
    - typingsSlinky.awsSdk.awsSdkStrings.`SSE-S3`
    - java.lang.String
  */
  type S3EncryptionMode = typingsSlinky.awsSdk.glueMod._S3EncryptionMode | java.lang.String
  
  type S3TargetList = js.Array[typingsSlinky.awsSdk.glueMod.S3Target]
  
  type ScalaCode = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_SCHEDULED
    - typingsSlinky.awsSdk.awsSdkStrings.TRANSITIONING
    - java.lang.String
  */
  type ScheduleState = typingsSlinky.awsSdk.glueMod._ScheduleState | java.lang.String
  
  type SchemaCheckpointNumber = scala.Double
  
  type SchemaDefinitionDiff = java.lang.String
  
  type SchemaDefinitionString = java.lang.String
  
  type SchemaDiffType = typingsSlinky.awsSdk.awsSdkStrings.SYNTAX_DIFF | java.lang.String
  
  type SchemaListDefinition = js.Array[typingsSlinky.awsSdk.glueMod.SchemaListItem]
  
  type SchemaPathString = java.lang.String
  
  type SchemaRegistryNameString = java.lang.String
  
  type SchemaRegistryTokenString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type SchemaStatus = typingsSlinky.awsSdk.glueMod._SchemaStatus | java.lang.String
  
  type SchemaValidationError = java.lang.String
  
  type SchemaVersionErrorList = js.Array[typingsSlinky.awsSdk.glueMod.SchemaVersionErrorItem]
  
  type SchemaVersionIdString = java.lang.String
  
  type SchemaVersionList = js.Array[typingsSlinky.awsSdk.glueMod.SchemaVersionListItem]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type SchemaVersionStatus = typingsSlinky.awsSdk.glueMod._SchemaVersionStatus | java.lang.String
  
  type ScriptLocationString = java.lang.String
  
  type SearchPropertyPredicates = js.Array[typingsSlinky.awsSdk.glueMod.PropertyPredicate]
  
  type SecurityConfigurationList = js.Array[typingsSlinky.awsSdk.glueMod.SecurityConfiguration]
  
  type SecurityGroupIdList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASC
    - typingsSlinky.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type Sort = typingsSlinky.awsSdk.glueMod._Sort | java.lang.String
  
  type SortCriteria = js.Array[typingsSlinky.awsSdk.glueMod.SortCriterion]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DESCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ASCENDING
    - java.lang.String
  */
  type SortDirectionType = typingsSlinky.awsSdk.glueMod._SortDirectionType | java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.glueMod.GenericString]
  
  type TableErrors = js.Array[typingsSlinky.awsSdk.glueMod.TableError]
  
  type TableList = js.Array[typingsSlinky.awsSdk.glueMod.Table]
  
  type TableName = java.lang.String
  
  type TablePrefix = java.lang.String
  
  type TableTypeString = java.lang.String
  
  type TableVersionErrors = js.Array[typingsSlinky.awsSdk.glueMod.TableVersionError]
  
  type TagKey = java.lang.String
  
  type TagKeysList = js.Array[typingsSlinky.awsSdk.glueMod.TagKey]
  
  type TagValue = java.lang.String
  
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glueMod.TagValue]
  
  type TaskRunList = js.Array[typingsSlinky.awsSdk.glueMod.TaskRun]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TASK_RUN_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.STATUS
    - typingsSlinky.awsSdk.awsSdkStrings.STARTED
    - java.lang.String
  */
  type TaskRunSortColumnType = typingsSlinky.awsSdk.glueMod._TaskRunSortColumnType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMEOUT
    - java.lang.String
  */
  type TaskStatusType = typingsSlinky.awsSdk.glueMod._TaskStatusType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EVALUATION
    - typingsSlinky.awsSdk.awsSdkStrings.LABELING_SET_GENERATION
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_LABELS
    - typingsSlinky.awsSdk.awsSdkStrings.EXPORT_LABELS
    - typingsSlinky.awsSdk.awsSdkStrings.FIND_MATCHES
    - java.lang.String
  */
  type TaskType = typingsSlinky.awsSdk.glueMod._TaskType | java.lang.String
  
  type Timeout = scala.Double
  
  type Timestamp = js.Date
  
  type TimestampValue = js.Date
  
  type Token = java.lang.String
  
  type TotalSegmentsInteger = scala.Double
  
  type TransformIdList = js.Array[typingsSlinky.awsSdk.glueMod.HashString]
  
  type TransformList = js.Array[typingsSlinky.awsSdk.glueMod.MLTransform]
  
  type TransformSchema = js.Array[typingsSlinky.awsSdk.glueMod.SchemaColumn]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - typingsSlinky.awsSdk.awsSdkStrings.TRANSFORM_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.STATUS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.LAST_MODIFIED
    - java.lang.String
  */
  type TransformSortColumnType = typingsSlinky.awsSdk.glueMod._TransformSortColumnType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_READY
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type TransformStatusType = typingsSlinky.awsSdk.glueMod._TransformStatusType | java.lang.String
  
  type TransformType = typingsSlinky.awsSdk.awsSdkStrings.FIND_MATCHES | java.lang.String
  
  type TriggerList = js.Array[typingsSlinky.awsSdk.glueMod.Trigger]
  
  type TriggerNameList = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATED
    - typingsSlinky.awsSdk.awsSdkStrings.DEACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.DEACTIVATED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type TriggerState = typingsSlinky.awsSdk.glueMod._TriggerState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED
    - typingsSlinky.awsSdk.awsSdkStrings.CONDITIONAL
    - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type TriggerType = typingsSlinky.awsSdk.glueMod._TriggerType | java.lang.String
  
  type TypeString = java.lang.String
  
  type URI = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LOG
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_IN_DATABASE
    - java.lang.String
  */
  type UpdateBehavior = typingsSlinky.awsSdk.glueMod._UpdateBehavior | java.lang.String
  
  type UpdateColumnStatisticsList = js.Array[typingsSlinky.awsSdk.glueMod.ColumnStatistics]
  
  type UpdatedTimestamp = java.lang.String
  
  type UriString = java.lang.String
  
  type UserDefinedFunctionList = js.Array[typingsSlinky.awsSdk.glueMod.UserDefinedFunction]
  
  type ValueString = java.lang.String
  
  type ValueStringList = js.Array[typingsSlinky.awsSdk.glueMod.ValueString]
  
  type VersionId = scala.Double
  
  type VersionLongNumber = scala.Double
  
  type VersionString = java.lang.String
  
  type VersionsString = java.lang.String
  
  type ViewTextString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Standard_
    - typingsSlinky.awsSdk.awsSdkStrings.GDot1X
    - typingsSlinky.awsSdk.awsSdkStrings.GDot2X
    - java.lang.String
  */
  type WorkerType = typingsSlinky.awsSdk.glueMod._WorkerType | java.lang.String
  
  type WorkflowNames = js.Array[typingsSlinky.awsSdk.glueMod.NameString]
  
  type WorkflowRunProperties = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glueMod.GenericString]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type WorkflowRunStatus = typingsSlinky.awsSdk.glueMod._WorkflowRunStatus | java.lang.String
  
  type WorkflowRuns = js.Array[typingsSlinky.awsSdk.glueMod.WorkflowRun]
  
  type Workflows = js.Array[typingsSlinky.awsSdk.glueMod.Workflow]
  
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.glueMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-03-31`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.glueMod._apiVersion | java.lang.String
}
