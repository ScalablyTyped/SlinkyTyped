package typingsSlinky.officeUiFabricReact.verticalDividerTypesMod

import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVerticalDividerProps extends js.Object {
  /**
    * className that will be placed on the divider wrapper div
    */
  var className: js.UndefOr[String] = js.native
  /**
    * @deprecated Use styles instead.
    * Optional function to generate the class names for the divider for custom styling
    */
  var getClassNames: js.UndefOr[js.Function1[/* theme */ ITheme, IVerticalDividerClassNames]] = js.native
  /**
    * Optional override stylings that will get merged with the dividers styles.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles]] = js.native
  /**
    * The theme that should be used to render the vertical divider.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IVerticalDividerProps {
  @scala.inline
  def apply(): IVerticalDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVerticalDividerProps]
  }
  @scala.inline
  implicit class IVerticalDividerPropsOps[Self <: IVerticalDividerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClassNames(value: /* theme */ ITheme => IVerticalDividerClassNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IVerticalDividerPropsStyles => Partial[IVerticalDividerStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles]): Self = {
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

