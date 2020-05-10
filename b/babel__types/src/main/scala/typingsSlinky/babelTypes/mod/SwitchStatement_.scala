package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.SwitchStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait SwitchStatement_
  extends BlockParent
     with BaseNode
     with Scopable
     with Statement {
  var cases: js.Array[SwitchCase_] = js.native
  var discriminant: Expression = js.native
  @JSName("type")
  var type_SwitchStatement_ : SwitchStatement = js.native
}

object SwitchStatement_ {
  @scala.inline
  def apply(cases: js.Array[SwitchCase_], discriminant: Expression, `type`: SwitchStatement): SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchStatement_]
  }
  @scala.inline
  implicit class SwitchStatement_Ops[Self <: SwitchStatement_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCases(value: js.Array[SwitchCase_]): Self = {
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
    def withType(value: SwitchStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

