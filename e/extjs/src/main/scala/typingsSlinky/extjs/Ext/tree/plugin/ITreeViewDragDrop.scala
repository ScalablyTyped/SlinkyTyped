package typingsSlinky.extjs.Ext.tree.plugin

import typingsSlinky.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeViewDragDrop extends IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var allowContainerDrops: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowParentInserts: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var appendOnly: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dragGroup: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dragText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dropGroup: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var enableDrag: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableDrop: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var expandDelay: js.UndefOr[Double] = js.native
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
  		* @param view Object
  		*/
  @JSName("init")
  var init_ITreeViewDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var nodeHighlightColor: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var nodeHighlightOnDrop: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var nodeHighlightOnRepair: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var sortOnDrop: js.UndefOr[Boolean] = js.native
}

object ITreeViewDragDrop {
  @scala.inline
  def apply(): ITreeViewDragDrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreeViewDragDrop]
  }
  @scala.inline
  implicit class ITreeViewDragDropOps[Self <: ITreeViewDragDrop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowContainerDrops(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowContainerDrops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowContainerDrops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowContainerDrops")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowParentInserts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowParentInserts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowParentInserts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowParentInserts")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerScroll(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withDdGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDdGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(js.undefined)
        ret
    }
    @scala.inline
    def withDragGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDragText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragText")(js.undefined)
        ret
    }
    @scala.inline
    def withDropGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* view */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHighlightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeHighlightOnDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHighlightOnDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeHighlightOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHighlightOnDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeHighlightOnRepair(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHighlightOnRepair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeHighlightOnRepair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHighlightOnRepair")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOnDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOnDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOnDrop")(js.undefined)
        ret
    }
  }
  
}

