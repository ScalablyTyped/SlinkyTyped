package typingsSlinky.jqueryBootstrapWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wizard extends js.Object {
  def activeTab(): js.Any = js.native
  def currentIndex(): Double = js.native
  def first(): Unit = js.native
  def firstIndex(): Double = js.native
  def getIndex(element: js.Any): Double = js.native
  def last(): Unit = js.native
  def lastIndex(): Double = js.native
  def navigationLength(): Double = js.native
  def next(): Unit = js.native
  def nextIndex(): Double = js.native
  def nextTab(): js.Any = js.native
  def previous(): Unit = js.native
  def previousIndex(): Double = js.native
  def previousTab(): js.Any = js.native
  def show(index: Double): js.Any = js.native
}

object Wizard {
  @scala.inline
  def apply(
    activeTab: () => js.Any,
    currentIndex: () => Double,
    first: () => Unit,
    firstIndex: () => Double,
    getIndex: js.Any => Double,
    last: () => Unit,
    lastIndex: () => Double,
    navigationLength: () => Double,
    next: () => Unit,
    nextIndex: () => Double,
    nextTab: () => js.Any,
    previous: () => Unit,
    previousIndex: () => Double,
    previousTab: () => js.Any,
    show: Double => js.Any
  ): Wizard = {
    val __obj = js.Dynamic.literal(activeTab = js.Any.fromFunction0(activeTab), currentIndex = js.Any.fromFunction0(currentIndex), first = js.Any.fromFunction0(first), firstIndex = js.Any.fromFunction0(firstIndex), getIndex = js.Any.fromFunction1(getIndex), last = js.Any.fromFunction0(last), lastIndex = js.Any.fromFunction0(lastIndex), navigationLength = js.Any.fromFunction0(navigationLength), next = js.Any.fromFunction0(next), nextIndex = js.Any.fromFunction0(nextIndex), nextTab = js.Any.fromFunction0(nextTab), previous = js.Any.fromFunction0(previous), previousIndex = js.Any.fromFunction0(previousIndex), previousTab = js.Any.fromFunction0(previousTab), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[Wizard]
  }
  @scala.inline
  implicit class WizardOps[Self <: Wizard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTab(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrentIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFirst(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFirstIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLast(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNavigationLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextTab(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTab")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrevious(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreviousIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreviousTab(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTab")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

