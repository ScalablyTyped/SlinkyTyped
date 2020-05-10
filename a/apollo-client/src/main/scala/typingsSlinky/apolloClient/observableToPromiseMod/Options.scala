package typingsSlinky.apolloClient.observableToPromiseMod

import typingsSlinky.apolloClient.observableQueryMod.ObservableQuery
import typingsSlinky.apolloClient.typesMod.OperationVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var errorCallbacks: js.UndefOr[js.Array[js.Function1[/* error */ js.Error, _]]] = js.native
  var observable: ObservableQuery[_, OperationVariables] = js.native
  var shouldResolve: js.UndefOr[Boolean] = js.native
  @JSName("wait")
  var wait_FOptions: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(observable: ObservableQuery[_, OperationVariables]): Options = {
    val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObservable(value: ObservableQuery[_, OperationVariables]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCallbacks(value: js.Array[js.Function1[/* error */ js.Error, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldResolve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldResolve")(js.undefined)
        ret
    }
    @scala.inline
    def withWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.undefined)
        ret
    }
  }
  
}

