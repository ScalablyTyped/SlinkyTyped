package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.`type`
import typingsSlinky.babelTypes.babelTypesStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait DeclareExportAllDeclaration_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var exportKind: `type` | value | Null = js.native
  var source: StringLiteral_ = js.native
  @JSName("type")
  var type_DeclareExportAllDeclaration_ : DeclareExportAllDeclaration = js.native
}

object DeclareExportAllDeclaration_ {
  @scala.inline
  def apply(source: StringLiteral_, `type`: DeclareExportAllDeclaration): DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportAllDeclaration_]
  }
  @scala.inline
  implicit class DeclareExportAllDeclaration_Ops[Self <: DeclareExportAllDeclaration_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: StringLiteral_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DeclareExportAllDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportKind(value: `type` | value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportKindNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportKind")(null)
        ret
    }
  }
  
}

