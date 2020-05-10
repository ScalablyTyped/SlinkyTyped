package typingsSlinky.officeUiFabricReact.groupHeaderTypesMod

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupHeaderProps extends IGroupDividerProps {
  /** Defines an element's number or position in the current set of listitems or treeitems */
  var ariaPosInSet: js.UndefOr[Double] = js.native
  /** Defines the number of items in the current set of listitems or treeitems */
  var ariaSetSize: js.UndefOr[Double] = js.native
  /** GroupedList id for aria-controls */
  var groupedListId: js.UndefOr[String] = js.native
  /** Native props for the GroupHeader select all button */
  var selectAllButtonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.native
  /** Style function to be passed in to override the themed or default styles */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]] = js.native
}

object IGroupHeaderProps {
  @scala.inline
  def apply(): IGroupHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupHeaderProps]
  }
  @scala.inline
  implicit class IGroupHeaderPropsOps[Self <: IGroupHeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaPosInSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaPosInSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaPosInSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaPosInSet")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaSetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaSetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaSetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedListId")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllButtonProps(value: HTMLAttributes[HTMLButtonElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IGroupHeaderStyleProps => Partial[IGroupHeaderStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]): Self = {
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

