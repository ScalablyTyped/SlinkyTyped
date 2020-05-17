package typingsSlinky.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultPromise extends js.Object {
  def `catch`(errorCallback: js.Function0[Unit]): DefaultPromise = js.native
  def `then`(
    successCallback: js.Function1[/* value */ js.UndefOr[js.Any], Unit],
    errorCallback: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  ): DefaultPromise = js.native
}

object DefaultPromise {
  @scala.inline
  def apply(
    `catch`: js.Function0[Unit] => DefaultPromise,
    `then`: (js.Function1[/* value */ js.UndefOr[js.Any], Unit], js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => DefaultPromise
  ): DefaultPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[DefaultPromise]
  }
  @scala.inline
  implicit class DefaultPromiseOps[Self <: DefaultPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatch(value: js.Function0[Unit] => DefaultPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThen(
      value: (js.Function1[/* value */ js.UndefOr[js.Any], Unit], js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => DefaultPromise
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

