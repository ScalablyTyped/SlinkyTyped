package typingsSlinky.materialUiCore.helpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * repeated * / js.Any, scala.Unit]
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait ChainedFunction extends js.Object

object ChainedFunction {
  @scala.inline
  implicit def apply(value: js.Function1[/* repeated */ js.Any, Unit]): ChainedFunction = value.asInstanceOf[ChainedFunction]
  @scala.inline
  implicit def apply(value: Null): ChainedFunction = value.asInstanceOf[ChainedFunction]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ChainedFunction): ChainedFunction = value.asInstanceOf[ChainedFunction]
}

