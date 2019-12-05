package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.arangodbStrings.any
  - typings.arangodb.arangodbStrings.inbound
  - typings.arangodb.arangodbStrings.outbound
*/
trait EdgeDirection extends js.Object

object EdgeDirection {
  @scala.inline
  def any: typingsSlinky.arangodb.arangodbStrings.any = this.cast("any")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inbound: typingsSlinky.arangodb.arangodbStrings.inbound = this.cast("inbound")
  @scala.inline
  def outbound: typingsSlinky.arangodb.arangodbStrings.outbound = this.cast("outbound")
}

