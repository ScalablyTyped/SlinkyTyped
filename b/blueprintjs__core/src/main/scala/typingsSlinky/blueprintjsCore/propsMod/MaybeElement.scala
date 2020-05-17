package typingsSlinky.blueprintjsCore.propsMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.global.JSX.Element
  - typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait MaybeElement extends js.Object

object MaybeElement {
  @scala.inline
  def `false`: typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`false` = false.asInstanceOf[typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`false`]
  @scala.inline
  implicit def apply(value: ReactElement): MaybeElement = value.asInstanceOf[MaybeElement]
  @scala.inline
  implicit def apply(value: Null): MaybeElement = value.asInstanceOf[MaybeElement]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => MaybeElement): MaybeElement = value.asInstanceOf[MaybeElement]
}

