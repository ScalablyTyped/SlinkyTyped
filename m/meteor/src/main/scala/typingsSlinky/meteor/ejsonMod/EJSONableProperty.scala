package typingsSlinky.meteor.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - scala.Boolean
  - js.Object
  - js.Array[scala.Double | js.Object | java.lang.String]
  - typingsSlinky.std.Date
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.meteor.ejsonMod.EJSONableCustomType
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait EJSONableProperty extends js.Object

object EJSONableProperty {
  @scala.inline
  implicit def apply(value: js.Array[Double | js.Object | String]): EJSONableProperty = value.asInstanceOf[EJSONableProperty]
  @scala.inline
  implicit def apply(value: Boolean): EJSONableProperty = value.asInstanceOf[EJSONableProperty]
  @scala.inline
  implicit def apply(value: js.Date): EJSONableProperty = value.asInstanceOf[EJSONableProperty]
  @scala.inline
  implicit def apply(value: Double): EJSONableProperty = value.asInstanceOf[EJSONableProperty]
  @scala.inline
  implicit def apply(value: EJSONableCustomType): EJSONableProperty = value.asInstanceOf[EJSONableProperty]
  @scala.inline
  implicit def apply(value: Null): EJSONableProperty = value.asInstanceOf[EJSONableProperty]
  @scala.inline
  implicit def apply(value: js.Object): EJSONableProperty = value.asInstanceOf[EJSONableProperty]
  @scala.inline
  implicit def apply(value: String): EJSONableProperty = value.asInstanceOf[EJSONableProperty]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): EJSONableProperty = value.asInstanceOf[EJSONableProperty]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => EJSONableProperty): EJSONableProperty = value.asInstanceOf[EJSONableProperty]
}

