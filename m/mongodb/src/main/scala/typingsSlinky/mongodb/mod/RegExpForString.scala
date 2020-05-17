package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// we can search using alternative types in mongodb e.g.
// string types can be searched using a regex in mongo
// array types can be searched using their element type
/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.std.RegExp
*/
trait RegExpForString[T]
  extends MongoAltQuery[js.Any]

object RegExpForString {
  @scala.inline
  implicit def apply[T](value: js.RegExp): RegExpForString[T] = value.asInstanceOf[RegExpForString[T]]
  @scala.inline
  implicit def apply[T](value: T): RegExpForString[T] = value.asInstanceOf[RegExpForString[T]]
}

