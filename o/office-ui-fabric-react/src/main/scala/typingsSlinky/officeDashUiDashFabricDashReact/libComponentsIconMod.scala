package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IFontIconProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IImageIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Icon", JSImport.Namespace)
@js.native
object libComponentsIconMod extends js.Object {
  @js.native
  class IconBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsIconIconDotBaseMod.IconBase {
    def this(props: IIconProps) = this()
  }
  
  val FontIcon: ReactComponentClass[IFontIconProps] = js.native
  val Icon: ReactComponentClass[IIconProps] = js.native
  val ImageIcon: ReactComponentClass[IImageIconProps] = js.native
  def getFontIcon(iconName: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: js.UndefOr[scala.Nothing], ariaLabel: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = js.native
  def getIconContent(): Anon_Children = js.native
  def getIconContent(iconName: String): Anon_Children = js.native
  @js.native
  object IconType extends js.Object {
    /* 100000 */ val Default: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.Default with Double = js.native
    /* 100001 */ val Image: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.Image with Double = js.native
    /* 0 */ val default: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.default with Double = js.native
    /* 1 */ val image: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.image with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType with Double
      ] = js.native
  }
  
}

