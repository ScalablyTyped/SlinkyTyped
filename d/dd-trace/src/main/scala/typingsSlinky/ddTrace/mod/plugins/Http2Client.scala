package typingsSlinky.ddTrace.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait Http2Client extends Http_ {
  /**
    * Use the remote endpoint host as the service name instead of the default.
    *
    * @default false
    */
  var splitByDomain: js.UndefOr[Boolean] = js.native
}

object Http2Client {
  @scala.inline
  def apply(): Http2Client = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http2Client]
  }
  @scala.inline
  implicit class Http2ClientOps[Self <: Http2Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSplitByDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitByDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitByDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitByDomain")(js.undefined)
        ret
    }
  }
  
}

