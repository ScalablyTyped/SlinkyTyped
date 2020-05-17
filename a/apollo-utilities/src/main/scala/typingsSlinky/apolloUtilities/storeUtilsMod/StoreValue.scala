package typingsSlinky.apolloUtilities.storeUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.apolloUtilities.storeUtilsMod.IdValue
  - typingsSlinky.apolloUtilities.storeUtilsMod.ListValue
  - typingsSlinky.apolloUtilities.storeUtilsMod.JsonValue
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - scala.Unit
  - js.Object
*/
trait StoreValue extends js.Object

object StoreValue {
  @scala.inline
  implicit def apply(value: js.Array[String] | ListValue): StoreValue = value.asInstanceOf[StoreValue]
  @scala.inline
  implicit def apply(value: Double): StoreValue = value.asInstanceOf[StoreValue]
  @scala.inline
  implicit def apply(value: IdValue): StoreValue = value.asInstanceOf[StoreValue]
  @scala.inline
  implicit def apply(value: JsonValue): StoreValue = value.asInstanceOf[StoreValue]
  @scala.inline
  implicit def apply(value: Null): StoreValue = value.asInstanceOf[StoreValue]
  @scala.inline
  implicit def apply(value: js.Object): StoreValue = value.asInstanceOf[StoreValue]
  @scala.inline
  implicit def apply(value: String): StoreValue = value.asInstanceOf[StoreValue]
  @scala.inline
  implicit def apply(value: Unit): StoreValue = value.asInstanceOf[StoreValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => StoreValue): StoreValue = value.asInstanceOf[StoreValue]
}

