package typingsSlinky.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenProvider extends js.Object {
  var cacheTTLInSeconds: js.UndefOr[Double] = js.native
  var enableCache: js.UndefOr[Boolean] = js.native
}

object TokenProvider {
  @scala.inline
  def apply(): TokenProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenProvider]
  }
  @scala.inline
  implicit class TokenProviderOps[Self <: TokenProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheTTLInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTTLInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheTTLInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTTLInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCache")(js.undefined)
        ret
    }
  }
  
}

