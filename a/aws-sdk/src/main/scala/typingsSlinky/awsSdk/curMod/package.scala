package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object curMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`af-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`ca-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`me-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`sa-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`cn-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`cn-northwest-1`
    - java.lang.String
  */
  type AWSRegion = typingsSlinky.awsSdk.curMod._AWSRegion | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REDSHIFT
    - typingsSlinky.awsSdk.awsSdkStrings.QUICKSIGHT
    - typingsSlinky.awsSdk.awsSdkStrings.ATHENA
    - java.lang.String
  */
  type AdditionalArtifact = typingsSlinky.awsSdk.curMod._AdditionalArtifact | java.lang.String
  
  type AdditionalArtifactList = js.Array[typingsSlinky.awsSdk.curMod.AdditionalArtifact]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.curMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ZIP
    - typingsSlinky.awsSdk.awsSdkStrings.GZIP
    - typingsSlinky.awsSdk.awsSdkStrings.Parquet_
    - java.lang.String
  */
  type CompressionFormat = typingsSlinky.awsSdk.curMod._CompressionFormat | java.lang.String
  
  type DeleteResponseMessage = java.lang.String
  
  type GenericString = java.lang.String
  
  type MaxResults = scala.Double
  
  type RefreshClosedReports = scala.Boolean
  
  type ReportDefinitionList = js.Array[typingsSlinky.awsSdk.curMod.ReportDefinition]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.textORcsv
    - typingsSlinky.awsSdk.awsSdkStrings.Parquet_
    - java.lang.String
  */
  type ReportFormat = typingsSlinky.awsSdk.curMod._ReportFormat | java.lang.String
  
  type ReportName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_NEW_REPORT
    - typingsSlinky.awsSdk.awsSdkStrings.OVERWRITE_REPORT
    - java.lang.String
  */
  type ReportVersioning = typingsSlinky.awsSdk.curMod._ReportVersioning | java.lang.String
  
  type S3Bucket = java.lang.String
  
  type S3Prefix = java.lang.String
  
  type SchemaElement = typingsSlinky.awsSdk.awsSdkStrings.RESOURCES | java.lang.String
  
  type SchemaElementList = js.Array[typingsSlinky.awsSdk.curMod.SchemaElement]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HOURLY
    - typingsSlinky.awsSdk.awsSdkStrings.DAILY
    - typingsSlinky.awsSdk.awsSdkStrings.MONTHLY
    - java.lang.String
  */
  type TimeUnit = typingsSlinky.awsSdk.curMod._TimeUnit | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-01-06`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.curMod._apiVersion | java.lang.String
}
