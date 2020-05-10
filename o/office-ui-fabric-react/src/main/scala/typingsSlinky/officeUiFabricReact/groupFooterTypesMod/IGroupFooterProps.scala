package typingsSlinky.officeUiFabricReact.groupFooterTypesMod

import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupFooterProps extends IGroupDividerProps {
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupFooterStyleProps, IGroupFooterStyles]] = js.native
}

object IGroupFooterProps {
  @scala.inline
  def apply(): IGroupFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupFooterProps]
  }
  @scala.inline
  implicit class IGroupFooterPropsOps[Self <: IGroupFooterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStylesFunction1(value: IGroupFooterStyleProps => Partial[IGroupFooterStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IGroupFooterStyleProps, IGroupFooterStyles]): Self = {
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

