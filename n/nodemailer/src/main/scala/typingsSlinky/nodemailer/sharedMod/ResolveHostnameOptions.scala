package typingsSlinky.nodemailer.sharedMod

import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveHostnameOptions extends js.Object {
  var host: js.UndefOr[String] = js.native
  var servername: js.UndefOr[String | `false`] = js.native
}

object ResolveHostnameOptions {
  @scala.inline
  def apply(): ResolveHostnameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveHostnameOptions]
  }
  @scala.inline
  implicit class ResolveHostnameOptionsOps[Self <: ResolveHostnameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withServername(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(js.undefined)
        ret
    }
  }
  
}

