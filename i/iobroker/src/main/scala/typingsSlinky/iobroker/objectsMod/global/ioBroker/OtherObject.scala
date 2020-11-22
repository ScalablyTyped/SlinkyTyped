package typingsSlinky.iobroker.objectsMod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.adapter
import typingsSlinky.iobroker.iobrokerStrings.chart
import typingsSlinky.iobroker.iobrokerStrings.config
import typingsSlinky.iobroker.iobrokerStrings.info
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherObject
  extends BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_OtherObject: OtherCommon = js.native
  
  @JSName("type")
  var type_OtherObject: adapter | config | info | chart = js.native
}
object OtherObject {
  
  @scala.inline
  def apply(
    _id: String,
    common: OtherCommon,
    native: Record[String, _],
    `type`: adapter | config | info | chart
  ): OtherObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherObject]
  }
  
  @scala.inline
  implicit class OtherObjectOps[Self <: OtherObject] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: OtherCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: adapter | config | info | chart): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
