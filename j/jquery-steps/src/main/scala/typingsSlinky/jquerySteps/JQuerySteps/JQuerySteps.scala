package typingsSlinky.jquerySteps.JQuerySteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuerySteps extends js.Object {
  /**
    * Adds a new step. (chainable)
    */
  def add(step: Step): typingsSlinky.jquerySteps.JQuerySteps.JQuerySteps = js.native
  /**
    * Removes the control functionality completely and transforms the current state to the initial HTML structure.
    */
  def destroy(): Unit = js.native
  /**
    * Triggers the onFinishing and onFinished event.
    */
  def finish(): Unit = js.native
  /**
    * Gets the current step index.
    */
  def getCurrentIndex(): Double = js.native
  /**
    * Gets the current step object.
    */
  def getCurrentStep(): Step = js.native
  /**
    * Gets a specific step object by index.
    */
  def getStep(index: Double): Step = js.native
  /**
    * Inserts a new step to a specific position. (chainable)
    */
  def insert(index: Double, step: Step): typingsSlinky.jquerySteps.JQuerySteps.JQuerySteps = js.native
  /**
    * Routes to the previous step.
    */
  def next(): Boolean = js.native
  /**
    * Routes to the next step.
    */
  def previous(): Boolean = js.native
  /**
    * Removes a specific step by an given index.
    */
  def remove(index: Double): Boolean = js.native
  /**
    * Skips a certain amount of steps. Not yet implemented!
    */
  def skip(count: Double): Boolean = js.native
}

object JQuerySteps {
  @scala.inline
  def apply(
    add: Step => typingsSlinky.jquerySteps.JQuerySteps.JQuerySteps,
    destroy: () => Unit,
    finish: () => Unit,
    getCurrentIndex: () => Double,
    getCurrentStep: () => Step,
    getStep: Double => Step,
    insert: (Double, Step) => typingsSlinky.jquerySteps.JQuerySteps.JQuerySteps,
    next: () => Boolean,
    previous: () => Boolean,
    remove: Double => Boolean,
    skip: Double => Boolean
  ): JQuerySteps = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), destroy = js.Any.fromFunction0(destroy), finish = js.Any.fromFunction0(finish), getCurrentIndex = js.Any.fromFunction0(getCurrentIndex), getCurrentStep = js.Any.fromFunction0(getCurrentStep), getStep = js.Any.fromFunction1(getStep), insert = js.Any.fromFunction2(insert), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), remove = js.Any.fromFunction1(remove), skip = js.Any.fromFunction1(skip))
    __obj.asInstanceOf[JQuerySteps]
  }
  @scala.inline
  implicit class JQueryStepsOps[Self <: typingsSlinky.jquerySteps.JQuerySteps.JQuerySteps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Step => typingsSlinky.jquerySteps.JQuerySteps.JQuerySteps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFinish(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentStep(value: () => Step): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentStep")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStep(value: Double => Step): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStep")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Double, Step) => typingsSlinky.jquerySteps.JQuerySteps.JQuerySteps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNext(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrevious(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkip(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

