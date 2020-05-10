package typingsSlinky.reduxDevtoolsDockMonitor.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDockMonitorProps extends js.Object {
  /**
    * A key or a key combination that switches the currently visible monitor.
    * Must be recognizable by parse-key (for example, 'ctrl-m')
    * Required if you use more than one monitor.
    *
    * @default undefined
    */
  var changeMonitorKey: js.UndefOr[String] = js.native
  /**
    * A key or a key combination that toggles the dock position.
    * Must be recognizable by parse-key (for example, 'ctrl-w')
    */
  var changePositionKey: String = js.native
  /**
    * Any valid Redux DevTools monitor.
    */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * @default true
    */
  var defaultIsVisible: js.UndefOr[Boolean] = js.native
  /**
    * Where the dock appears on the screen.
    * Valid values: 'left', 'top', 'right', 'bottom'
    *
    * @default 'right'
    */
  var defaultPosition: js.UndefOr[DockPosition] = js.native
  /**
    * Size of the dock. When fluid is true, a float (0.5 means half the window size).
    * When fluid is false, a width in pixels
    *
    * @default 0.3 (3/10th of the window size)
    */
  var defaultSize: js.UndefOr[Double] = js.native
  /**
    * When true, the dock size is a fraction of the window size, fixed otherwise.
    *
    * @default true
    */
  var fluid: js.UndefOr[Boolean] = js.native
  /**
    * A key or a key combination that toggles the dock visibility.
    * Must be recognizable by parse-key (for example, 'ctrl-h')
    */
  var toggleVisibilityKey: String = js.native
}

object IDockMonitorProps {
  @scala.inline
  def apply(changePositionKey: String, toggleVisibilityKey: String): IDockMonitorProps = {
    val __obj = js.Dynamic.literal(changePositionKey = changePositionKey.asInstanceOf[js.Any], toggleVisibilityKey = toggleVisibilityKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDockMonitorProps]
  }
  @scala.inline
  implicit class IDockMonitorPropsOps[Self <: IDockMonitorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangePositionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePositionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleVisibilityKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleVisibilityKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeMonitorKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeMonitorKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeMonitorKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeMonitorKey")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPosition(value: DockPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFluid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFluid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(js.undefined)
        ret
    }
  }
  
}

