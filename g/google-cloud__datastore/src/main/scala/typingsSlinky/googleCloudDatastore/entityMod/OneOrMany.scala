package typingsSlinky.googleCloudDatastore.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleCloudDatastore.entityMod.ObjOrPayload[T]
  - js.Array[typingsSlinky.googleCloudDatastore.entityMod.ObjOrPayload[T]]
*/
trait OneOrMany[T] extends js.Object

object OneOrMany {
  @scala.inline
  implicit def apply[T](value: js.Array[ObjOrPayload[T]]): OneOrMany[T] = value.asInstanceOf[OneOrMany[T]]
  @scala.inline
  implicit def apply[T](value: ObjOrPayload[T]): OneOrMany[T] = value.asInstanceOf[OneOrMany[T]]
}

