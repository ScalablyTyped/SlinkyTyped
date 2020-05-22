package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appsyncMod {
  type AdditionalAuthenticationProviders = js.Array[typingsSlinky.awsSdk.appsyncMod.AdditionalAuthenticationProvider]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.MODIFYING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ApiCacheStatus = typingsSlinky.awsSdk.appsyncMod._ApiCacheStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.T2_SMALL
    - typingsSlinky.awsSdk.awsSdkStrings.T2_MEDIUM
    - typingsSlinky.awsSdk.awsSdkStrings.R4_LARGE
    - typingsSlinky.awsSdk.awsSdkStrings.R4_XLARGE
    - typingsSlinky.awsSdk.awsSdkStrings.R4_2XLARGE
    - typingsSlinky.awsSdk.awsSdkStrings.R4_4XLARGE
    - typingsSlinky.awsSdk.awsSdkStrings.R4_8XLARGE
    - java.lang.String
  */
  type ApiCacheType = typingsSlinky.awsSdk.appsyncMod._ApiCacheType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FULL_REQUEST_CACHING
    - typingsSlinky.awsSdk.awsSdkStrings.PER_RESOLVER_CACHING
    - java.lang.String
  */
  type ApiCachingBehavior = typingsSlinky.awsSdk.appsyncMod._ApiCachingBehavior | java.lang.String
  type ApiKeys = js.Array[typingsSlinky.awsSdk.appsyncMod.ApiKey]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.API_KEY
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_IAM
    - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_COGNITO_USER_POOLS
    - typingsSlinky.awsSdk.awsSdkStrings.OPENID_CONNECT
    - java.lang.String
  */
  type AuthenticationType = typingsSlinky.awsSdk.appsyncMod._AuthenticationType | java.lang.String
  type AuthorizationType = typingsSlinky.awsSdk.awsSdkStrings.AWS_IAM | java.lang.String
  type Boolean = scala.Boolean
  type BooleanValue = scala.Boolean
  type CachingKeys = js.Array[typingsSlinky.awsSdk.appsyncMod.String]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.appsyncMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VERSION
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ConflictDetectionType = typingsSlinky.awsSdk.appsyncMod._ConflictDetectionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OPTIMISTIC_CONCURRENCY
    - typingsSlinky.awsSdk.awsSdkStrings.LAMBDA
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOMERGE
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ConflictHandlerType = typingsSlinky.awsSdk.appsyncMod._ConflictHandlerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_LAMBDA
    - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_DYNAMODB
    - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_ELASTICSEARCH
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - typingsSlinky.awsSdk.awsSdkStrings.RELATIONAL_DATABASE
    - java.lang.String
  */
  type DataSourceType = typingsSlinky.awsSdk.appsyncMod._DataSourceType | java.lang.String
  type DataSources = js.Array[typingsSlinky.awsSdk.appsyncMod.DataSource]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW
    - typingsSlinky.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type DefaultAction = typingsSlinky.awsSdk.appsyncMod._DefaultAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type FieldLogLevel = typingsSlinky.awsSdk.appsyncMod._FieldLogLevel | java.lang.String
  type Functions = js.Array[typingsSlinky.awsSdk.appsyncMod.FunctionConfiguration]
  type FunctionsIds = js.Array[typingsSlinky.awsSdk.appsyncMod.String]
  type GraphqlApis = js.Array[typingsSlinky.awsSdk.appsyncMod.GraphqlApi]
  type Long = scala.Double
  type MapOfStringToString = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.appsyncMod.String]
  type MappingTemplate = java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SDL
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type OutputType = typingsSlinky.awsSdk.appsyncMod._OutputType | java.lang.String
  type PaginationToken = java.lang.String
  type RelationalDatabaseSourceType = typingsSlinky.awsSdk.awsSdkStrings.RDS_HTTP_ENDPOINT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNIT
    - typingsSlinky.awsSdk.awsSdkStrings.PIPELINE
    - java.lang.String
  */
  type ResolverKind = typingsSlinky.awsSdk.appsyncMod._ResolverKind | java.lang.String
  type Resolvers = js.Array[typingsSlinky.awsSdk.appsyncMod.Resolver]
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PROCESSING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_APPLICABLE
    - java.lang.String
  */
  type SchemaStatus = typingsSlinky.awsSdk.appsyncMod._SchemaStatus | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.appsyncMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.appsyncMod.TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SDL
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type TypeDefinitionFormat = typingsSlinky.awsSdk.appsyncMod._TypeDefinitionFormat | java.lang.String
  type TypeList = js.Array[typingsSlinky.awsSdk.appsyncMod.Type]
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.appsyncMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-07-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.appsyncMod._apiVersion | java.lang.String
}
