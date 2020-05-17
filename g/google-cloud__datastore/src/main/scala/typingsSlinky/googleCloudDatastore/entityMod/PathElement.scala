package typingsSlinky.googleCloudDatastore.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.googleCloudDatastore.entityMod.DatastoreInt
*/
trait PathElement extends js.Object

object PathElement {
  @scala.inline
  implicit def apply(value: DatastoreInt): PathElement = value.asInstanceOf[PathElement]
  @scala.inline
  implicit def apply(value: Double): PathElement = value.asInstanceOf[PathElement]
  @scala.inline
  implicit def apply(value: String): PathElement = value.asInstanceOf[PathElement]
}

