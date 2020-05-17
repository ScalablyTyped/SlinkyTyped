package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSIntersectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait TSIntersectionType_
  extends TSType
     with BaseNode {
  @JSName("type")
  var type_TSIntersectionType_ : TSIntersectionType = js.native
  var types: js.Array[TSType] = js.native
}

object TSIntersectionType_ {
  @scala.inline
  def apply(`type`: TSIntersectionType, types: js.Array[TSType]): TSIntersectionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSIntersectionType_]
  }
  @scala.inline
  implicit class TSIntersectionType_Ops[Self <: TSIntersectionType_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: TSIntersectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[TSType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

