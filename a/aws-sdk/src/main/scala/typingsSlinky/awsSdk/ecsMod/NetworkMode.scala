package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.bridge
  - typingsSlinky.awsSdk.awsSdkStrings.host_
  - typingsSlinky.awsSdk.awsSdkStrings.awsvpc_
  - typingsSlinky.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
trait NetworkMode extends js.Object

object NetworkMode {
  @scala.inline
  def bridge: typingsSlinky.awsSdk.awsSdkStrings.bridge = "bridge".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.bridge]
  @scala.inline
  def host_ : typingsSlinky.awsSdk.awsSdkStrings.host_ = "host".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.host_]
  @scala.inline
  def awsvpc_ : typingsSlinky.awsSdk.awsSdkStrings.awsvpc_ = "awsvpc".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.awsvpc_]
  @scala.inline
  def none__ : typingsSlinky.awsSdk.awsSdkStrings.none__ = "none".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.none__]
  @scala.inline
  implicit def apply(value: java.lang.String): NetworkMode = value.asInstanceOf[NetworkMode]
}

