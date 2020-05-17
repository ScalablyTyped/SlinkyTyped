package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.fontIconMod.IIconContent
import typingsSlinky.officeUiFabricReact.iconTypesMod.IFontIconProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IImageIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Icon", JSImport.Namespace)
@js.native
object libIconMod extends js.Object {
  @js.native
  class IconBase protected ()
    extends typingsSlinky.officeUiFabricReact.iconMod.IconBase {
    def this(props: IIconProps) = this()
  }
  
  val FontIcon: ReactComponentClass[IFontIconProps] = js.native
  val Icon: ReactComponentClass[IIconProps] = js.native
  val ImageIcon: ReactComponentClass[IImageIconProps] = js.native
  def getFontIcon(iconName: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = js.native
  def getIconContent(): IIconContent | Null = js.native
  def getIconContent(iconName: String): IIconContent | Null = js.native
  @js.native
  object IconType extends js.Object {
    /* 100000 */ val Default: typingsSlinky.officeUiFabricReact.iconTypesMod.IconType.Default with Double = js.native
    /* 100001 */ val Image: typingsSlinky.officeUiFabricReact.iconTypesMod.IconType.Image with Double = js.native
    /* 0 */ val default: typingsSlinky.officeUiFabricReact.iconTypesMod.IconType.default with Double = js.native
    /* 1 */ val image: typingsSlinky.officeUiFabricReact.iconTypesMod.IconType.image with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.iconTypesMod.IconType with Double] = js.native
  }
  
}

