package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ImportSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.`type`
import typingsSlinky.babelTypes.babelTypesStrings.typeof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait ImportSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  var importKind: `type` | typeof | Null = js.native
  var imported: Identifier_ = js.native
  var local: Identifier_ = js.native
  @JSName("type")
  var type_ImportSpecifier_ : ImportSpecifier = js.native
}

object ImportSpecifier_ {
  @scala.inline
  def apply(imported: Identifier_, local: Identifier_, `type`: ImportSpecifier): ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier_]
  }
  @scala.inline
  implicit class ImportSpecifier_Ops[Self <: ImportSpecifier_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImported(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ImportSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportKind(value: `type` | typeof): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportKindNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importKind")(null)
        ret
    }
  }
  
}

