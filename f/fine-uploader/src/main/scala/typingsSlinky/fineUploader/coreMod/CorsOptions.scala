package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorsOptions extends js.Object {
  /**
    * Enable or disable cross-origin requests from IE9 and older where XDomainRequest must be used
    *
    * @default `false`
    */
  var allowXdr: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable cross-domain requests
    *
    * @default `false`
    */
  var expected: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable sending credentials along with each cross-domain request. Ignored if allowXdr is true and IE9 is being used
    *
    * @default `false`
    */
  var sendCredentials: js.UndefOr[Boolean] = js.native
}

object CorsOptions {
  @scala.inline
  def apply(): CorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorsOptions]
  }
  @scala.inline
  implicit class CorsOptionsOps[Self <: CorsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowXdr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowXdr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowXdr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowXdr")(js.undefined)
        ret
    }
    @scala.inline
    def withExpected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(js.undefined)
        ret
    }
    @scala.inline
    def withSendCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendCredentials")(js.undefined)
        ret
    }
  }
  
}

