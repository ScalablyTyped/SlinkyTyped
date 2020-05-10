package typingsSlinky.cypress.sinonChaiMod._Global_.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageChains extends js.Object {
  var always: Assertion = js.native
}

object LanguageChains {
  @scala.inline
  def apply(always: Assertion): LanguageChains = {
    val __obj = js.Dynamic.literal(always = always.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageChains]
  }
  @scala.inline
  implicit class LanguageChainsOps[Self <: LanguageChains] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlways(value: Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

