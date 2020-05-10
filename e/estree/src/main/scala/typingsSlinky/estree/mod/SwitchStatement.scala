package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchStatement
  extends BaseNode
     with Statement {
  var cases: js.Array[SwitchCase] = js.native
  var discriminant: Expression = js.native
  @JSName("type")
  var type_SwitchStatement: typingsSlinky.estree.estreeStrings.SwitchStatement = js.native
}

object SwitchStatement {
  @scala.inline
  def apply(
    cases: js.Array[SwitchCase],
    discriminant: Expression,
    `type`: typingsSlinky.estree.estreeStrings.SwitchStatement
  ): SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchStatement]
  }
  @scala.inline
  implicit class SwitchStatementOps[Self <: SwitchStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCases(value: js.Array[SwitchCase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscriminant(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.estree.estreeStrings.SwitchStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

