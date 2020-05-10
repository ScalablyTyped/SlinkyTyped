package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.SwitchCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchCase_
  extends BaseNode
     with _Node {
  var consequent: js.Array[Statement] = js.native
  var test: Expression | Null = js.native
  @JSName("type")
  var type_SwitchCase_ : SwitchCase = js.native
}

object SwitchCase_ {
  @scala.inline
  def apply(consequent: js.Array[Statement], `type`: SwitchCase): SwitchCase_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchCase_]
  }
  @scala.inline
  implicit class SwitchCase_Ops[Self <: SwitchCase_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsequent(value: js.Array[Statement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consequent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: SwitchCase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(null)
        ret
    }
  }
  
}

