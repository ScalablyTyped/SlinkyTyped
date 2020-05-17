package typingsSlinky.emotionStyledBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emotionStyledBase.mod.CreateStyledComponentBaseThemed[InnerProps, ExtraProps, StyledInstanceTheme]
  - typingsSlinky.emotionStyledBase.mod.CreateStyledComponentBaseThemeless[InnerProps, ExtraProps]
*/
trait CreateStyledComponentBase[InnerProps, ExtraProps, StyledInstanceTheme /* <: js.Object */] extends js.Object

object CreateStyledComponentBase {
  @scala.inline
  implicit def apply[InnerProps, ExtraProps, StyledInstanceTheme](value: CreateStyledComponentBaseThemed[InnerProps, ExtraProps, StyledInstanceTheme]): CreateStyledComponentBase[InnerProps, ExtraProps, StyledInstanceTheme] = value.asInstanceOf[CreateStyledComponentBase[InnerProps, ExtraProps, StyledInstanceTheme]]
  @scala.inline
  implicit def apply[InnerProps, ExtraProps, StyledInstanceTheme](value: CreateStyledComponentBaseThemeless[InnerProps, ExtraProps]): CreateStyledComponentBase[InnerProps, ExtraProps, StyledInstanceTheme] = value.asInstanceOf[CreateStyledComponentBase[InnerProps, ExtraProps, StyledInstanceTheme]]
}

