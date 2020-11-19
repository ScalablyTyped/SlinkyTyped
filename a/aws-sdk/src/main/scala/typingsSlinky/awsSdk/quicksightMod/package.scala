package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object quicksightMod {
  
  type ActionList = js.Array[typingsSlinky.awsSdk.quicksightMod.String]
  
  type ActiveIAMPolicyAssignmentList = js.Array[typingsSlinky.awsSdk.quicksightMod.ActiveIAMPolicyAssignment]
  
  type AliasName = java.lang.String
  
  type Arn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DRAFT
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignmentStatus = typingsSlinky.awsSdk.quicksightMod._AssignmentStatus | java.lang.String
  
  type AwsAccountId = java.lang.String
  
  type AwsAndAccountId = java.lang.String
  
  type Boolean = scala.Boolean
  
  type CalculatedColumnList = js.Array[typingsSlinky.awsSdk.quicksightMod.CalculatedColumn]
  
  type Catalog = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.quicksightMod.ClientApiVersions
  
  type ClusterId = java.lang.String
  
  type ColorList = js.Array[typingsSlinky.awsSdk.quicksightMod.HexColor]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STRING
    - typingsSlinky.awsSdk.awsSdkStrings.INTEGER
    - typingsSlinky.awsSdk.awsSdkStrings.DECIMAL
    - typingsSlinky.awsSdk.awsSdkStrings.DATETIME
    - java.lang.String
  */
  type ColumnDataType = typingsSlinky.awsSdk.quicksightMod._ColumnDataType | java.lang.String
  
  type ColumnGroupColumnSchemaList = js.Array[typingsSlinky.awsSdk.quicksightMod.ColumnGroupColumnSchema]
  
  type ColumnGroupList = js.Array[typingsSlinky.awsSdk.quicksightMod.ColumnGroup]
  
  type ColumnGroupName = java.lang.String
  
  type ColumnGroupSchemaList = js.Array[typingsSlinky.awsSdk.quicksightMod.ColumnGroupSchema]
  
  type ColumnId = java.lang.String
  
  type ColumnList = js.Array[typingsSlinky.awsSdk.quicksightMod.ColumnName]
  
  type ColumnName = java.lang.String
  
  type ColumnSchemaList = js.Array[typingsSlinky.awsSdk.quicksightMod.ColumnSchema]
  
  type ColumnTagList = js.Array[typingsSlinky.awsSdk.quicksightMod.ColumnTag]
  
  type CopySourceArn = java.lang.String
  
  type CustomSqlName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DashboardBehavior = typingsSlinky.awsSdk.quicksightMod._DashboardBehavior | java.lang.String
  
  type DashboardErrorList = js.Array[typingsSlinky.awsSdk.quicksightMod.DashboardError]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.PARAMETER_VALUE_INCOMPATIBLE
    - typingsSlinky.awsSdk.awsSdkStrings.PARAMETER_TYPE_INVALID
    - typingsSlinky.awsSdk.awsSdkStrings.PARAMETER_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.COLUMN_TYPE_MISMATCH
    - typingsSlinky.awsSdk.awsSdkStrings.COLUMN_GEOGRAPHIC_ROLE_MISMATCH
    - typingsSlinky.awsSdk.awsSdkStrings.COLUMN_REPLACEMENT_MISSING
    - java.lang.String
  */
  type DashboardErrorType = typingsSlinky.awsSdk.quicksightMod._DashboardErrorType | java.lang.String
  
  type DashboardFilterAttribute = typingsSlinky.awsSdk.awsSdkStrings.QUICKSIGHT_USER | java.lang.String
  
  type DashboardName = java.lang.String
  
  type DashboardSearchFilterList = js.Array[typingsSlinky.awsSdk.quicksightMod.DashboardSearchFilter]
  
  type DashboardSummaryList = js.Array[typingsSlinky.awsSdk.quicksightMod.DashboardSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EXPANDED
    - typingsSlinky.awsSdk.awsSdkStrings.COLLAPSED
    - java.lang.String
  */
  type DashboardUIState = typingsSlinky.awsSdk.quicksightMod._DashboardUIState | java.lang.String
  
  type DashboardVersionSummaryList = js.Array[typingsSlinky.awsSdk.quicksightMod.DashboardVersionSummary]
  
  type DataSetArnsList = js.Array[typingsSlinky.awsSdk.quicksightMod.Arn]
  
  type DataSetConfigurationList = js.Array[typingsSlinky.awsSdk.quicksightMod.DataSetConfiguration]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SPICE
    - typingsSlinky.awsSdk.awsSdkStrings.DIRECT_QUERY
    - java.lang.String
  */
  type DataSetImportMode = typingsSlinky.awsSdk.quicksightMod._DataSetImportMode | java.lang.String
  
  type DataSetName = java.lang.String
  
  type DataSetReferenceList = js.Array[typingsSlinky.awsSdk.quicksightMod.DataSetReference]
  
  type DataSetSummaryList = js.Array[typingsSlinky.awsSdk.quicksightMod.DataSetSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.COPY_SOURCE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.TIMEOUT
    - typingsSlinky.awsSdk.awsSdkStrings.ENGINE_VERSION_NOT_SUPPORTED
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN_HOST
    - typingsSlinky.awsSdk.awsSdkStrings.GENERIC_SQL_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.CONFLICT
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type DataSourceErrorInfoType = typingsSlinky.awsSdk.quicksightMod._DataSourceErrorInfoType | java.lang.String
  
  type DataSourceList = js.Array[typingsSlinky.awsSdk.quicksightMod.DataSource]
  
  type DataSourceParametersList = js.Array[typingsSlinky.awsSdk.quicksightMod.DataSourceParameters]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ADOBE_ANALYTICS
    - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_ELASTICSEARCH
    - typingsSlinky.awsSdk.awsSdkStrings.ATHENA
    - typingsSlinky.awsSdk.awsSdkStrings.AURORA
    - typingsSlinky.awsSdk.awsSdkStrings.AURORA_POSTGRESQL
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_IOT_ANALYTICS
    - typingsSlinky.awsSdk.awsSdkStrings.GITHUB
    - typingsSlinky.awsSdk.awsSdkStrings.JIRA
    - typingsSlinky.awsSdk.awsSdkStrings.MARIADB
    - typingsSlinky.awsSdk.awsSdkStrings.MYSQL
    - typingsSlinky.awsSdk.awsSdkStrings.POSTGRESQL
    - typingsSlinky.awsSdk.awsSdkStrings.PRESTO
    - typingsSlinky.awsSdk.awsSdkStrings.REDSHIFT
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - typingsSlinky.awsSdk.awsSdkStrings.SALESFORCE
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICENOW
    - typingsSlinky.awsSdk.awsSdkStrings.SNOWFLAKE
    - typingsSlinky.awsSdk.awsSdkStrings.SPARK
    - typingsSlinky.awsSdk.awsSdkStrings.SQLSERVER
    - typingsSlinky.awsSdk.awsSdkStrings.TERADATA
    - typingsSlinky.awsSdk.awsSdkStrings.TWITTER
    - java.lang.String
  */
  type DataSourceType = typingsSlinky.awsSdk.quicksightMod._DataSourceType | java.lang.String
  
  type Database = java.lang.String
  
  type DateTimeParameterList = js.Array[typingsSlinky.awsSdk.quicksightMod.DateTimeParameter]
  
  type DecimalParameterList = js.Array[typingsSlinky.awsSdk.quicksightMod.DecimalParameter]
  
  type Delimiter = java.lang.String
  
  type Domain = java.lang.String
  
  type Double = scala.Double
  
  type DoubleList = js.Array[typingsSlinky.awsSdk.quicksightMod.Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.ENTERPRISE
    - java.lang.String
  */
  type Edition = typingsSlinky.awsSdk.quicksightMod._Edition | java.lang.String
  
  type EmbeddingUrl = java.lang.String
  
  type EntryPoint = java.lang.String
  
  type Expression = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CSV
    - typingsSlinky.awsSdk.awsSdkStrings.TSV
    - typingsSlinky.awsSdk.awsSdkStrings.CLF
    - typingsSlinky.awsSdk.awsSdkStrings.ELF
    - typingsSlinky.awsSdk.awsSdkStrings.XLSX
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type FileFormat = typingsSlinky.awsSdk.quicksightMod._FileFormat | java.lang.String
  
  type FilterOperator = typingsSlinky.awsSdk.awsSdkStrings.StringEquals_ | java.lang.String
  
  type GeoSpatialCountryCode = typingsSlinky.awsSdk.awsSdkStrings.US | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COUNTRY
    - typingsSlinky.awsSdk.awsSdkStrings.STATE
    - typingsSlinky.awsSdk.awsSdkStrings.COUNTY
    - typingsSlinky.awsSdk.awsSdkStrings.CITY
    - typingsSlinky.awsSdk.awsSdkStrings.POSTCODE
    - typingsSlinky.awsSdk.awsSdkStrings.LONGITUDE
    - typingsSlinky.awsSdk.awsSdkStrings.LATITUDE
    - java.lang.String
  */
  type GeoSpatialDataRole = typingsSlinky.awsSdk.quicksightMod._GeoSpatialDataRole | java.lang.String
  
  type GroupDescription = java.lang.String
  
  type GroupList = js.Array[typingsSlinky.awsSdk.quicksightMod.Group]
  
  type GroupMemberList = js.Array[typingsSlinky.awsSdk.quicksightMod.GroupMember]
  
  type GroupMemberName = java.lang.String
  
  type GroupName = java.lang.String
  
  type HexColor = java.lang.String
  
  type Host = java.lang.String
  
  type IAMPolicyAssignmentName = java.lang.String
  
  type IAMPolicyAssignmentSummaryList = js.Array[typingsSlinky.awsSdk.quicksightMod.IAMPolicyAssignmentSummary]
  
  type IdentityMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.quicksightMod.IdentityNameList]
  
  type IdentityName = java.lang.String
  
  type IdentityNameList = js.Array[typingsSlinky.awsSdk.quicksightMod.IdentityName]
  
  type IdentityStore = typingsSlinky.awsSdk.awsSdkStrings.QUICKSIGHT | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IAM
    - typingsSlinky.awsSdk.awsSdkStrings.QUICKSIGHT
    - java.lang.String
  */
  type IdentityType = typingsSlinky.awsSdk.quicksightMod._IdentityType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FAILURE_TO_ASSUME_ROLE
    - typingsSlinky.awsSdk.awsSdkStrings.INGESTION_SUPERSEDED
    - typingsSlinky.awsSdk.awsSdkStrings.INGESTION_CANCELED
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_SET_DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_SET_NOT_SPICE
    - typingsSlinky.awsSdk.awsSdkStrings.S3_UPLOADED_FILE_DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.S3_MANIFEST_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_TOLERANCE_EXCEPTION
    - typingsSlinky.awsSdk.awsSdkStrings.SPICE_TABLE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_SET_SIZE_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.ROW_SIZE_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT_CAPACITY_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_SOURCE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_ROLE_NOT_AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.SQL_TABLE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.PERMISSION_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.SSL_CERTIFICATE_VALIDATION_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.OAUTH_TOKEN_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_API_LIMIT_EXCEEDED_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.PASSWORD_AUTHENTICATION_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.SQL_SCHEMA_MISMATCH_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_DATE_FORMAT
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_DATAPREP_SYNTAX
    - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_RESOURCE_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.SQL_INVALID_PARAMETER_VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.QUERY_TIMEOUT
    - typingsSlinky.awsSdk.awsSdkStrings.SQL_NUMERIC_OVERFLOW
    - typingsSlinky.awsSdk.awsSdkStrings.UNRESOLVABLE_HOST
    - typingsSlinky.awsSdk.awsSdkStrings.UNROUTABLE_HOST
    - typingsSlinky.awsSdk.awsSdkStrings.SQL_EXCEPTION
    - typingsSlinky.awsSdk.awsSdkStrings.S3_FILE_INACCESSIBLE
    - typingsSlinky.awsSdk.awsSdkStrings.IOT_FILE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.IOT_DATA_SET_FILE_EMPTY
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_DATA_SOURCE_CONFIG
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_SOURCE_AUTH_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_SOURCE_CONNECTION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILURE_TO_PROCESS_JSON_FILE
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type IngestionErrorType = typingsSlinky.awsSdk.quicksightMod._IngestionErrorType | java.lang.String
  
  type IngestionId = java.lang.String
  
  type IngestionMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MANUAL
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED
    - java.lang.String
  */
  type IngestionRequestSource = typingsSlinky.awsSdk.quicksightMod._IngestionRequestSource | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INITIAL_INGESTION
    - typingsSlinky.awsSdk.awsSdkStrings.EDIT
    - typingsSlinky.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH
    - typingsSlinky.awsSdk.awsSdkStrings.FULL_REFRESH
    - java.lang.String
  */
  type IngestionRequestType = typingsSlinky.awsSdk.quicksightMod._IngestionRequestType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type IngestionStatus = typingsSlinky.awsSdk.quicksightMod._IngestionStatus | java.lang.String
  
  type Ingestions = js.Array[typingsSlinky.awsSdk.quicksightMod.Ingestion]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STRING
    - typingsSlinky.awsSdk.awsSdkStrings.INTEGER
    - typingsSlinky.awsSdk.awsSdkStrings.DECIMAL
    - typingsSlinky.awsSdk.awsSdkStrings.DATETIME
    - typingsSlinky.awsSdk.awsSdkStrings.BIT
    - typingsSlinky.awsSdk.awsSdkStrings.BOOLEAN
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type InputColumnDataType = typingsSlinky.awsSdk.quicksightMod._InputColumnDataType | java.lang.String
  
  type InputColumnList = js.Array[typingsSlinky.awsSdk.quicksightMod.InputColumn]
  
  type InstanceId = java.lang.String
  
  type IntegerParameterList = js.Array[typingsSlinky.awsSdk.quicksightMod.IntegerParameter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INNER
    - typingsSlinky.awsSdk.awsSdkStrings.OUTER
    - typingsSlinky.awsSdk.awsSdkStrings.LEFT
    - typingsSlinky.awsSdk.awsSdkStrings.RIGHT
    - java.lang.String
  */
  type JoinType = typingsSlinky.awsSdk.quicksightMod._JoinType | java.lang.String
  
  type LogicalTableAlias = java.lang.String
  
  type LogicalTableId = java.lang.String
  
  type LogicalTableMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.quicksightMod.LogicalTable]
  
  type LongList = js.Array[typingsSlinky.awsSdk.quicksightMod.Long_]
  
  type Long_ = scala.Double
  
  type MaxResults = scala.Double
  
  type Namespace = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PERMISSION_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type NamespaceErrorType = typingsSlinky.awsSdk.quicksightMod._NamespaceErrorType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.RETRYABLE_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.NON_RETRYABLE_FAILURE
    - java.lang.String
  */
  type NamespaceStatus = typingsSlinky.awsSdk.quicksightMod._NamespaceStatus | java.lang.String
  
  type Namespaces = js.Array[typingsSlinky.awsSdk.quicksightMod.NamespaceInfoV2]
  
  type NonEmptyString = java.lang.String
  
  type OnClause = java.lang.String
  
  type OptionalPort = scala.Double
  
  type OutputColumnList = js.Array[typingsSlinky.awsSdk.quicksightMod.OutputColumn]
  
  type Password = java.lang.String
  
  type PhysicalTableId = java.lang.String
  
  type PhysicalTableMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.quicksightMod.PhysicalTable]
  
  type Port = scala.Double
  
  type PositiveInteger = scala.Double
  
  type Principal = java.lang.String
  
  type ProjectedColumnList = js.Array[typingsSlinky.awsSdk.quicksightMod.String]
  
  type Query = java.lang.String
  
  type RelationalTableName = java.lang.String
  
  type RelationalTableSchema = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResourceName = java.lang.String
  
  type ResourcePermissionList = js.Array[typingsSlinky.awsSdk.quicksightMod.ResourcePermission]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATION_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.CREATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type ResourceStatus = typingsSlinky.awsSdk.quicksightMod._ResourceStatus | java.lang.String
  
  type RestrictiveResourceId = java.lang.String
  
  type RoleName = java.lang.String
  
  type RoleSessionName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GRANT_ACCESS
    - typingsSlinky.awsSdk.awsSdkStrings.DENY_ACCESS
    - java.lang.String
  */
  type RowLevelPermissionPolicy = typingsSlinky.awsSdk.quicksightMod._RowLevelPermissionPolicy | java.lang.String
  
  type S3Bucket = java.lang.String
  
  type S3Key = java.lang.String
  
  type SessionLifetimeInMinutes = scala.Double
  
  type SiteBaseUrl = java.lang.String
  
  type SqlQuery = java.lang.String
  
  type StatusCode = scala.Double
  
  type String = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.quicksightMod.String]
  
  type StringParameterList = js.Array[typingsSlinky.awsSdk.quicksightMod.StringParameter]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.quicksightMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.quicksightMod.Tag]
  
  type TagValue = java.lang.String
  
  type TemplateAliasList = js.Array[typingsSlinky.awsSdk.quicksightMod.TemplateAlias]
  
  type TemplateErrorList = js.Array[typingsSlinky.awsSdk.quicksightMod.TemplateError]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - java.lang.String
  */
  type TemplateErrorType = typingsSlinky.awsSdk.quicksightMod._TemplateErrorType | java.lang.String
  
  type TemplateName = java.lang.String
  
  type TemplateSummaryList = js.Array[typingsSlinky.awsSdk.quicksightMod.TemplateSummary]
  
  type TemplateVersionSummaryList = js.Array[typingsSlinky.awsSdk.quicksightMod.TemplateVersionSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DOUBLE_QUOTE
    - typingsSlinky.awsSdk.awsSdkStrings.SINGLE_QUOTE
    - java.lang.String
  */
  type TextQualifier = typingsSlinky.awsSdk.quicksightMod._TextQualifier | java.lang.String
  
  type ThemeAliasList = js.Array[typingsSlinky.awsSdk.quicksightMod.ThemeAlias]
  
  type ThemeErrorList = js.Array[typingsSlinky.awsSdk.quicksightMod.ThemeError]
  
  type ThemeErrorType = typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_FAILURE | java.lang.String
  
  type ThemeName = java.lang.String
  
  type ThemeSummaryList = js.Array[typingsSlinky.awsSdk.quicksightMod.ThemeSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.QUICKSIGHT
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type ThemeType = typingsSlinky.awsSdk.quicksightMod._ThemeType | java.lang.String
  
  type ThemeVersionSummaryList = js.Array[typingsSlinky.awsSdk.quicksightMod.ThemeVersionSummary]
  
  type TimestampList = js.Array[js.Date]
  
  type Timestamp_ = js.Date
  
  type TransformOperationList = js.Array[typingsSlinky.awsSdk.quicksightMod.TransformOperation]
  
  type TypeCastFormat = java.lang.String
  
  type UpdateResourcePermissionList = js.Array[typingsSlinky.awsSdk.quicksightMod.ResourcePermission]
  
  type UserList = js.Array[typingsSlinky.awsSdk.quicksightMod.User]
  
  type UserName_ = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ADMIN
    - typingsSlinky.awsSdk.awsSdkStrings.AUTHOR
    - typingsSlinky.awsSdk.awsSdkStrings.READER
    - typingsSlinky.awsSdk.awsSdkStrings.RESTRICTED_AUTHOR
    - typingsSlinky.awsSdk.awsSdkStrings.RESTRICTED_READER
    - java.lang.String
  */
  type UserRole = typingsSlinky.awsSdk.quicksightMod._UserRole | java.lang.String
  
  type Username = java.lang.String
  
  type VersionDescription = java.lang.String
  
  type VersionNumber = scala.Double
  
  type Warehouse = java.lang.String
  
  type WorkGroup = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-04-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.quicksightMod._apiVersion | java.lang.String
  
  type long = scala.Double
  
  type timestamp = js.Date
}
