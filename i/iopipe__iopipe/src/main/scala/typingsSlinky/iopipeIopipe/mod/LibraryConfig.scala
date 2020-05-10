package typingsSlinky.iopipeIopipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LibraryConfig extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var networkTimeout: js.UndefOr[Double] = js.native
  var timeoutWindow: js.UndefOr[Double] = js.native
  var token: js.UndefOr[String] = js.native
}

object LibraryConfig {
  @scala.inline
  def apply(): LibraryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryConfig]
  }
  @scala.inline
  implicit class LibraryConfigOps[Self <: LibraryConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

