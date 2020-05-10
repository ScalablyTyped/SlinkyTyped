package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.util.IComponentDragger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWindow
  extends typingsSlinky.extjs.Ext.panel.IPanel {
  /** [Method] Invoked after the Panel is Collapsed  */
  @JSName("afterCollapse")
  var afterCollapse_IWindow: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Invoked after the Panel is Expanded  */
  @JSName("afterExpand")
  var afterExpand_IWindow: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Ext.Element) */
  var animateTarget: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  @JSName("autoRender")
  var autoRender_IWindow: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.util.ComponentDragger) */
  @JSName("dd")
  var dd_IWindow: js.UndefOr[IComponentDragger] = js.native
  /** [Config Option] (String/Number/Ext.Component) */
  var defaultFocus: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var expandOnShow: js.UndefOr[Boolean] = js.native
  /** [Method] Gets the configured default focus item  */
  var getDefaultFocus: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean/Function) */
  var ghost: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var hideShadowOnDeactivate: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isWindow: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var maximizable: js.UndefOr[Boolean] = js.native
  /** [Method] Fits the window within its current container and automatically replaces the maximize tool button with the restore
  		* @param animate Boolean true to animate this Window to full size.
  		* @returns Ext.window.Window this
  		*/
  var maximize: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Config Option] (Boolean) */
  var maximized: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var minimizable: js.UndefOr[Boolean] = js.native
  /** [Method] Placeholder method for minimizing the window
  		* @returns Ext.window.Window this
  		*/
  var minimize: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var modal: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var onEsc: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
  /** [Method] Restores a maximized window back to its original size and position prior to being maximized and also replaces the re
  		* @param animate Object
  		* @returns Ext.window.Window this
  		*/
  var restore: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] A shortcut method for toggling between maximize and restore based on the current maximized state of the window
  		* @returns Ext.window.Window this
  		*/
  var toggleMaximize: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.native
}

object IWindow {
  @scala.inline
  def apply(): IWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWindow]
  }
  @scala.inline
  implicit class IWindowOps[Self <: IWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCollapse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCollapse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterExpand(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterExpand")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDd(value: IComponentDragger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFocus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandOnShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnShow")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withGhost(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost")(js.undefined)
        ret
    }
    @scala.inline
    def withHideShadowOnDeactivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideShadowOnDeactivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideShadowOnDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideShadowOnDeactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizable")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximize(value: /* animate */ js.UndefOr[Boolean] => IWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMaximize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximized")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizable")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimize(value: () => IWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEsc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
        ret
    }
    @scala.inline
    def withRestore(value: /* animate */ js.UndefOr[js.Any] => IWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleMaximize(value: () => IWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMaximize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToggleMaximize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMaximize")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

