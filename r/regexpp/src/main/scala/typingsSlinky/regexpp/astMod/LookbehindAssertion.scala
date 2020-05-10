package typingsSlinky.regexpp.astMod

import typingsSlinky.regexpp.regexppStrings.lookbehind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookbehindAssertion
  extends LookaroundAssertion
     with NodeBase {
  var alternatives: js.Array[Alternative] = js.native
  var kind: lookbehind = js.native
  var negate: Boolean = js.native
  @JSName("parent")
  var parent_LookbehindAssertion: Alternative = js.native
  @JSName("type")
  var type_LookbehindAssertion: typingsSlinky.regexpp.regexppStrings.Assertion = js.native
}

object LookbehindAssertion {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookbehind,
    negate: Boolean,
    parent: Alternative,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Assertion
  ): LookbehindAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookbehindAssertion]
  }
  @scala.inline
  implicit class LookbehindAssertionOps[Self <: LookbehindAssertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternatives(value: js.Array[Alternative]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: lookbehind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Alternative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.regexpp.regexppStrings.Assertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

