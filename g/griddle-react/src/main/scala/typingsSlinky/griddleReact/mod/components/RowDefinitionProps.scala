package typingsSlinky.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDefinitionProps
  extends /* x */ StringDictionary[js.Any] {
  //The column that will be known used to track child data
  //By default this will be "children"
  var childColumnName: js.UndefOr[String] = js.native
  //The css class name, or a function to generate a class name from props, to apply to this row.
  var cssClassName: js.UndefOr[String | (js.Function1[/* props */ js.Any, String])] = js.native
  //The column value that should be used as the key for the row
  //if this is not set it will make one up (not efficient)
  var rowKey: js.UndefOr[String] = js.native
}

object RowDefinitionProps {
  @scala.inline
  def apply(): RowDefinitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDefinitionProps]
  }
  @scala.inline
  implicit class RowDefinitionPropsOps[Self <: RowDefinitionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childColumnName")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClassNameFunction1(value: /* props */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCssClassName(value: String | (js.Function1[/* props */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withRowKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(js.undefined)
        ret
    }
  }
  
}

