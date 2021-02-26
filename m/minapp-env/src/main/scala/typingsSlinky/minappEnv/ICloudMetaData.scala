package typingsSlinky.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICloudMetaData extends StObject {
  
  var session_id: java.lang.String = js.native
}
object ICloudMetaData {
  
  @scala.inline
  def apply(session_id: java.lang.String): ICloudMetaData = {
    val __obj = js.Dynamic.literal(session_id = session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudMetaData]
  }
  
  @scala.inline
  implicit class ICloudMetaDataMutableBuilder[Self <: ICloudMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSession_id(value: java.lang.String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
  }
}
