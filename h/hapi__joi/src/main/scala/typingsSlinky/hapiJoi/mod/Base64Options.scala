package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@hapi/joi.@hapi/joi.DataUriOptions, 'paddingRequired'> */
@js.native
trait Base64Options extends js.Object {
  var paddingRequired: js.UndefOr[Boolean] = js.native
  /**
    * if true, uses the URI-safe base64 format which replaces `+` with `-` and `\` with `_`.
    *
    * @default false
    */
  var urlSafe: js.UndefOr[Boolean] = js.native
}

object Base64Options {
  @scala.inline
  def apply(): Base64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base64Options]
  }
  @scala.inline
  implicit class Base64OptionsOps[Self <: Base64Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaddingRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlSafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlSafe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlSafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlSafe")(js.undefined)
        ret
    }
  }
  
}

