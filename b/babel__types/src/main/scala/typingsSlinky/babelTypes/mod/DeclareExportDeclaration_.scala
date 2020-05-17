package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.DeclareExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait DeclareExportDeclaration_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var declaration: Flow | Null = js.native
  var default: Boolean | Null = js.native
  var source: StringLiteral_ | Null = js.native
  var specifiers: (js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]) | Null = js.native
  @JSName("type")
  var type_DeclareExportDeclaration_ : DeclareExportDeclaration = js.native
}

object DeclareExportDeclaration_ {
  @scala.inline
  def apply(`type`: DeclareExportDeclaration): DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportDeclaration_]
  }
  @scala.inline
  implicit class DeclareExportDeclaration_Ops[Self <: DeclareExportDeclaration_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: DeclareExportDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclaration(value: Flow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclarationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(null)
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(null)
        ret
    }
    @scala.inline
    def withSource(value: StringLiteral_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(null)
        ret
    }
    @scala.inline
    def withSpecifiers(value: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecifiersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specifiers")(null)
        ret
    }
  }
  
}

