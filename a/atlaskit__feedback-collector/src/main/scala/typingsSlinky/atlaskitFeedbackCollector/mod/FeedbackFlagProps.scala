package typingsSlinky.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedbackFlagProps extends js.Object {
  var isDismissAllowed: js.UndefOr[Boolean] = js.native
  var onDismissed: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object FeedbackFlagProps {
  @scala.inline
  def apply(): FeedbackFlagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackFlagProps]
  }
  @scala.inline
  implicit class FeedbackFlagPropsOps[Self <: FeedbackFlagProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDismissAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDismissAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDismissAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDismissAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismissed(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismissed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDismissed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismissed")(js.undefined)
        ret
    }
  }
  
}

