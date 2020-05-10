package typingsSlinky.bristolSentry.mod

import typingsSlinky.raven.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentryConfig extends js.Object {
  var client: js.UndefOr[js.Object | Client] = js.native
}

object SentryConfig {
  @scala.inline
  def apply(): SentryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentryConfig]
  }
  @scala.inline
  implicit class SentryConfigOps[Self <: SentryConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: js.Object | Client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
  }
  
}

