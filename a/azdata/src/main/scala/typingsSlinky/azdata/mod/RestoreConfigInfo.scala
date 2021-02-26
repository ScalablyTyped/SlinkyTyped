package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreConfigInfo extends StObject {
  
  var configInfo: StringDictionary[js.Any] = js.native
}
object RestoreConfigInfo {
  
  @scala.inline
  def apply(configInfo: StringDictionary[js.Any]): RestoreConfigInfo = {
    val __obj = js.Dynamic.literal(configInfo = configInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreConfigInfo]
  }
  
  @scala.inline
  implicit class RestoreConfigInfoMutableBuilder[Self <: RestoreConfigInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigInfo(value: StringDictionary[js.Any]): Self = StObject.set(x, "configInfo", value.asInstanceOf[js.Any])
  }
}
