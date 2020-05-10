package typingsSlinky.reactLoadable.LoadableExport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingComponentProps extends js.Object {
  var error: js.Any = js.native
  var isLoading: Boolean = js.native
  var pastDelay: Boolean = js.native
  var timedOut: Boolean = js.native
  def retry(): Unit = js.native
}

object LoadingComponentProps {
  @scala.inline
  def apply(error: js.Any, isLoading: Boolean, pastDelay: Boolean, retry: () => Unit, timedOut: Boolean): LoadingComponentProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], pastDelay = pastDelay.asInstanceOf[js.Any], retry = js.Any.fromFunction0(retry), timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingComponentProps]
  }
  @scala.inline
  implicit class LoadingComponentPropsOps[Self <: LoadingComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPastDelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTimedOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

