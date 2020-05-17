package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.EnumNumberMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait EnumNumberMember_
  extends EnumMember
     with BaseNode {
  var id: Identifier_ = js.native
  var init: NumericLiteral_ = js.native
  @JSName("type")
  var type_EnumNumberMember_ : EnumNumberMember = js.native
}

object EnumNumberMember_ {
  @scala.inline
  def apply(id: Identifier_, init: NumericLiteral_, `type`: EnumNumberMember): EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumNumberMember_]
  }
  @scala.inline
  implicit class EnumNumberMember_Ops[Self <: EnumNumberMember_] (val x: Self) extends AnyVal {
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
    def withInit(value: NumericLiteral_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: EnumNumberMember): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

