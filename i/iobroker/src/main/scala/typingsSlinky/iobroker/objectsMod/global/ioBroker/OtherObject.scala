package typingsSlinky.iobroker.objectsMod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.adapter
import typingsSlinky.iobroker.iobrokerStrings.chart
import typingsSlinky.iobroker.iobrokerStrings.config
import typingsSlinky.iobroker.iobrokerStrings.info
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
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
  implicit class OtherObjectMutableBuilder[Self <: OtherObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: OtherCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: adapter | config | info | chart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
