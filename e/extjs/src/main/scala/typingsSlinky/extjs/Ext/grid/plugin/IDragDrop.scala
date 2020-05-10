package typingsSlinky.extjs.Ext.grid.plugin

import typingsSlinky.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDrop extends IAbstractPlugin {
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[String] = js.native
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
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
  		* @param view Object
  		*/
  @JSName("init")
  var init_IDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], Unit]] = js.native
}

object IDragDrop {
  @scala.inline
  def apply(): IDragDrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragDrop]
  }
  @scala.inline
  implicit class IDragDropOps[Self <: IDragDrop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

