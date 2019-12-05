package typingsSlinky.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.UP
  - typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.DOWN
  - typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.STARTING
  - typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.OUT_OF_SERVICE
  - typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.UNKNOWN
*/
trait InstanceStatus extends js.Object

object InstanceStatus {
  @scala.inline
  def DOWN: typingsSlinky.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.DOWN = this.cast("DOWN")
  @scala.inline
  def OUT_OF_SERVICE: typingsSlinky.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.OUT_OF_SERVICE = this.cast("OUT_OF_SERVICE")
  @scala.inline
  def STARTING: typingsSlinky.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.STARTING = this.cast("STARTING")
  @scala.inline
  def UNKNOWN: typingsSlinky.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def UP: typingsSlinky.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.UP = this.cast("UP")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

