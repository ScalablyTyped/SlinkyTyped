package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lakeformationMod {
  type BatchPermissionsFailureList = js.Array[typingsSlinky.awsSdk.lakeformationMod.BatchPermissionsFailureEntry]
  type BatchPermissionsRequestEntryList = js.Array[typingsSlinky.awsSdk.lakeformationMod.BatchPermissionsRequestEntry]
  type CatalogIdString = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.lakeformationMod.ClientApiVersions
  type ColumnNames = js.Array[typingsSlinky.awsSdk.lakeformationMod.NameString]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQ
    - typingsSlinky.awsSdk.awsSdkStrings.NE
    - typingsSlinky.awsSdk.awsSdkStrings.LE
    - typingsSlinky.awsSdk.awsSdkStrings.LT
    - typingsSlinky.awsSdk.awsSdkStrings.GE
    - typingsSlinky.awsSdk.awsSdkStrings.GT
    - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_CONTAINS
    - typingsSlinky.awsSdk.awsSdkStrings.BEGINS_WITH
    - typingsSlinky.awsSdk.awsSdkStrings.IN
    - typingsSlinky.awsSdk.awsSdkStrings.BETWEEN
    - java.lang.String
  */
  type ComparisonOperator = typingsSlinky.awsSdk.lakeformationMod._ComparisonOperator | java.lang.String
  type DataLakePrincipalList = js.Array[typingsSlinky.awsSdk.lakeformationMod.DataLakePrincipal]
  type DataLakePrincipalString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CATALOG
    - typingsSlinky.awsSdk.awsSdkStrings.DATABASE
    - typingsSlinky.awsSdk.awsSdkStrings.TABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_LOCATION
    - java.lang.String
  */
  type DataLakeResourceType = typingsSlinky.awsSdk.lakeformationMod._DataLakeResourceType | java.lang.String
  type DescriptionString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_ARN
    - typingsSlinky.awsSdk.awsSdkStrings.ROLE_ARN
    - typingsSlinky.awsSdk.awsSdkStrings.LAST_MODIFIED
    - java.lang.String
  */
  type FieldNameString = typingsSlinky.awsSdk.lakeformationMod._FieldNameString | java.lang.String
  type FilterConditionList = js.Array[typingsSlinky.awsSdk.lakeformationMod.FilterCondition]
  type IAMRoleArn = java.lang.String
  type Identifier = java.lang.String
  type LastModifiedTimestamp = js.Date
  type NameString = java.lang.String
  type NullableBoolean = scala.Boolean
  type PageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - typingsSlinky.awsSdk.awsSdkStrings.SELECT
    - typingsSlinky.awsSdk.awsSdkStrings.ALTER
    - typingsSlinky.awsSdk.awsSdkStrings.DROP
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.INSERT
    - typingsSlinky.awsSdk.awsSdkStrings.DESCRIBE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_DATABASE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_TABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_LOCATION_ACCESS
    - java.lang.String
  */
  type Permission = typingsSlinky.awsSdk.lakeformationMod._Permission | java.lang.String
  type PermissionList = js.Array[typingsSlinky.awsSdk.lakeformationMod.Permission]
  type PrincipalPermissionsList = js.Array[typingsSlinky.awsSdk.lakeformationMod.PrincipalPermissions]
  type PrincipalResourcePermissionsList = js.Array[typingsSlinky.awsSdk.lakeformationMod.PrincipalResourcePermissions]
  type ResourceArnString = java.lang.String
  type ResourceInfoList = js.Array[typingsSlinky.awsSdk.lakeformationMod.ResourceInfo]
  type StringValue = java.lang.String
  type StringValueList = js.Array[typingsSlinky.awsSdk.lakeformationMod.StringValue]
  type Token = java.lang.String
  type TrustedResourceOwners = js.Array[typingsSlinky.awsSdk.lakeformationMod.CatalogIdString]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-03-31`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.lakeformationMod._apiVersion | java.lang.String
}
