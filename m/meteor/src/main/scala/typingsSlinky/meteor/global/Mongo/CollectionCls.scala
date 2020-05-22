package typingsSlinky.meteor.global.Mongo

import typingsSlinky.meteor.anon.IdGeneration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mongo.Collection")
@js.native
class CollectionCls[T] ()
  extends typingsSlinky.meteor.Mongo.Collection[T] {
  def this(name: String) = this()
  def this(name: String, options: IdGeneration) = this()
  def this(name: Null, options: IdGeneration) = this()
}

