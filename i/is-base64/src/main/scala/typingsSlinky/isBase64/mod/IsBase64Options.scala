package typingsSlinky.isBase64.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsBase64Options extends js.Object {
  var allowEmpty: js.UndefOr[Boolean] = js.native
  var allowMime: js.UndefOr[Boolean] = js.native
  var mimeRequired: js.UndefOr[Boolean] = js.native
  var paddingRequired: js.UndefOr[Boolean] = js.native
}

object IsBase64Options {
  @scala.inline
  def apply(): IsBase64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsBase64Options]
  }
  @scala.inline
  implicit class IsBase64OptionsOps[Self <: IsBase64Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMime")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeRequired")(js.undefined)
        ret
    }
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
  }
  
}

