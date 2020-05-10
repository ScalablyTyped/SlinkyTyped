package typingsSlinky.extjs.Ext.grid.plugin

import typingsSlinky.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowExpander extends IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var expandOnDblClick: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var expandOnEnter: js.UndefOr[Boolean] = js.native
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
  		* @param grid Object
  		*/
  @JSName("init")
  var init_IRowExpander: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var selectRowOnExpand: js.UndefOr[Boolean] = js.native
}

object IRowExpander {
  @scala.inline
  def apply(): IRowExpander = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowExpander]
  }
  @scala.inline
  implicit class IRowExpanderOps[Self <: IRowExpander] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandOnDblClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnDblClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandOnDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* grid */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSelectRowOnExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRowOnExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectRowOnExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRowOnExpand")(js.undefined)
        ret
    }
  }
  
}

