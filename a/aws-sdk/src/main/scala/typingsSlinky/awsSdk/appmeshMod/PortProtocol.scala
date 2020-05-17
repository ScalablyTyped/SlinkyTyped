package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.grpc
  - typingsSlinky.awsSdk.awsSdkStrings.http_
  - typingsSlinky.awsSdk.awsSdkStrings.http2
  - typingsSlinky.awsSdk.awsSdkStrings.tcp_
  - java.lang.String
*/
trait PortProtocol extends js.Object

object PortProtocol {
  @scala.inline
  def grpc: typingsSlinky.awsSdk.awsSdkStrings.grpc = "grpc".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.grpc]
  @scala.inline
  def http_ : typingsSlinky.awsSdk.awsSdkStrings.http_ = "http".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.http_]
  @scala.inline
  def http2: typingsSlinky.awsSdk.awsSdkStrings.http2 = "http2".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.http2]
  @scala.inline
  def tcp_ : typingsSlinky.awsSdk.awsSdkStrings.tcp_ = "tcp".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.tcp_]
  @scala.inline
  implicit def apply(value: java.lang.String): PortProtocol = value.asInstanceOf[PortProtocol]
}

