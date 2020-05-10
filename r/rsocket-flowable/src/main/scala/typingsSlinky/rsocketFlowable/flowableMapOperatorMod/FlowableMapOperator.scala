package typingsSlinky.rsocketFlowable.flowableMapOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> * / any */ @js.native
trait FlowableMapOperator[T, R] extends js.Object {
  def onComplete(): Unit = js.native
  def onError(error: js.Error): Unit = js.native
  def onNext(t: T): Unit = js.native
  def onSubscribe(
    subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): Unit = js.native
}

object FlowableMapOperator {
  @scala.inline
  def apply[T, R](
    onComplete: () => Unit,
    onError: js.Error => Unit,
    onNext: T => Unit,
    onSubscribe: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Unit
  ): FlowableMapOperator[T, R] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
    __obj.asInstanceOf[FlowableMapOperator[T, R]]
  }
  @scala.inline
  implicit class FlowableMapOperatorOps[Self[t, r] <: FlowableMapOperator[t, r], T, R] (val x: Self[T, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, R]) with Other]
    @scala.inline
    def withOnComplete(value: () => Unit): Self[T, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnError(value: js.Error => Unit): Self[T, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNext(value: T => Unit): Self[T, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSubscribe(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Unit
    ): Self[T, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

