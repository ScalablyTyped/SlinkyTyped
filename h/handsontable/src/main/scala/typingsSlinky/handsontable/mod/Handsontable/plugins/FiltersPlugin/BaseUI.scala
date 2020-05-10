package typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin

import org.scalajs.dom.raw.Element
import typingsSlinky.handsontable.mod.Handsontable.plugins.EventManager
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseUI extends js.Object {
  var buildState: Boolean = js.native
  var eventManager: EventManager = js.native
  var hot: Core = js.native
  var options: js.Object = js.native
  def build(): Unit = js.native
  def destroy(): Unit = js.native
  def element(): Element = js.native
  def focus(): Unit = js.native
  def getValue(): js.Any = js.native
  def hide(): Unit = js.native
  def isBuilt(): Boolean = js.native
  def reset(): Unit = js.native
  def setValue(value: js.Any): js.Any = js.native
  def show(): Unit = js.native
  def update(): Unit = js.native
}

object BaseUI {
  @scala.inline
  def apply(
    build: () => Unit,
    buildState: Boolean,
    destroy: () => Unit,
    element: () => Element,
    eventManager: EventManager,
    focus: () => Unit,
    getValue: () => js.Any,
    hide: () => Unit,
    hot: Core,
    isBuilt: () => Boolean,
    options: js.Object,
    reset: () => Unit,
    setValue: js.Any => js.Any,
    show: () => Unit,
    update: () => Unit
  ): BaseUI = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), buildState = buildState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = js.Any.fromFunction0(element), eventManager = eventManager.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hot = hot.asInstanceOf[js.Any], isBuilt = js.Any.fromFunction0(isBuilt), options = options.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setValue = js.Any.fromFunction1(setValue), show = js.Any.fromFunction0(show), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[BaseUI]
  }
  @scala.inline
  implicit class BaseUIOps[Self <: BaseUI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBuildState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElement(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEventManager(value: EventManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHot(value: Core): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBuilt(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuilt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetValue(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

