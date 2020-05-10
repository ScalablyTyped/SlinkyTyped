package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Panel[T] extends js.Object {
  /** Whether or not the Panel is visible. */
  val visible: Boolean = js.native
  // Construction and Destruction
  /** Destroy and remove this panel from the UI. */
  def destroy(): Unit = js.native
  // Panel Details
  /** Returns the panel's item. */
  def getItem(): T = js.native
  /** Returns a number indicating this panel's priority. */
  def getPriority(): Double = js.native
  /** Hide this panel. */
  def hide(): Unit = js.native
  /** Returns a boolean true when the panel is visible. */
  def isVisible(): Boolean = js.native
  // Event Subscription
  /** Invoke the given callback when the pane hidden or shown. */
  def onDidChangeVisible(callback: js.Function1[/* visible */ Boolean, Unit]): Disposable = js.native
  /** Invoke the given callback when the pane is destroyed. */
  def onDidDestroy(callback: js.Function1[/* panel */ Panel[T], Unit]): Disposable = js.native
  /** Show this panel. */
  def show(): Unit = js.native
}

object Panel {
  @scala.inline
  def apply[T](
    destroy: () => Unit,
    getItem: () => T,
    getPriority: () => Double,
    hide: () => Unit,
    isVisible: () => Boolean,
    onDidChangeVisible: js.Function1[/* visible */ Boolean, Unit] => Disposable,
    onDidDestroy: js.Function1[/* panel */ Panel[T], Unit] => Disposable,
    show: () => Unit,
    visible: Boolean
  ): Panel[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getItem = js.Any.fromFunction0(getItem), getPriority = js.Any.fromFunction0(getPriority), hide = js.Any.fromFunction0(hide), isVisible = js.Any.fromFunction0(isVisible), onDidChangeVisible = js.Any.fromFunction1(onDidChangeVisible), onDidDestroy = js.Any.fromFunction1(onDidDestroy), show = js.Any.fromFunction0(show), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panel[T]]
  }
  @scala.inline
  implicit class PanelOps[Self[t] <: Panel[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPriority(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPriority")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDidChangeVisible(value: js.Function1[/* visible */ Boolean, Unit] => Disposable): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidChangeVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDidDestroy(value: js.Function1[/* panel */ Panel[T], Unit] => Disposable): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidDestroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

