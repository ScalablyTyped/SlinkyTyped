package typingsSlinky.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.i18next.mod.FallbackLngObjList
*/
trait FallbackLng extends js.Object

object FallbackLng {
  @scala.inline
  implicit def apply(value: js.Array[String]): FallbackLng = value.asInstanceOf[FallbackLng]
  @scala.inline
  implicit def apply(value: FallbackLngObjList): FallbackLng = value.asInstanceOf[FallbackLng]
  @scala.inline
  implicit def apply(value: String): FallbackLng = value.asInstanceOf[FallbackLng]
}

