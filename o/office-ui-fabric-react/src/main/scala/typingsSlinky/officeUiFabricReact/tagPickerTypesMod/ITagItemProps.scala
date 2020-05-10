package typingsSlinky.officeUiFabricReact.tagPickerTypesMod

import typingsSlinky.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITagItemProps extends IPickerItemProps[ITag] {
  /**
    * Enable or not focus on TagItem when TagPicker is disabled.
    * @defaultvalue false
    */
  var enableTagFocusInDisabledPicker: js.UndefOr[Boolean] = js.native
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITagItemStyleProps, ITagItemStyles]] = js.native
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.native
}

object ITagItemProps {
  @scala.inline
  def apply(IPickerItemProps: IPickerItemProps[ITag]): ITagItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
    __obj.asInstanceOf[ITagItemProps]
  }
  @scala.inline
  implicit class ITagItemPropsOps[Self <: ITagItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableTagFocusInDisabledPicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTagFocusInDisabledPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTagFocusInDisabledPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTagFocusInDisabledPicker")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ITagItemStyleProps => Partial[ITagItemStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ITagItemStyleProps, ITagItemStyles]): Self = {
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

