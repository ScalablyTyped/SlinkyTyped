package typingsSlinky.emberUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Tuple5[js.Any, js.Any, js.Any, js.Any, js.Any]
  - js.Tuple4[js.Any, js.Any, js.Any, js.Any]
  - js.Tuple3[js.Any, js.Any, js.Any]
  - js.Tuple2[js.Any, js.Any]
  - js.Array[js.Any]
*/
trait FunctionArgs[F] extends js.Object

object FunctionArgs {
  @scala.inline
  implicit def apply[F](value: js.Array[js.Any]): FunctionArgs[F] = value.asInstanceOf[FunctionArgs[F]]
  @scala.inline
  implicit def apply[F](value: js.Tuple2[js.Any, js.Any]): FunctionArgs[F] = value.asInstanceOf[FunctionArgs[F]]
  @scala.inline
  implicit def apply[F](value: js.Tuple3[js.Any, js.Any, js.Any]): FunctionArgs[F] = value.asInstanceOf[FunctionArgs[F]]
  @scala.inline
  implicit def apply[F](value: js.Tuple4[js.Any, js.Any, js.Any, js.Any]): FunctionArgs[F] = value.asInstanceOf[FunctionArgs[F]]
  @scala.inline
  implicit def apply[F](value: js.Tuple5[js.Any, js.Any, js.Any, js.Any, js.Any]): FunctionArgs[F] = value.asInstanceOf[FunctionArgs[F]]
}

