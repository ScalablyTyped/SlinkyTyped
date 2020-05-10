package typingsSlinky.extjs.Ext.resizer

import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISplitter extends IComponent {
  /** [Config Option] (Boolean) */
  var collapseOnDblClick: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Ext.panel.Panel) */
  var collapseTarget: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var collapsedCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var defaultSplitMax: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var defaultSplitMin: js.UndefOr[Double] = js.native
  /** [Method] Returns the config object with an xclass property for the splitter tracker  */
  var getTrackerConfig: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_ISplitter: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (String) */
  var orientation: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var performCollapse: js.UndefOr[Boolean] = js.native
  /** [Method] Work around IE bug
  		* @returns Ext.Component this
  		*/
  @JSName("setSize")
  var setSize_ISplitter: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (Number) */
  var size: js.UndefOr[Double] = js.native
}

object ISplitter {
  @scala.inline
  def apply(): ISplitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISplitter]
  }
  @scala.inline
  implicit class ISplitterOps[Self <: ISplitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseOnDblClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnDblClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseOnDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSplitMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSplitMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSplitMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSplitMax")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSplitMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSplitMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSplitMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSplitMin")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTrackerConfig(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrackerConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTrackerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrackerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

