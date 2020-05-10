package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgLoadingMethods extends js.Object {
  def destroy(): Unit = js.native
  def hide(): Unit = js.native
  def indicator(): Unit = js.native
  def indicatorElement(): Unit = js.native
  def refreshPos(): Unit = js.native
  def show(refresh: js.Object): Unit = js.native
}

object IgLoadingMethods {
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => Unit,
    indicator: () => Unit,
    indicatorElement: () => Unit,
    refreshPos: () => Unit,
    show: js.Object => Unit
  ): IgLoadingMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), indicator = js.Any.fromFunction0(indicator), indicatorElement = js.Any.fromFunction0(indicatorElement), refreshPos = js.Any.fromFunction0(refreshPos), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IgLoadingMethods]
  }
  @scala.inline
  implicit class IgLoadingMethodsOps[Self <: IgLoadingMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndicator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndicatorElement(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefreshPos(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshPos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

