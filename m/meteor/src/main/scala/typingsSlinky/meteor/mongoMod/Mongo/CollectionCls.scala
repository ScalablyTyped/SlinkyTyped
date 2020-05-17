package typingsSlinky.meteor.mongoMod.Mongo

import typingsSlinky.meteor.anon.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/mongo", "Mongo.Collection")
@js.native
class CollectionCls[T] () extends Collection[T] {
  def this(name: String) = this()
  def this(name: String, options: Connection) = this()
  def this(name: Null, options: Connection) = this()
}

