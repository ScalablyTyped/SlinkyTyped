package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object macieMod {
  
  type AWSAccountId = java.lang.String
  
  type BucketName = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.macieMod.ClientApiVersions
  
  type ErrorCode = java.lang.String
  
  type ExceptionMessage = java.lang.String
  
  type FailedS3Resources = js.Array[typingsSlinky.awsSdk.macieMod.FailedS3Resource]
  
  type MaxResults = scala.Double
  
  type MemberAccounts = js.Array[typingsSlinky.awsSdk.macieMod.MemberAccount]
  
  type NextToken = java.lang.String
  
  type Prefix = java.lang.String
  
  type S3ContinuousClassificationType = typingsSlinky.awsSdk.awsSdkStrings.FULL | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FULL
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type S3OneTimeClassificationType = typingsSlinky.awsSdk.macieMod._S3OneTimeClassificationType | java.lang.String
  
  type S3Resources = js.Array[typingsSlinky.awsSdk.macieMod.S3Resource]
  
  type S3ResourcesClassification = js.Array[typingsSlinky.awsSdk.macieMod.S3ResourceClassification]
  
  type S3ResourcesClassificationUpdate = js.Array[typingsSlinky.awsSdk.macieMod.S3ResourceClassificationUpdate]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-12-19`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.macieMod._apiVersion | java.lang.String
}
