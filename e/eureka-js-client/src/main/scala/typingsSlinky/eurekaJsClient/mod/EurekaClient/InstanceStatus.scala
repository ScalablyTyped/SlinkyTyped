package typingsSlinky.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.UP
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.DOWN
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.STARTING
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.OUT_OF_SERVICE
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.UNKNOWN
*/
trait InstanceStatus extends js.Object

object InstanceStatus {
  @scala.inline
  def DOWN: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.DOWN = this.cast("DOWN")
  @scala.inline
  def OUT_OF_SERVICE: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.OUT_OF_SERVICE = this.cast("OUT_OF_SERVICE")
  @scala.inline
  def STARTING: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.STARTING = this.cast("STARTING")
  @scala.inline
  def UNKNOWN: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def UP: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.UP = this.cast("UP")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

