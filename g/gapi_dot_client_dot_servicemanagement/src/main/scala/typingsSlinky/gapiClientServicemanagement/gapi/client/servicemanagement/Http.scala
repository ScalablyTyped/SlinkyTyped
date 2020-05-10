package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http extends js.Object {
  /**
    * When set to true, URL path parmeters will be fully URI-decoded except in
    * cases of single segment matches in reserved expansion, where "%2F" will be
    * left encoded.
    *
    * The default behavior is to not decode RFC 6570 reserved characters in multi
    * segment matches.
    */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.native
  /**
    * A list of HTTP configuration rules that apply to individual API methods.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[HttpRule]] = js.native
}

object Http {
  @scala.inline
  def apply(): Http = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http]
  }
  @scala.inline
  implicit class HttpOps[Self <: Http] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullyDecodeReservedExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyDecodeReservedExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullyDecodeReservedExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyDecodeReservedExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[HttpRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

