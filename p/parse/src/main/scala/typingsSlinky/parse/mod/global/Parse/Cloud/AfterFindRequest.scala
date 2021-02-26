package typingsSlinky.parse.mod.global.Parse.Cloud

import typingsSlinky.parse.mod.global.Parse.Attributes
import typingsSlinky.parse.mod.global.Parse.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterFindRequest extends TriggerRequest {
  
  var objects: js.Array[Object[Attributes]] = js.native
}
object AfterFindRequest {
  
  @scala.inline
  def apply(
    headers: js.Any,
    ip: String,
    log: js.Any,
    `object`: Object[Attributes],
    objects: js.Array[Object[Attributes]],
    triggerName: String
  ): AfterFindRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterFindRequest]
  }
  
  @scala.inline
  implicit class AfterFindRequestMutableBuilder[Self <: AfterFindRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjects(value: js.Array[Object[Attributes]]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: Object[Attributes]*): Self = StObject.set(x, "objects", js.Array(value :_*))
  }
}
