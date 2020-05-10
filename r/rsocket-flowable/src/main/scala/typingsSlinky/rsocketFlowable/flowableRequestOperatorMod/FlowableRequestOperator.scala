package typingsSlinky.rsocketFlowable.flowableRequestOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> * / any */ @js.native
trait FlowableRequestOperator[T] extends js.Object {
  def onComplete(): Unit = js.native
  def onError(error: js.Error): Unit = js.native
  def onNext(t: T): Unit = js.native
  def onSubscribe(
    subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): Unit = js.native
}

object FlowableRequestOperator {
  @scala.inline
  def apply[T](
    onComplete: () => Unit,
    onError: js.Error => Unit,
    onNext: T => Unit,
    onSubscribe: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Unit
  ): FlowableRequestOperator[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
    __obj.asInstanceOf[FlowableRequestOperator[T]]
  }
  @scala.inline
  implicit class FlowableRequestOperatorOps[Self[t] <: FlowableRequestOperator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnComplete(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnError(value: js.Error => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNext(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSubscribe(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

