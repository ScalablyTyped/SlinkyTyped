package typingsSlinky.atom.toolBarMod

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.atom.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolBarButtonView extends js.Object {
  var element: HTMLButtonElement = js.native
  var enabled: Boolean = js.native
  var group: String = js.native
  var options: ButtonOptions = js.native
  var priority: Double = js.native
  var subscriptions: Disposable = js.native
  def _onClick(event: MouseEvent): Unit = js.native
  def _onMouseDown(event: MouseEvent): Unit = js.native
  def destroy(): Unit = js.native
  def executeCallback(event: MouseEvent): Unit = js.native
  def getSelected(): Boolean = js.native
  def setEnabled(enabled: Boolean): Unit = js.native
  def setSelected(selected: Boolean): Unit = js.native
}

object ToolBarButtonView {
  @scala.inline
  def apply(
    _onClick: MouseEvent => Unit,
    _onMouseDown: MouseEvent => Unit,
    destroy: () => Unit,
    element: HTMLButtonElement,
    enabled: Boolean,
    executeCallback: MouseEvent => Unit,
    getSelected: () => Boolean,
    group: String,
    options: ButtonOptions,
    priority: Double,
    setEnabled: Boolean => Unit,
    setSelected: Boolean => Unit,
    subscriptions: Disposable
  ): ToolBarButtonView = {
    val __obj = js.Dynamic.literal(_onClick = js.Any.fromFunction1(_onClick), _onMouseDown = js.Any.fromFunction1(_onMouseDown), destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], executeCallback = js.Any.fromFunction1(executeCallback), getSelected = js.Any.fromFunction0(getSelected), group = group.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], setEnabled = js.Any.fromFunction1(setEnabled), setSelected = js.Any.fromFunction1(setSelected), subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarButtonView]
  }
  @scala.inline
  implicit class ToolBarButtonViewOps[Self <: ToolBarButtonView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_onClick(value: MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_onMouseDown(value: MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElement(value: HTMLButtonElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecuteCallback(value: MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSelected(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: ButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelected(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscriptions(value: Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

