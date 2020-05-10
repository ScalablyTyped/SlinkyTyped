package typingsSlinky.reactScroll.scrollSpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSpy extends js.Object {
  var scrollSpyContainers: js.Array[_] = js.native
  var spyCallbacks: js.Array[_] = js.native
  var spySetState: js.Array[_] = js.native
  def addSpyHandler(handler: js.Any, scrollSpyContainer: js.Any): Unit = js.native
  def addStateHandler(handler: js.Any): Unit = js.native
  def currentPositionY(scrollSpyContainer: js.Any): Double = js.native
  def isMounted(scrollSpyContainer: js.Any): Boolean = js.native
  def mount(scrollSpyContainer: js.Any): Unit = js.native
  def scrollHandler(scrollSpyContainer: js.Any): Unit = js.native
  def unmount(stateHandler: js.Any, spyHandler: js.Any): Unit = js.native
  def update(): Unit = js.native
  def updateStates(): Unit = js.native
}

object ScrollSpy {
  @scala.inline
  def apply(
    addSpyHandler: (js.Any, js.Any) => Unit,
    addStateHandler: js.Any => Unit,
    currentPositionY: js.Any => Double,
    isMounted: js.Any => Boolean,
    mount: js.Any => Unit,
    scrollHandler: js.Any => Unit,
    scrollSpyContainers: js.Array[_],
    spyCallbacks: js.Array[_],
    spySetState: js.Array[_],
    unmount: (js.Any, js.Any) => Unit,
    update: () => Unit,
    updateStates: () => Unit
  ): ScrollSpy = {
    val __obj = js.Dynamic.literal(addSpyHandler = js.Any.fromFunction2(addSpyHandler), addStateHandler = js.Any.fromFunction1(addStateHandler), currentPositionY = js.Any.fromFunction1(currentPositionY), isMounted = js.Any.fromFunction1(isMounted), mount = js.Any.fromFunction1(mount), scrollHandler = js.Any.fromFunction1(scrollHandler), scrollSpyContainers = scrollSpyContainers.asInstanceOf[js.Any], spyCallbacks = spyCallbacks.asInstanceOf[js.Any], spySetState = spySetState.asInstanceOf[js.Any], unmount = js.Any.fromFunction2(unmount), update = js.Any.fromFunction0(update), updateStates = js.Any.fromFunction0(updateStates))
    __obj.asInstanceOf[ScrollSpy]
  }
  @scala.inline
  implicit class ScrollSpyOps[Self <: ScrollSpy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSpyHandler(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSpyHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddStateHandler(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStateHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentPositionY(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPositionY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsMounted(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMounted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMount(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollHandler(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollSpyContainers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpyContainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpyCallbacks(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spyCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpySetState(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spySetState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmount(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateStates(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStates")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

