package typingsSlinky.antd.transferMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactElement
  - typingsSlinky.antd.transferMod.RenderResultObject
  - java.lang.String
  - scala.Null
*/
trait RenderResult extends js.Object

object RenderResult {
  @scala.inline
  implicit def apply(value: Null): RenderResult = value.asInstanceOf[RenderResult]
  @scala.inline
  implicit def apply(value: ReactElement): RenderResult = value.asInstanceOf[RenderResult]
  @scala.inline
  implicit def apply(value: RenderResultObject): RenderResult = value.asInstanceOf[RenderResult]
  @scala.inline
  implicit def apply(value: String): RenderResult = value.asInstanceOf[RenderResult]
}

