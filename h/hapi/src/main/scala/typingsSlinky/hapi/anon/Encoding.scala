package typingsSlinky.hapi.anon

import typingsSlinky.hapi.hapiBooleans.`false`
import typingsSlinky.hapi.hapiStrings.Lax
import typingsSlinky.hapi.hapiStrings.Strict
import typingsSlinky.hapi.hapiStrings.base64
import typingsSlinky.hapi.hapiStrings.base64json
import typingsSlinky.hapi.hapiStrings.form
import typingsSlinky.hapi.hapiStrings.iron
import typingsSlinky.hapi.hapiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoding extends js.Object {
  var encoding: js.UndefOr[none | base64 | base64json | form | iron] = js.native
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  var isHttpOnly: js.UndefOr[Boolean] = js.native
  var isSameSite: js.UndefOr[`false` | Strict | Lax] = js.native
  var isSecure: js.UndefOr[Boolean] = js.native
  var strictHeader: js.UndefOr[Boolean] = js.native
}

object Encoding {
  @scala.inline
  def apply(): Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encoding]
  }
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: none | base64 | base64json | form | iron): Self = {
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
    def withIsSameSite(value: `false` | Strict | Lax): Self = {
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

