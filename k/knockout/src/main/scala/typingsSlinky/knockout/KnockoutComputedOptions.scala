package typingsSlinky.knockout

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputedOptions[T] extends js.Object {
  /**
    * If true, then the value of the computed observable will not be evaluated until something actually attempts to access its value or manually subscribes to it.
    * By default, a computed observable has its value determined immediately during creation.
    */
  var deferEvaluation: js.UndefOr[Boolean] = js.native
  /**
    * This function is executed before each re-evaluation to determine if the computed observable should be disposed.
    * A true-ish result will trigger disposal of the computed observable.
    */
  var disposeWhen: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * Disposal of the computed observable will be triggered when the specified DOM node is removed by KO.
    * This feature is used to dispose computed observables used in bindings when nodes are removed by the template and control-flow bindings.
    */
  var disposeWhenNodeIsRemoved: js.UndefOr[Node] = js.native
  /**
    * Defines the value of 'this' whenever KO invokes your 'read' or 'write' callbacks.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * If true, the computed observable will be set up as a purecomputed observable. This option is an alternative to the ko.pureComputed constructor.
    */
  var pure: js.UndefOr[Boolean] = js.native
  /**
    * Makes the computed observable writable. This is a function that receives values that other code is trying to write to your computed observable.
    * It’s up to you to supply custom logic to handle the incoming values, typically by writing the values to some underlying observable(s).
    * @param value Value being written to the computer observable.
    */
  var write: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
}

object KnockoutComputedOptions {
  @scala.inline
  def apply[T](): KnockoutComputedOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutComputedOptions[T]]
  }
  @scala.inline
  implicit class KnockoutComputedOptionsOps[Self[t] <: KnockoutComputedOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDeferEvaluation(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvaluation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferEvaluation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvaluation")(js.undefined)
        ret
    }
    @scala.inline
    def withDisposeWhen(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeWhen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisposeWhen: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeWhen")(js.undefined)
        ret
    }
    @scala.inline
    def withDisposeWhenNodeIsRemoved(value: Node): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeWhenNodeIsRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisposeWhenNodeIsRemoved: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeWhenNodeIsRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withPure(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPure: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: /* value */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWrite: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
  }
  
}

