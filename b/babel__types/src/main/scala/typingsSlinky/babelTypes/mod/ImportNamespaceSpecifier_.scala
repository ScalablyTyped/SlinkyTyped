package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait ImportNamespaceSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  var local: Identifier_ = js.native
  @JSName("type")
  var type_ImportNamespaceSpecifier_ : ImportNamespaceSpecifier = js.native
}

object ImportNamespaceSpecifier_ {
  @scala.inline
  def apply(local: Identifier_, `type`: ImportNamespaceSpecifier): ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportNamespaceSpecifier_]
  }
  @scala.inline
  implicit class ImportNamespaceSpecifier_Ops[Self <: ImportNamespaceSpecifier_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocal(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ImportNamespaceSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

