package typingsSlinky.hapiHapi

import typingsSlinky.hapiHapi.hapiHapiStrings.base64
import typingsSlinky.hapiHapi.hapiHapiStrings.base64json
import typingsSlinky.hapiHapi.hapiHapiStrings.form
import typingsSlinky.hapiHapi.hapiHapiStrings.iron
import typingsSlinky.hapiHapi.hapiHapiStrings.none_
import typingsSlinky.hapiHapi.mod.SameSitePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEncoding extends js.Object {
  var encoding: js.UndefOr[none_ | base64 | base64json | form | iron] = js.native
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  var isHttpOnly: js.UndefOr[Boolean] = js.native
  var isSameSite: js.UndefOr[SameSitePolicy] = js.native
  var isSecure: js.UndefOr[Boolean] = js.native
  var strictHeader: js.UndefOr[Boolean] = js.native
}

object AnonEncoding {
  @scala.inline
  def apply(): AnonEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEncoding]
  }
  @scala.inline
  implicit class AnonEncodingOps[Self <: AnonEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: none_ | base64 | base64json | form | iron): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHttpOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHttpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHttpOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHttpOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSameSite(value: SameSitePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSameSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameSite")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSecure")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictHeader")(js.undefined)
        ret
    }
  }
  
}

