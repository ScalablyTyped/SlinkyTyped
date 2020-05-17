package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - js.Object
*/
trait AnyJs extends js.Object

object AnyJs {
  @scala.inline
  implicit def apply(value: Boolean): AnyJs = value.asInstanceOf[AnyJs]
  @scala.inline
  implicit def apply(value: Double): AnyJs = value.asInstanceOf[AnyJs]
  @scala.inline
  implicit def apply(value: Null): AnyJs = value.asInstanceOf[AnyJs]
  @scala.inline
  implicit def apply(value: js.Object): AnyJs = value.asInstanceOf[AnyJs]
  @scala.inline
  implicit def apply(value: String): AnyJs = value.asInstanceOf[AnyJs]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => AnyJs): AnyJs = value.asInstanceOf[AnyJs]
}

