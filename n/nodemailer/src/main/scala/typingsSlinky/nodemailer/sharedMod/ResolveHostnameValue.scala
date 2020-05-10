package typingsSlinky.nodemailer.sharedMod

import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveHostnameValue extends js.Object {
  var _cached: js.UndefOr[`true`] = js.native
  var host: String = js.native
  var servername: String | `false` = js.native
}

object ResolveHostnameValue {
  @scala.inline
  def apply(host: String, servername: String | `false`): ResolveHostnameValue = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], servername = servername.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveHostnameValue]
  }
  @scala.inline
  implicit class ResolveHostnameValueOps[Self <: ResolveHostnameValue] (val x: Self) extends AnyVal {
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
    def withServername(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_cached(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_cached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cached")(js.undefined)
        ret
    }
  }
  
}

