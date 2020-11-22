package typingsSlinky.iobroker.objectsMod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumCommon extends ObjectCommon {
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  /** The IDs of the enum members */
  var members: js.UndefOr[js.Array[String]] = js.native
}
object EnumCommon {
  
  @scala.inline
  def apply(name: StringOrTranslated): EnumCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumCommon]
  }
  
  @scala.inline
  implicit class EnumCommonOps[Self <: EnumCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
  }
}
