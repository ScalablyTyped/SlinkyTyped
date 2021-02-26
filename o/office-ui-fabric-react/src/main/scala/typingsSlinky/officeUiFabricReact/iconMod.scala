package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.fontIconMod.IIconContent
import typingsSlinky.officeUiFabricReact.iconTypesMod.IFontIconProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IImageIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "FontIcon")
  @js.native
  val FontIcon: ReactComponentClass[IFontIconProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "Icon")
  @js.native
  val Icon: ReactComponentClass[IIconProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "IconBase")
  @js.native
  class IconBase protected ()
    extends typingsSlinky.officeUiFabricReact.iconBaseMod.IconBase {
    def this(props: IIconProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "IconType")
  @js.native
  object IconType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.iconTypesMod.IconType with Double] = js.native
    
    /* 0 */ val default: typingsSlinky.officeUiFabricReact.iconTypesMod.IconType.default with Double = js.native
    
    /* 100000 */ val Default: typingsSlinky.officeUiFabricReact.iconTypesMod.IconType.Default with Double = js.native
    
    /* 100001 */ val Image: typingsSlinky.officeUiFabricReact.iconTypesMod.IconType.Image with Double = js.native
    
    /* 1 */ val image: typingsSlinky.officeUiFabricReact.iconTypesMod.IconType.image with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "ImageIcon")
  @js.native
  val ImageIcon: ReactComponentClass[IImageIconProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "getFontIcon")
  @js.native
  def getFontIcon(iconName: String): ReactElement | Null = js.native
  @JSImport("office-ui-fabric-react/lib/components/Icon", "getFontIcon")
  @js.native
  def getFontIcon(iconName: String, className: js.UndefOr[scala.Nothing], ariaLabel: String): ReactElement | Null = js.native
  @JSImport("office-ui-fabric-react/lib/components/Icon", "getFontIcon")
  @js.native
  def getFontIcon(iconName: String, className: String): ReactElement | Null = js.native
  @JSImport("office-ui-fabric-react/lib/components/Icon", "getFontIcon")
  @js.native
  def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "getIconContent")
  @js.native
  def getIconContent(): IIconContent | Null = js.native
  @JSImport("office-ui-fabric-react/lib/components/Icon", "getIconContent")
  @js.native
  def getIconContent(iconName: String): IIconContent | Null = js.native
}
