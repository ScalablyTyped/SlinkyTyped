package typingsSlinky.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchFunctionOptions extends js.Object {
  /**
    * Function for decoding strings for params.
    */
  var decode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.native
}

object MatchFunctionOptions {
  @scala.inline
  def apply(): MatchFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchFunctionOptions]
  }
  @scala.inline
  implicit class MatchFunctionOptionsOps[Self <: MatchFunctionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecode(value: (/* value */ String, /* token */ Key) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.undefined)
        ret
    }
  }
  
}

