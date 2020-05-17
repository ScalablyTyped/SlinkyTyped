package typingsSlinky.mongodb.mod

import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bson.mod.ObjectId
  - typingsSlinky.std.Exclude[js.Any, js.Object]
*/
trait ExtractIdType[TSchema] extends js.Object

object ExtractIdType {
  @scala.inline
  implicit def apply[TSchema](value: Exclude[js.Any, js.Object]): ExtractIdType[TSchema] = value.asInstanceOf[ExtractIdType[TSchema]]
  @scala.inline
  implicit def apply[TSchema](value: typingsSlinky.bson.mod.ObjectId): ExtractIdType[TSchema] = value.asInstanceOf[ExtractIdType[TSchema]]
}

