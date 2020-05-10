package typingsSlinky.fixedDataTable2.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.center
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.left
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.right
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnGroupProps extends ClassAttributes[ColumnGroup] {
  /**
    * The horizontal alignment of the table cell content.
    */
  var align: js.UndefOr[left | center | right] = js.native
  /**
    * Controls if the column group is fixed when scrolling in the X axis.
    *
    * defaultValue: false
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * This is the header cell for this column group.
    * This can either be a string or a React element. Passing in a string
    * will render a default footer cell with that string. By default, the React
    * element passed in can expect to receive the following props:
    *
    * ```
    * props: {
    *   height: number // (supplied from the groupHeaderHeight)
    *   width: number // (supplied from the Column)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * You can also pass in a function that returns a react elemnt, with the
    * props object above passed in as the first parameter.
    */
  var header: js.UndefOr[
    String | ReactElement | (js.Function1[/* props */ ColumnGroupHeaderProps, String | ReactElement])
  ] = js.native
}

object ColumnGroupProps {
  @scala.inline
  def apply(): ColumnGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupProps]
  }
  @scala.inline
  implicit class ColumnGroupPropsOps[Self <: ColumnGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderFunction1(value: /* props */ ColumnGroupHeaderProps => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeader(
      value: String | ReactElement | (js.Function1[/* props */ ColumnGroupHeaderProps, String | ReactElement])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
  }
  
}

