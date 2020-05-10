package typingsSlinky.awsSdkBuildTypes.treeModelMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.string
import typingsSlinky.awsSdkTypes.protocolMod.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeModelString
  extends String
     with Documented
     with Named {
  var enum: js.UndefOr[js.Array[java.lang.String]] = js.native
}

object TreeModelString {
  @scala.inline
  def apply(documentation: java.lang.String, name: java.lang.String, `type`: string): TreeModelString = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelString]
  }
  @scala.inline
  implicit class TreeModelStringOps[Self <: TreeModelString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnum(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(js.undefined)
        ret
    }
  }
  
}

