package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mediastoredataMod {
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.mediastoredataMod.ClientApiVersions
  
  type ContentRangePattern = java.lang.String
  
  type ContentType = java.lang.String
  
  type ETag = java.lang.String
  
  type ItemList = js.Array[typingsSlinky.awsSdk.mediastoredataMod.Item]
  
  type ItemName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OBJECT
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER
    - java.lang.String
  */
  type ItemType = typingsSlinky.awsSdk.mediastoredataMod._ItemType | java.lang.String
  
  type ListLimit = scala.Double
  
  type ListPathNaming = java.lang.String
  
  type NonNegativeLong = scala.Double
  
  type PaginationToken = java.lang.String
  
  type PathNaming = java.lang.String
  
  type PayloadBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.mediastoredataMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  
  type RangePattern = java.lang.String
  
  type SHA256Hash = java.lang.String
  
  type StorageClass = typingsSlinky.awsSdk.awsSdkStrings.TEMPORAL | java.lang.String
  
  type StringPrimitive = java.lang.String
  
  type TimeStamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.STREAMING
    - java.lang.String
  */
  type UploadAvailability = typingsSlinky.awsSdk.mediastoredataMod._UploadAvailability | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-09-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.mediastoredataMod._apiVersion | java.lang.String
  
  type statusCode = scala.Double
}
