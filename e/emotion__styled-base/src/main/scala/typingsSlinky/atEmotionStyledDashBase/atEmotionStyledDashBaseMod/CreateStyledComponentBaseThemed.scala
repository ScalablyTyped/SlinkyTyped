package typingsSlinky.atEmotionStyledDashBase.atEmotionStyledDashBaseMod

import typingsSlinky.atEmotionSerialize.atEmotionSerializeMod.Interpolation
import typingsSlinky.atEmotionStyledDashBase.typesHelperMod.Omit
import typingsSlinky.atEmotionStyledDashBase.typesHelperMod.Overwrapped
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStyledComponentBaseThemed[InnerProps, ExtraProps, StyledInstanceTheme /* <: js.Object */] extends CreateStyledComponentBase[InnerProps, ExtraProps, StyledInstanceTheme] {
  def apply[StyleProps /* <: Omit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */](styles: (Interpolation[WithTheme[StyleProps, StyledInstanceTheme]])*): StyledComponent[InnerProps, StyleProps, StyledInstanceTheme] = js.native
  def apply[StyleProps /* <: Omit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */](
    template: TemplateStringsArray,
    styles: (Interpolation[WithTheme[StyleProps, StyledInstanceTheme]])*
  ): StyledComponent[InnerProps, StyleProps, StyledInstanceTheme] = js.native
}

