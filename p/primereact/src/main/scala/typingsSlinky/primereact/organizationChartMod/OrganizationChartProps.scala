package typingsSlinky.primereact.organizationChartMod

import slinky.core.TagMod
import typingsSlinky.primereact.anon.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationChartProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var nodeTemplate: js.UndefOr[js.Function1[/* node */ OrganizationChartNodeData, TagMod[Any]]] = js.native
  var onNodeSelect: js.UndefOr[js.Function1[/* e */ Node, Unit]] = js.native
  var onNodeUnselect: js.UndefOr[js.Function1[/* e */ Node, Unit]] = js.native
  var selection: js.UndefOr[js.Any] = js.native
  var selectionChange: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  var selectionMode: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var value: js.UndefOr[js.Array[OrganizationChartNodeData]] = js.native
}

object OrganizationChartProps {
  @scala.inline
  def apply(): OrganizationChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationChartProps]
  }
  @scala.inline
  implicit class OrganizationChartPropsOps[Self <: OrganizationChartProps] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeTemplate(value: /* node */ OrganizationChartNodeData => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeSelect(value: /* e */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNodeSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeUnselect(value: /* e */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeUnselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNodeUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeUnselect")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionChange(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[OrganizationChartNodeData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

