package typingsSlinky.rascal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionConfig extends ConnectionAttributes {
  var management: js.UndefOr[ConnectionAttributes] = js.native
  var retry: js.UndefOr[RetryConfig] = js.native
}

object ConnectionConfig {
  @scala.inline
  def apply(): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionConfig]
  }
  @scala.inline
  implicit class ConnectionConfigOps[Self <: ConnectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagement(value: ConnectionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("management")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("management")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: RetryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
  }
  
}

