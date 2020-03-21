package typingsSlinky.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.ADDED
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.MODIFIED
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.DELETED
*/
trait ActionType extends js.Object

object ActionType {
  @scala.inline
  def ADDED: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.ADDED = this.cast("ADDED")
  @scala.inline
  def DELETED: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.DELETED = this.cast("DELETED")
  @scala.inline
  def MODIFIED: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.MODIFIED = this.cast("MODIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

