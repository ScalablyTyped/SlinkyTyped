package typingsSlinky.bluebirdLst.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancellation extends js.Object {
  /** Enable cancellation */
  var cancellation: js.UndefOr[Boolean] = js.native
  /** Enable long stack traces */
  var longStackTraces: js.UndefOr[Boolean] = js.native
  /** Enable monitoring */
  var monitoring: js.UndefOr[Boolean] = js.native
  /** Enable warnings */
  var warnings: js.UndefOr[Boolean | WForgottenReturn] = js.native
}

object Cancellation {
  @scala.inline
  def apply(): Cancellation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancellation]
  }
  @scala.inline
  implicit class CancellationOps[Self <: Cancellation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation")(js.undefined)
        ret
    }
    @scala.inline
    def withLongStackTraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longStackTraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongStackTraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longStackTraces")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: Boolean | WForgottenReturn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

