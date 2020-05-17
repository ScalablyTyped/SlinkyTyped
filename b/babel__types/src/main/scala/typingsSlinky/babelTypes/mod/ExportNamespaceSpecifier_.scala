package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait ExportNamespaceSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  var exported: Identifier_ = js.native
  @JSName("type")
  var type_ExportNamespaceSpecifier_ : ExportNamespaceSpecifier = js.native
}

object ExportNamespaceSpecifier_ {
  @scala.inline
  def apply(exported: Identifier_, `type`: ExportNamespaceSpecifier): ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamespaceSpecifier_]
  }
  @scala.inline
  implicit class ExportNamespaceSpecifier_Ops[Self <: ExportNamespaceSpecifier_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExported(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ExportNamespaceSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

