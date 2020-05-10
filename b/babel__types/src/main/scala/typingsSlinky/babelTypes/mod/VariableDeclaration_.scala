package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.VariableDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.`var`
import typingsSlinky.babelTypes.babelTypesStrings.const
import typingsSlinky.babelTypes.babelTypesStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait VariableDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  var declarations: js.Array[VariableDeclarator_] = js.native
  var declare: Boolean | Null = js.native
  var kind: `var` | let | const = js.native
  @JSName("type")
  var type_VariableDeclaration_ : VariableDeclaration = js.native
}

object VariableDeclaration_ {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator_],
    kind: `var` | let | const,
    `type`: VariableDeclaration
  ): VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration_]
  }
  @scala.inline
  implicit class VariableDeclaration_Ops[Self <: VariableDeclaration_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclarations(value: js.Array[VariableDeclarator_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: `var` | let | const): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: VariableDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declare")(null)
        ret
    }
  }
  
}

