package typingsSlinky.log4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.log4js.mod.BaseLayout
  - typingsSlinky.log4js.mod.ColoredLayout
  - typingsSlinky.log4js.mod.MessagePassThroughLayout
  - typingsSlinky.log4js.mod.DummyLayout
  - typingsSlinky.log4js.mod.PatternLayout
  - typingsSlinky.log4js.mod.CustomLayout
*/
trait Layout extends js.Object

object Layout {
  @scala.inline
  implicit def apply(value: BaseLayout): Layout = value.asInstanceOf[Layout]
  @scala.inline
  implicit def apply(value: ColoredLayout): Layout = value.asInstanceOf[Layout]
  @scala.inline
  implicit def apply(value: CustomLayout): Layout = value.asInstanceOf[Layout]
  @scala.inline
  implicit def apply(value: DummyLayout): Layout = value.asInstanceOf[Layout]
  @scala.inline
  implicit def apply(value: MessagePassThroughLayout): Layout = value.asInstanceOf[Layout]
  @scala.inline
  implicit def apply(value: PatternLayout): Layout = value.asInstanceOf[Layout]
}

