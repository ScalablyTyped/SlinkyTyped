package typingsSlinky.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactContext[T] extends js.Object {
  var Consumer: ReactContext[T] = js.native
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double = js.native
  var Provider: ReactProviderType[T] = js.native
  var _calculateChangedBits: (js.Function2[/* a */ T, /* b */ T, Double]) | Null = js.native
  // DEV only
  var _currentRenderer: js.UndefOr[js.Object | Null] = js.native
  var _currentRenderer2: js.UndefOr[js.Object | Null] = js.native
  var _currentValue: T = js.native
  var _currentValue2: T = js.native
  var _threadCount: Double = js.native
  def unstable_read(): T = js.native
}

object ReactContext {
  @scala.inline
  def apply[T](
    Consumer: ReactContext[T],
    DollarDollartypeof: js.Symbol | Double,
    Provider: ReactProviderType[T],
    _currentValue: T,
    _currentValue2: T,
    _threadCount: Double,
    unstable_read: () => T
  ): ReactContext[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], _currentValue = _currentValue.asInstanceOf[js.Any], _currentValue2 = _currentValue2.asInstanceOf[js.Any], _threadCount = _threadCount.asInstanceOf[js.Any], unstable_read = js.Any.fromFunction0(unstable_read))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactContext[T]]
  }
  @scala.inline
  implicit class ReactContextOps[Self[t] <: ReactContext[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConsumer(value: ReactContext[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDollarDollartypeof(value: js.Symbol | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$$typeof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: ReactProviderType[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentValue2(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentValue2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_threadCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_threadCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnstable_read(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstable_read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_calculateChangedBits(value: (/* a */ T, /* b */ T) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_calculateChangedBits")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_calculateChangedBitsNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_calculateChangedBits")(null)
        ret
    }
    @scala.inline
    def with_currentRenderer(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_currentRenderer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def with_currentRendererNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentRenderer")(null)
        ret
    }
    @scala.inline
    def with_currentRenderer2(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentRenderer2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_currentRenderer2: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentRenderer2")(js.undefined)
        ret
    }
    @scala.inline
    def with_currentRenderer2Null: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentRenderer2")(null)
        ret
    }
  }
  
}

