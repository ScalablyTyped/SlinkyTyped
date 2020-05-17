package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[T]
  - typingsSlinky.arcgisJsApi.esri.Collection[T]
*/
trait CollectionProperties[T] extends js.Object

object CollectionProperties {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): CollectionProperties[T] = value.asInstanceOf[CollectionProperties[T]]
  @scala.inline
  implicit def apply[T](value: Collection[T]): CollectionProperties[T] = value.asInstanceOf[CollectionProperties[T]]
}

