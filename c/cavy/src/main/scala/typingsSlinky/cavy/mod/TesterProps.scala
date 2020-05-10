package typingsSlinky.cavy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TesterProps extends js.Object {
  var clearAsyncStorage: js.UndefOr[Boolean] = js.native
  var reporter: js.UndefOr[js.Function1[/* report */ TestReport, Unit]] = js.native
  // Deprecated
  var sendReport: js.UndefOr[Boolean] = js.native
  var specs: js.Array[js.Function1[/* spec */ TestScope, Unit]] = js.native
  var startDelay: js.UndefOr[Double] = js.native
  var store: TestHookStore = js.native
  var waitTime: js.UndefOr[Double] = js.native
}

object TesterProps {
  @scala.inline
  def apply(specs: js.Array[js.Function1[/* spec */ TestScope, Unit]], store: TestHookStore): TesterProps = {
    val __obj = js.Dynamic.literal(specs = specs.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[TesterProps]
  }
  @scala.inline
  implicit class TesterPropsOps[Self <: TesterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpecs(value: js.Array[js.Function1[/* spec */ TestScope, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: TestHookStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearAsyncStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAsyncStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearAsyncStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAsyncStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: /* report */ TestReport => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withSendReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendReport")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTime")(js.undefined)
        ret
    }
  }
  
}

