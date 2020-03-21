package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arangodb.arangodbStrings.hash
  - typingsSlinky.arangodb.arangodbStrings.skiplist
  - typingsSlinky.arangodb.arangodbStrings.fulltext
  - typingsSlinky.arangodb.arangodbStrings.geo
  - typingsSlinky.arangodb.arangodbStrings.ttl
*/
trait IndexType extends js.Object

object IndexType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fulltext: typingsSlinky.arangodb.arangodbStrings.fulltext = this.cast("fulltext")
  @scala.inline
  def geo: typingsSlinky.arangodb.arangodbStrings.geo = this.cast("geo")
  @scala.inline
  def hash: typingsSlinky.arangodb.arangodbStrings.hash = this.cast("hash")
  @scala.inline
  def skiplist: typingsSlinky.arangodb.arangodbStrings.skiplist = this.cast("skiplist")
  @scala.inline
  def ttl: typingsSlinky.arangodb.arangodbStrings.ttl = this.cast("ttl")
}

