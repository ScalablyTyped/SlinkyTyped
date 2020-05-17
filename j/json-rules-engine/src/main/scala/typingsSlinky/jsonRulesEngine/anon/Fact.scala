package typingsSlinky.jsonRulesEngine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fact extends js.Object {
  var fact: String = js.native
}

object Fact {
  @scala.inline
  def apply(fact: String): Fact = {
    val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fact]
  }
  @scala.inline
  implicit class FactOps[Self <: Fact] (val x: Self) extends AnyVal {
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

