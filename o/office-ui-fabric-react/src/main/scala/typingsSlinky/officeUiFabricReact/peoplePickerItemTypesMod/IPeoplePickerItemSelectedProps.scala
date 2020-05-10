package typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod

import typingsSlinky.officeUiFabricReact.IPersonaPropsValidationSt
import typingsSlinky.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSharedProps because var conflicts: className. Inlined theme */ @js.native
trait IPeoplePickerItemSelectedProps extends IPickerItemProps[IPersonaPropsValidationSt] {
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IPeoplePickerItemSelectedStyleProps, IPeoplePickerItemSelectedStyles]
  ] = js.native
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.native
}

object IPeoplePickerItemSelectedProps {
  @scala.inline
  def apply(IPickerItemProps: IPickerItemProps[IPersonaPropsValidationSt]): IPeoplePickerItemSelectedProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
    __obj.asInstanceOf[IPeoplePickerItemSelectedProps]
  }
  @scala.inline
  implicit class IPeoplePickerItemSelectedPropsOps[Self <: IPeoplePickerItemSelectedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStylesFunction1(value: IPeoplePickerItemSelectedStyleProps => Partial[IPeoplePickerItemSelectedStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(
      value: IStyleFunctionOrObject[IPeoplePickerItemSelectedStyleProps, IPeoplePickerItemSelectedStyles]
    ): Self = {
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

