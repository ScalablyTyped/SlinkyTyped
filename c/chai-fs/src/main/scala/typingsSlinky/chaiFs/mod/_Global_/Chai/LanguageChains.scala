package typingsSlinky.chaiFs.mod._Global_.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageChains extends js.Object {
  var json: Assertion = js.native
  var using: Assertion = js.native
}

object LanguageChains {
  @scala.inline
  def apply(json: Assertion, using: Assertion): LanguageChains = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageChains]
  }
  @scala.inline
  implicit class LanguageChainsOps[Self <: LanguageChains] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJson(value: Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsing(value: Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

