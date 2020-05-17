package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.DeclareVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait DeclareVariable_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier_ = js.native
  @JSName("type")
  var type_DeclareVariable_ : DeclareVariable = js.native
}

object DeclareVariable_ {
  @scala.inline
  def apply(id: Identifier_, `type`: DeclareVariable): DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareVariable_]
  }
  @scala.inline
  implicit class DeclareVariable_Ops[Self <: DeclareVariable_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DeclareVariable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

