package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSModuleDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait TSModuleDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  var body: TSModuleBlock_ | TSModuleDeclaration_ = js.native
  var declare: Boolean | Null = js.native
  var global: Boolean | Null = js.native
  var id: Identifier_ | StringLiteral_ = js.native
  @JSName("type")
  var type_TSModuleDeclaration_ : TSModuleDeclaration = js.native
}

object TSModuleDeclaration_ {
  @scala.inline
  def apply(
    body: TSModuleBlock_ | TSModuleDeclaration_,
    id: Identifier_ | StringLiteral_,
    `type`: TSModuleDeclaration
  ): TSModuleDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleDeclaration_]
  }
  @scala.inline
  implicit class TSModuleDeclaration_Ops[Self <: TSModuleDeclaration_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: TSModuleBlock_ | TSModuleDeclaration_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Identifier_ | StringLiteral_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSModuleDeclaration): Self = {
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
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(null)
        ret
    }
  }
  
}

