package typingsSlinky.jsonRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFact extends js.Object {
  var fact: String = js.native
}

object AnonFact {
  @scala.inline
  def apply(fact: String): AnonFact = {
    val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFact]
  }
  @scala.inline
  implicit class AnonFactOps[Self <: AnonFact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fact")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

