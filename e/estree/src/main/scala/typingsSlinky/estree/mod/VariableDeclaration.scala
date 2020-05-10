package typingsSlinky.estree.mod

import typingsSlinky.estree.estreeStrings.`var`
import typingsSlinky.estree.estreeStrings.const
import typingsSlinky.estree.estreeStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclaration
  extends Declaration
     with BaseNode {
  var declarations: js.Array[VariableDeclarator] = js.native
  var kind: `var` | let | const = js.native
  @JSName("type")
  var type_VariableDeclaration: typingsSlinky.estree.estreeStrings.VariableDeclaration = js.native
}

object VariableDeclaration {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator],
    kind: `var` | let | const,
    `type`: typingsSlinky.estree.estreeStrings.VariableDeclaration
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration]
  }
  @scala.inline
  implicit class VariableDeclarationOps[Self <: VariableDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclarations(value: js.Array[VariableDeclarator]): Self = {
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
    def withType(value: typingsSlinky.estree.estreeStrings.VariableDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

