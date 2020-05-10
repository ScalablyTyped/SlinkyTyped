package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sagemakerruntimeMod {
  type BodyBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.sagemakerruntimeMod.Blob | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.sagemakerruntimeMod.ClientApiVersions
  type CustomAttributesHeader = java.lang.String
  type EndpointName = java.lang.String
  type Header = java.lang.String
  type TargetModelHeader = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-05-13`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.sagemakerruntimeMod._apiVersion | java.lang.String
}
