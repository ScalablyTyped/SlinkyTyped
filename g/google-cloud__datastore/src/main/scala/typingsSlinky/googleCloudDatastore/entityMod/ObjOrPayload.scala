package typingsSlinky.googleCloudDatastore.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NB: TS does not support computed symbol keys (yet: https://github.com/Microsoft/TypeScript/pull/15473)
  * If using a raw T object, it MUST have a {@link Datastore_#KEY} symbol property of type {@link DatastoreKey}.
  */
/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.googleCloudDatastore.entityMod.DatastorePayload[T]
*/
trait ObjOrPayload[T] extends OneOrMany[T]

object ObjOrPayload {
  @scala.inline
  implicit def apply[T](value: DatastorePayload[T]): ObjOrPayload[T] = value.asInstanceOf[ObjOrPayload[T]]
  @scala.inline
  implicit def apply[T](value: T): ObjOrPayload[T] = value.asInstanceOf[ObjOrPayload[T]]
}

