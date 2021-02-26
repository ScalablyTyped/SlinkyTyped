package typingsSlinky.miniprogram

import typingsSlinky.miniprogram.anon.CreateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSavedFileInfo extends AsyncCallback[CreateTime] {
  
  var apFilePath: String = js.native
}
object GetSavedFileInfo {
  
  @scala.inline
  def apply(apFilePath: String): GetSavedFileInfo = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfo]
  }
  
  @scala.inline
  implicit class GetSavedFileInfoMutableBuilder[Self <: GetSavedFileInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}
