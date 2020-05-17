package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.REGIONAL
  - typingsSlinky.awsSdk.awsSdkStrings.EDGE
  - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
trait EndpointType extends js.Object

object EndpointType {
  @scala.inline
  def REGIONAL: typingsSlinky.awsSdk.awsSdkStrings.REGIONAL = "REGIONAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REGIONAL]
  @scala.inline
  def EDGE: typingsSlinky.awsSdk.awsSdkStrings.EDGE = "EDGE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EDGE]
  @scala.inline
  def PRIVATE: typingsSlinky.awsSdk.awsSdkStrings.PRIVATE = "PRIVATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PRIVATE]
  @scala.inline
  implicit def apply(value: java.lang.String): EndpointType = value.asInstanceOf[EndpointType]
}

