package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureOption extends StObject {
  
  /**
    * 
    */
  var CaptureMode: typingsSlinky.awsSdk.sagemakerMod.CaptureMode = js.native
}
object CaptureOption {
  
  @scala.inline
  def apply(CaptureMode: CaptureMode): CaptureOption = {
    val __obj = js.Dynamic.literal(CaptureMode = CaptureMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOption]
  }
  
  @scala.inline
  implicit class CaptureOptionMutableBuilder[Self <: CaptureOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureMode(value: CaptureMode): Self = StObject.set(x, "CaptureMode", value.asInstanceOf[js.Any])
  }
}
