package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSImportEqualsDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait TSImportEqualsDeclaration_
  extends Statement
     with BaseNode {
  var id: Identifier_ = js.native
  var isExport: Boolean = js.native
  var moduleReference: TSEntityName | TSExternalModuleReference_ = js.native
  @JSName("type")
  var type_TSImportEqualsDeclaration_ : TSImportEqualsDeclaration = js.native
}

object TSImportEqualsDeclaration_ {
  @scala.inline
  def apply(
    id: Identifier_,
    isExport: Boolean,
    moduleReference: TSEntityName | TSExternalModuleReference_,
    `type`: TSImportEqualsDeclaration
  ): TSImportEqualsDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSImportEqualsDeclaration_]
  }
  @scala.inline
  implicit class TSImportEqualsDeclaration_Ops[Self <: TSImportEqualsDeclaration_] (val x: Self) extends AnyVal {
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
    def withIsExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleReference(value: TSEntityName | TSExternalModuleReference_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSImportEqualsDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

