package typingsSlinky.rsocketCore

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Frame
import typingsSlinky.rsocketTypes.reactiveStreamTypesMod.ISubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rsocket-types.rsocket-types.ISubscriber<rsocket-types.rsocket-types.Frame>> */
@js.native
trait PartialISubscriberFrame extends js.Object {
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var onNext: js.UndefOr[js.Function1[/* value */ Frame, Unit]] = js.native
  var onSubscribe: js.UndefOr[js.Function1[/* subscription */ ISubscription, Unit]] = js.native
}

object PartialISubscriberFrame {
  @scala.inline
  def apply(): PartialISubscriberFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISubscriberFrame]
  }
  @scala.inline
  implicit class PartialISubscriberFrameOps[Self <: PartialISubscriberFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNext(value: /* value */ Frame => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubscribe(value: /* subscription */ ISubscription => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.undefined)
        ret
    }
  }
  
}

