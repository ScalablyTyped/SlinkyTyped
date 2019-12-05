package typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyObserver[T] extends js.Object {
  var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.undefined
}

object LegacyObserver {
  @scala.inline
  def apply[T](
    onCompleted: () => Unit = null,
    onError: /* error */ js.Error => Unit = null,
    onNext: /* data */ T => Unit = null
  ): LegacyObserver[T] = {
    val __obj = js.Dynamic.literal()
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction0(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1(onNext))
    __obj.asInstanceOf[LegacyObserver[T]]
  }
}

