package typingsSlinky.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleCacheConfigurator extends js.Object {
  // there is an undocumented call signature that is a shorthand for forever()/never()/using().
  // (ever: boolean): void
  // <T extends SimpleCacheKey>(callback: CacheCallback<T>): T
  /**
    * Permacache the computed config and never call the function again.
    */
  def forever(): Unit = js.native
  /**
    * Any time the using callback returns a value other than the one that was expected,
    * the overall config function will be called again and all entries in the cache will
    * be replaced with the result.
    *
    * @example
    * api.cache.invalidate(() => process.env.NODE_ENV)
    */
  def invalidate[T /* <: SimpleCacheKey */](callback: SimpleCacheCallback[T]): T = js.native
  /**
    * Do not cache this config, and re-execute the function every time.
    */
  def never(): Unit = js.native
  /**
    * Any time the using callback returns a value other than the one that was expected,
    * the overall config function will be called again and a new entry will be added to the cache.
    *
    * @example
    * api.cache.using(() => process.env.NODE_ENV)
    */
  def using[T /* <: SimpleCacheKey */](callback: SimpleCacheCallback[T]): T = js.native
}

object SimpleCacheConfigurator {
  @scala.inline
  def apply(
    forever: () => Unit,
    invalidate: SimpleCacheCallback[js.Any] => js.Any,
    never: () => Unit,
    using: SimpleCacheCallback[js.Any] => js.Any
  ): SimpleCacheConfigurator = {
    val __obj = js.Dynamic.literal(forever = js.Any.fromFunction0(forever), invalidate = js.Any.fromFunction1(invalidate), never = js.Any.fromFunction0(never), using = js.Any.fromFunction1(using))
    __obj.asInstanceOf[SimpleCacheConfigurator]
  }
  @scala.inline
  implicit class SimpleCacheConfiguratorOps[Self <: SimpleCacheConfigurator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForever(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forever")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvalidate(value: SimpleCacheCallback[js.Any] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNever(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("never")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUsing(value: SimpleCacheCallback[js.Any] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

