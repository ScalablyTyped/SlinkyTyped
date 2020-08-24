package typingsSlinky.officeUiFabricReact.indexBundleMod

import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.absolute
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.relative
import typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
import typingsSlinky.uifabricStyling.igetfocusstylesMod.IGetFocusStylesOptions
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/index.bundle", "getFocusStyle")
@js.native
object getFocusStyle extends js.Object {
  def apply(theme: ITheme): IRawStyle = js.native
  def apply(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[relative | absolute],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  def apply(theme: ITheme, options: IGetFocusStylesOptions): IRawStyle = js.native
}

