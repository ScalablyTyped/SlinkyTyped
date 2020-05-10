package typingsSlinky.materialUiLab.treeViewTreeViewMod

import typingsSlinky.materialUiLab.materialUiLabBooleans.`false`
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleSelectTreeViewProps
  extends TreeViewPropsBase
     with TreeViewProps {
  /**
    * Selected node ids. (Uncontrolled)
    * When `multiSelect` is true this takes an array of strings; when false (default) a string.
    */
  var defaultSelected: js.UndefOr[String] = js.native
  /**
    * If true `ctrl` and `shift` will trigger multiselect.
    */
  var multiSelect: js.UndefOr[`false`] = js.native
  /**
    * Callback fired when tree items are selected/unselected.
    *
    * @param {object} event The event source of the callback
    * @param {(array|string)} value of the selected nodes. When `multiSelect` is true
    * this is an array of strings; when false (default) a string.
    */
  var onNodeSelect: js.UndefOr[js.Function2[/* event */ ChangeEvent[js.Object], /* nodeIds */ String, Unit]] = js.native
  /**
    * Selected node ids. (Controlled)
    * When `multiSelect` is true this takes an array of strings; when false (default) a string.
    */
  var selected: js.UndefOr[String] = js.native
}

object SingleSelectTreeViewProps {
  @scala.inline
  def apply(): SingleSelectTreeViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleSelectTreeViewProps]
  }
  @scala.inline
  implicit class SingleSelectTreeViewPropsOps[Self <: SingleSelectTreeViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeSelect(value: (/* event */ ChangeEvent[js.Object], /* nodeIds */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNodeSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
  }
  
}

