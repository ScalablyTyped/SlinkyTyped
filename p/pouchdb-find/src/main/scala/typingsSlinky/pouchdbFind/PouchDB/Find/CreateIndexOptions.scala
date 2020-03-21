package typingsSlinky.pouchdbFind.PouchDB.Find

import typingsSlinky.pouchdbFind.AnonDdoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexOptions extends js.Object {
  var index: AnonDdoc
}

object CreateIndexOptions {
  @scala.inline
  def apply(index: AnonDdoc): CreateIndexOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateIndexOptions]
  }
}

