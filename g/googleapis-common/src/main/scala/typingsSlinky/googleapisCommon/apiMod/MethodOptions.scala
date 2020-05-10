package typingsSlinky.googleapisCommon.apiMod

import typingsSlinky.gaxios.commonMod.GaxiosOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodOptions extends GaxiosOptions {
  var rootUrl: js.UndefOr[String] = js.native
  var userAgentDirectives: js.UndefOr[js.Array[UserAgentDirective]] = js.native
}

object MethodOptions {
  @scala.inline
  def apply(): MethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodOptions]
  }
  @scala.inline
  implicit class MethodOptionsOps[Self <: MethodOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRootUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgentDirectives(value: js.Array[UserAgentDirective]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgentDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentDirectives")(js.undefined)
        ret
    }
  }
  
}

