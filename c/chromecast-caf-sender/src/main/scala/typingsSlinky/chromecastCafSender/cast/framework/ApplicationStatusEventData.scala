package typingsSlinky.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationStatusEventData extends EventData {
  
  var status: String = js.native
}
object ApplicationStatusEventData {
  
  @scala.inline
  def apply(status: String, `type`: String): ApplicationStatusEventData = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationStatusEventData]
  }
  
  @scala.inline
  implicit class ApplicationStatusEventDataMutableBuilder[Self <: ApplicationStatusEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
