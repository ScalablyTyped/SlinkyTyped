package typingsSlinky.iobroker.objectsMod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.script
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptObject
  extends BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_ScriptObject: ScriptCommon = js.native
  
  @JSName("type")
  var type_ScriptObject: script = js.native
}
object ScriptObject {
  
  @scala.inline
  def apply(_id: String, common: ScriptCommon, native: Record[String, _], `type`: script): ScriptObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptObject]
  }
  
  @scala.inline
  implicit class ScriptObjectOps[Self <: ScriptObject] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: ScriptCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: script): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
