package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSSymbolKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait TSSymbolKeyword_
  extends TSType
     with BaseNode {
  @JSName("type")
  var type_TSSymbolKeyword_ : TSSymbolKeyword = js.native
}

object TSSymbolKeyword_ {
  @scala.inline
  def apply(`type`: TSSymbolKeyword): TSSymbolKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSSymbolKeyword_]
  }
  @scala.inline
  implicit class TSSymbolKeyword_Ops[Self <: TSSymbolKeyword_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: TSSymbolKeyword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

