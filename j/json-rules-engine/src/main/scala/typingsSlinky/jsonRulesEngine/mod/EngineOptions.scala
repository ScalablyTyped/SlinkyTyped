package typingsSlinky.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineOptions extends js.Object {
  var allowUndefinedFacts: Boolean = js.native
}

object EngineOptions {
  @scala.inline
  def apply(allowUndefinedFacts: Boolean): EngineOptions = {
    val __obj = js.Dynamic.literal(allowUndefinedFacts = allowUndefinedFacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineOptions]
  }
  @scala.inline
  implicit class EngineOptionsOps[Self <: EngineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUndefinedFacts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUndefinedFacts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

