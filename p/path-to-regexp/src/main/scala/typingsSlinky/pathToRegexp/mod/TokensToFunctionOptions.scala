package typingsSlinky.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokensToFunctionOptions extends js.Object {
  /**
    * When `true` the regexp will be case sensitive. (default: `false`)
    */
  var sensitive: js.UndefOr[Boolean] = js.native
}

object TokensToFunctionOptions {
  @scala.inline
  def apply(): TokensToFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokensToFunctionOptions]
  }
  @scala.inline
  implicit class TokensToFunctionOptionsOps[Self <: TokensToFunctionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitive")(js.undefined)
        ret
    }
  }
  
}

