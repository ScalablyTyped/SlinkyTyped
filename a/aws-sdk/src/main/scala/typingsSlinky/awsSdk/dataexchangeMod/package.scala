package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object dataexchangeMod {
  
  type Arn = java.lang.String
  
  type AssetName = java.lang.String
  
  type AssetType = typingsSlinky.awsSdk.awsSdkStrings.S3_SNAPSHOT | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.dataexchangeMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCESS_DENIED_EXCEPTION
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_SERVER_EXCEPTION
    - typingsSlinky.awsSdk.awsSdkStrings.MALWARE_DETECTED
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND_EXCEPTION
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_QUOTA_EXCEEDED_EXCEPTION
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_EXCEPTION
    - typingsSlinky.awsSdk.awsSdkStrings.MALWARE_SCAN_ENCRYPTED_FILE
    - java.lang.String
  */
  type Code = typingsSlinky.awsSdk.dataexchangeMod._Code | java.lang.String
  
  type Description = java.lang.String
  
  type Id = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`Assets per revision`
    - typingsSlinky.awsSdk.awsSdkStrings.`Asset size in GB`
    - java.lang.String
  */
  type JobErrorLimitName = typingsSlinky.awsSdk.dataexchangeMod._JobErrorLimitName | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REVISION
    - typingsSlinky.awsSdk.awsSdkStrings.ASSET
    - java.lang.String
  */
  type JobErrorResourceTypes = typingsSlinky.awsSdk.dataexchangeMod._JobErrorResourceTypes | java.lang.String
  
  type ListOfAssetDestinationEntry = js.Array[typingsSlinky.awsSdk.dataexchangeMod.AssetDestinationEntry]
  
  type ListOfAssetEntry = js.Array[typingsSlinky.awsSdk.dataexchangeMod.AssetEntry]
  
  type ListOfAssetSourceEntry = js.Array[typingsSlinky.awsSdk.dataexchangeMod.AssetSourceEntry]
  
  type ListOfDataSetEntry = js.Array[typingsSlinky.awsSdk.dataexchangeMod.DataSetEntry]
  
  type ListOfJobEntry = js.Array[typingsSlinky.awsSdk.dataexchangeMod.JobEntry]
  
  type ListOfJobError = js.Array[typingsSlinky.awsSdk.dataexchangeMod.JobError]
  
  type ListOfRevisionEntry = js.Array[typingsSlinky.awsSdk.dataexchangeMod.RevisionEntry]
  
  type ListOfString = js.Array[typingsSlinky.awsSdk.dataexchangeMod.string]
  
  type MapOfString = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dataexchangeMod.string]
  
  type MaxResults = scala.Double
  
  type Name = java.lang.String
  
  type NextToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OWNED
    - typingsSlinky.awsSdk.awsSdkStrings.ENTITLED
    - java.lang.String
  */
  type Origin = typingsSlinky.awsSdk.dataexchangeMod._Origin | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.awsColonkms
    - typingsSlinky.awsSdk.awsSdkStrings.AES256
    - java.lang.String
  */
  type ServerSideEncryptionTypes = typingsSlinky.awsSdk.dataexchangeMod._ServerSideEncryptionTypes | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WAITING
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type State = typingsSlinky.awsSdk.dataexchangeMod._State | java.lang.String
  
  type Timestamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_ASSETS_FROM_S3
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_ASSET_FROM_SIGNED_URL
    - typingsSlinky.awsSdk.awsSdkStrings.EXPORT_ASSETS_TO_S3
    - typingsSlinky.awsSdk.awsSdkStrings.EXPORT_ASSET_TO_SIGNED_URL
    - java.lang.String
  */
  type Type = typingsSlinky.awsSdk.dataexchangeMod._Type | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-07-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.dataexchangeMod._apiVersion | java.lang.String
  
  type boolean = scala.Boolean
  
  type double = scala.Double
  
  type doubleMin0 = scala.Double
  
  type string = java.lang.String
  
  type stringMin0Max16384 = java.lang.String
  
  type stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = java.lang.String
}
