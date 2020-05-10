package typingsSlinky.officeUiFabricReact.groupShowAllTypesMod

import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupShowAllProps extends IGroupDividerProps {
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles]] = js.native
}

object IGroupShowAllProps {
  @scala.inline
  def apply(): IGroupShowAllProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupShowAllProps]
  }
  @scala.inline
  implicit class IGroupShowAllPropsOps[Self <: IGroupShowAllProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStylesFunction1(value: IGroupShowAllStyleProps => Partial[IGroupShowAllStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles]): Self = {
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

