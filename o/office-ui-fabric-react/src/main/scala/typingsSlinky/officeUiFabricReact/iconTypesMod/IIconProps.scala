package typingsSlinky.officeUiFabricReact.iconTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.imageTypesMod.IImageProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(js.undefined)
        ret
    }
    @scala.inline
    def withIconType(value: IconType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconType")(js.undefined)
        ret
    }
    @scala.inline
    def withImageErrorAsFunctionComponent(value: ReactComponentClass[IImageProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageErrorAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageErrorAsComponentClass(value: ReactComponentClass[IImageProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageErrorAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageErrorAs(value: ReactComponentClass[IImageProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageErrorAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageErrorAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageErrorAs")(js.undefined)
        ret
    }
    @scala.inline
    def withImageProps(value: IImageProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProps")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IIconStyleProps => Partial[IIconStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IIconStyleProps, IIconStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

