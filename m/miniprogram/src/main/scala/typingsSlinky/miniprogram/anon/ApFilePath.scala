package typingsSlinky.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApFilePath extends StObject {
  
  var apFilePath: String = js.native
}
object ApFilePath {
  
  @scala.inline
  def apply(apFilePath: String): ApFilePath = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApFilePath]
  }
  
  @scala.inline
  implicit class ApFilePathMutableBuilder[Self <: ApFilePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}
