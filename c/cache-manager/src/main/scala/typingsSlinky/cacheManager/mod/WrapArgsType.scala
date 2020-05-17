package typingsSlinky.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function1[/ * callback * / typingsSlinky.cacheManager.mod.CallbackFunc[T], scala.Unit]
  - typingsSlinky.cacheManager.mod.CachingConfig
  - typingsSlinky.cacheManager.mod.CallbackFunc[T]
*/
trait WrapArgsType[T] extends js.Object

object WrapArgsType {
  @scala.inline
  implicit def apply[T](value: CachingConfig): WrapArgsType[T] = value.asInstanceOf[WrapArgsType[T]]
  @scala.inline
  implicit def apply[T](value: CallbackFunc[T]): WrapArgsType[T] = value.asInstanceOf[WrapArgsType[T]]
  @scala.inline
  implicit def apply[T](value: js.Function1[/* callback */ CallbackFunc[T], Unit]): WrapArgsType[T] = value.asInstanceOf[WrapArgsType[T]]
  @scala.inline
  implicit def apply[T](value: String): WrapArgsType[T] = value.asInstanceOf[WrapArgsType[T]]
}

