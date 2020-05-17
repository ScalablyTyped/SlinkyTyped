package typingsSlinky.jestWatcher.jestHooksMod

import typingsSlinky.jestWatcher.anon.ReadonlyJestHookEmitter
import typingsSlinky.jestWatcher.anon.ReadonlyJestHookSubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestHooks extends js.Object {
  var _emitter: js.Any = js.native
  var _listeners: js.Any = js.native
  var _subscriber: js.Any = js.native
  def getEmitter(): ReadonlyJestHookEmitter = js.native
  def getSubscriber(): ReadonlyJestHookSubscribe = js.native
  def isUsed(hook: AvailableHooks): Double = js.native
}

object JestHooks {
  @scala.inline
  def apply(
    _emitter: js.Any,
    _listeners: js.Any,
    _subscriber: js.Any,
    getEmitter: () => ReadonlyJestHookEmitter,
    getSubscriber: () => ReadonlyJestHookSubscribe,
    isUsed: AvailableHooks => Double
  ): JestHooks = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], _listeners = _listeners.asInstanceOf[js.Any], _subscriber = _subscriber.asInstanceOf[js.Any], getEmitter = js.Any.fromFunction0(getEmitter), getSubscriber = js.Any.fromFunction0(getSubscriber), isUsed = js.Any.fromFunction1(isUsed))
    __obj.asInstanceOf[JestHooks]
  }
  @scala.inline
  implicit class JestHooksOps[Self <: JestHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_emitter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_emitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_listeners(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_subscriber(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subscriber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetEmitter(value: () => ReadonlyJestHookEmitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmitter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubscriber(value: () => ReadonlyJestHookSubscribe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubscriber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUsed(value: AvailableHooks => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUsed")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

