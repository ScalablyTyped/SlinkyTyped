package typingsSlinky.officeUiFabricReact.choiceGroupTypesMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.AnonWidth
import typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionStyleProps
import typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionStyles
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupOption extends InputHTMLAttributes[HTMLElement | HTMLInputElement] {
  /**
    * Aria label of the option for the benefit of screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Props for an icon to display with this option.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Alt text if the option is an image.
    * @default '' (empty string)
    */
  var imageAlt: js.UndefOr[String] = js.native
  /**
    * The width and height of the image in px for choice field.
    * @defaultvalue `{ width: 32, height: 32 }`
    */
  var imageSize: js.UndefOr[AnonWidth] = js.native
  /**
    * Image to display with this option.
    */
  var imageSrc: js.UndefOr[String] = js.native
  /**
    * A required key to uniquely identify the option.
    */
  var key: String = js.native
  /**
    * ID used on the option's label.
    */
  var labelId: js.UndefOr[String] = js.native
  /**
    * Used to customize option rendering.
    */
  var onRenderField: js.UndefOr[IRenderFunction[IChoiceGroupOption]] = js.native
  /**
    * Used to customize label rendering.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[IChoiceGroupOption]] = js.native
  /**
    * The src of image for choice field which is selected.
    */
  var selectedImageSrc: js.UndefOr[String] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IChoiceGroupOptionStyleProps, IChoiceGroupOptionStyles]] = js.native
  /**
    * The text string for the option.
    */
  var text: String = js.native
}

object IChoiceGroupOption {
  @scala.inline
  def apply(key: String, text: String): IChoiceGroupOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupOption]
  }
  @scala.inline
  implicit class IChoiceGroupOptionOps[Self <: IChoiceGroupOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withImageAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSize(value: AnonWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelId")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderField(
      value: (/* props */ js.UndefOr[IChoiceGroupOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IChoiceGroupOption], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderField")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderField")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderLabel(
      value: (/* props */ js.UndefOr[IChoiceGroupOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IChoiceGroupOption], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedImageSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedImageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedImageSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedImageSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IChoiceGroupOptionStyleProps => Partial[IChoiceGroupOptionStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IChoiceGroupOptionStyleProps, IChoiceGroupOptionStyles]): Self = {
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
  }
  
}

