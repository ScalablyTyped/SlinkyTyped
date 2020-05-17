package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ExportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait ExportSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  var exported: Identifier_ = js.native
  var local: Identifier_ = js.native
  @JSName("type")
  var type_ExportSpecifier_ : ExportSpecifier = js.native
}

object ExportSpecifier_ {
  @scala.inline
  def apply(exported: Identifier_, local: Identifier_, `type`: ExportSpecifier): ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpecifier_]
  }
  @scala.inline
  implicit class ExportSpecifier_Ops[Self <: ExportSpecifier_] (val x: Self) extends AnyVal {
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
    def withLocal(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ExportSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

