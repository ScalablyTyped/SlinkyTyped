package typingsSlinky.intercomClient.mod

import typingsSlinky.intercomClient.intercomErrorMod.IntercomError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * d * / T, scala.Unit]
  - js.Function2[
/ * err * / typingsSlinky.intercomClient.intercomErrorMod.IntercomError, 
/ * d * / T, 
scala.Unit]
*/
trait callback[T] extends js.Object

object callback {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* d */ T, Unit]): callback[T] = value.asInstanceOf[callback[T]]
  @scala.inline
  implicit def apply[T](value: js.Function2[/* err */ IntercomError, /* d */ T, Unit]): callback[T] = value.asInstanceOf[callback[T]]
}

