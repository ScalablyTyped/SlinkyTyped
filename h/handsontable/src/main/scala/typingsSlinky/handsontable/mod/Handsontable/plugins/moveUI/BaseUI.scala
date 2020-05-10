package typingsSlinky.handsontable.mod.Handsontable.plugins.moveUI

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseUI extends js.Object {
  var hot: Core = js.native
  var state: Double = js.native
  def appendTo(wrapper: HTMLElement): Unit = js.native
  def build(): Unit = js.native
  def destroy(): Unit = js.native
  def getOffset(): js.Object = js.native
  def getPosition(): js.Object = js.native
  def getSize(): js.Object = js.native
  def isAppended(): Boolean = js.native
  def isBuilt(): Boolean = js.native
  def setOffset(top: Double, left: Double): Unit = js.native
  def setPosition(top: Double, left: Double): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
}

object BaseUI {
  @scala.inline
  def apply(
    appendTo: HTMLElement => Unit,
    build: () => Unit,
    destroy: () => Unit,
    getOffset: () => js.Object,
    getPosition: () => js.Object,
    getSize: () => js.Object,
    hot: Core,
    isAppended: () => Boolean,
    isBuilt: () => Boolean,
    setOffset: (Double, Double) => Unit,
    setPosition: (Double, Double) => Unit,
    setSize: (Double, Double) => Unit,
    state: Double
  ): BaseUI = {
    val __obj = js.Dynamic.literal(appendTo = js.Any.fromFunction1(appendTo), build = js.Any.fromFunction0(build), destroy = js.Any.fromFunction0(destroy), getOffset = js.Any.fromFunction0(getOffset), getPosition = js.Any.fromFunction0(getPosition), getSize = js.Any.fromFunction0(getSize), hot = hot.asInstanceOf[js.Any], isAppended = js.Any.fromFunction0(isAppended), isBuilt = js.Any.fromFunction0(isBuilt), setOffset = js.Any.fromFunction2(setOffset), setPosition = js.Any.fromFunction2(setPosition), setSize = js.Any.fromFunction2(setSize), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUI]
  }
  @scala.inline
  implicit class BaseUIOps[Self <: BaseUI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendTo(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuild(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffset(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHot(value: Core): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAppended(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAppended")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBuilt(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuilt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetOffset(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSize(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

