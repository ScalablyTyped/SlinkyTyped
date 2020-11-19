package typingsSlinky.officeUiFabricReact.iconTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.imageTypesMod.IImageProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIconProps
  extends HTMLAttributes[HTMLElement]
     with IBaseProps[js.Any] {
  
  /**
    * The aria label of the icon for the benefit of screen readers.
    * @deprecated Use the native prop `aria-label`
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * The name of the icon to use from the icon font.
    * If string is empty, a placeholder icon will be rendered the same width as an icon.
    */
  var iconName: js.UndefOr[String] = js.native
  
  /**
    * The type of icon to render (image or icon font).
    * @deprecated Inferred based on the presence of `imageProps`
    */
  var iconType: js.UndefOr[IconType] = js.native
  
  /**
    * If rendering an image icon, this component will be rendered in the event that loading the image fails.
    */
  var imageErrorAs: js.UndefOr[ReactComponentClass[IImageProps]] = js.native
  
  /**
    * If rendering an image icon, these props will be passed to the Image component.
    */
  var imageProps: js.UndefOr[IImageProps] = js.native
  
  /**
    * Gets the styles for an Icon.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IIconStyleProps, IIconStyles]] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
}
object IIconProps {
  
  @scala.inline
  def apply(): IIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIconProps]
  }
  
  @scala.inline
  implicit class IIconPropsOps[Self <: IIconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setIconName(value: String): Self = this.set("iconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconName: Self = this.set("iconName", js.undefined)
    
    @scala.inline
    def setIconType(value: IconType): Self = this.set("iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconType: Self = this.set("iconType", js.undefined)
    
    @scala.inline
    def setImageErrorAsFunctionComponent(value: ReactComponentClass[IImageProps]): Self = this.set("imageErrorAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageErrorAsComponentClass(value: ReactComponentClass[IImageProps]): Self = this.set("imageErrorAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageErrorAs(value: ReactComponentClass[IImageProps]): Self = this.set("imageErrorAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageErrorAs: Self = this.set("imageErrorAs", js.undefined)
    
    @scala.inline
    def setImageProps(value: IImageProps): Self = this.set("imageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageProps: Self = this.set("imageProps", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IIconStyleProps => DeepPartial[IIconStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IIconStyleProps, IIconStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
