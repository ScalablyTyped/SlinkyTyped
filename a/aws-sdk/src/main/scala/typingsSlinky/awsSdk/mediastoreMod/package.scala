package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mediastoreMod {
  
  type AllowedHeaders = js.Array[typingsSlinky.awsSdk.mediastoreMod.Header]
  
  type AllowedMethods = js.Array[typingsSlinky.awsSdk.mediastoreMod.MethodName]
  
  type AllowedOrigins = js.Array[typingsSlinky.awsSdk.mediastoreMod.Origin]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.mediastoreMod.ClientApiVersions
  
  type ContainerARN = java.lang.String
  
  type ContainerAccessLoggingEnabled = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ContainerLevelMetrics = typingsSlinky.awsSdk.mediastoreMod._ContainerLevelMetrics | java.lang.String
  
  type ContainerList = js.Array[typingsSlinky.awsSdk.mediastoreMod.Container]
  
  type ContainerListLimit = scala.Double
  
  type ContainerName = java.lang.String
  
  type ContainerPolicy = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ContainerStatus = typingsSlinky.awsSdk.mediastoreMod._ContainerStatus | java.lang.String
  
  type CorsPolicy = js.Array[typingsSlinky.awsSdk.mediastoreMod.CorsRule]
  
  type Endpoint = java.lang.String
  
  type ExposeHeaders = js.Array[typingsSlinky.awsSdk.mediastoreMod.Header]
  
  type Header = java.lang.String
  
  type LifecyclePolicy = java.lang.String
  
  type MaxAgeSeconds = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PUT
    - typingsSlinky.awsSdk.awsSdkStrings.GET
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.HEAD
    - java.lang.String
  */
  type MethodName = typingsSlinky.awsSdk.mediastoreMod._MethodName | java.lang.String
  
  type MetricPolicyRules = js.Array[typingsSlinky.awsSdk.mediastoreMod.MetricPolicyRule]
  
  type ObjectGroup = java.lang.String
  
  type ObjectGroupName = java.lang.String
  
  type Origin = java.lang.String
  
  type PaginationToken = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.mediastoreMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.mediastoreMod.Tag]
  
  type TagValue = java.lang.String
  
  type TimeStamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-09-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.mediastoreMod._apiVersion | java.lang.String
}
