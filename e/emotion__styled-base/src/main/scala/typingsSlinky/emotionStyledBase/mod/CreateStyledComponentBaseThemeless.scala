package typingsSlinky.emotionStyledBase.mod

import typingsSlinky.emotionSerialize.mod.Interpolation
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.emotionStyledBase.helperMod.Overwrapped
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStyledComponentBaseThemeless[InnerProps, ExtraProps]
  extends CreateStyledComponentBase[InnerProps, ExtraProps, js.Any] {
  
  def apply[StyleProps /* <: Omit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */, Theme /* <: js.Object */](styles: (Interpolation[WithTheme[StyleProps, Theme]])*): StyledComponent[InnerProps, StyleProps, Theme] = js.native
  def apply[StyleProps /* <: Omit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */, Theme /* <: js.Object */](template: TemplateStringsArray, styles: (Interpolation[WithTheme[StyleProps, Theme]])*): StyledComponent[InnerProps, StyleProps, Theme] = js.native
}
