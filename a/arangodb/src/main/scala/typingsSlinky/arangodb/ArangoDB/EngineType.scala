package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arangodb.arangodbStrings.mmfiles
  - typingsSlinky.arangodb.arangodbStrings.rocksdb
*/
trait EngineType extends js.Object

object EngineType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mmfiles: typingsSlinky.arangodb.arangodbStrings.mmfiles = this.cast("mmfiles")
  @scala.inline
  def rocksdb: typingsSlinky.arangodb.arangodbStrings.rocksdb = this.cast("rocksdb")
}

