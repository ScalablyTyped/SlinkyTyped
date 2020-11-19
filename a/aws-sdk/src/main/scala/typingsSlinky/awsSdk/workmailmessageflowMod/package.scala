package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object workmailmessageflowMod {
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.workmailmessageflowMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-05-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.workmailmessageflowMod._apiVersion | java.lang.String
  
  type messageContentBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.workmailmessageflowMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  
  type messageIdType = java.lang.String
}
