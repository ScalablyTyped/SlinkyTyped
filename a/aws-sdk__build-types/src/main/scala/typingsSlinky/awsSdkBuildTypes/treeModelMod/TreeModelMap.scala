package typingsSlinky.awsSdkBuildTypes.treeModelMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.map
import typingsSlinky.awsSdkTypes.protocolMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeModelMap
  extends Map
     with Documented
     with Named {
  @JSName("key")
  var key_TreeModelMap: TreeModelMember = js.native
  @JSName("value")
  var value_TreeModelMap: TreeModelMember = js.native
}

object TreeModelMap {
  @scala.inline
  def apply(documentation: String, key: TreeModelMember, name: String, `type`: map, value: TreeModelMember): TreeModelMap = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelMap]
  }
  @scala.inline
  implicit class TreeModelMapOps[Self <: TreeModelMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: TreeModelMember): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: TreeModelMember): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

