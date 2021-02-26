package typingsSlinky.naverWhale.whale.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnedDetails extends StObject {
  
  /** The content setting. See the description of the individual ContentSetting objects for the possible values. */
  var setting: js.Any = js.native
}
object ReturnedDetails {
  
  @scala.inline
  def apply(setting: js.Any): ReturnedDetails = {
    val __obj = js.Dynamic.literal(setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnedDetails]
  }
  
  @scala.inline
  implicit class ReturnedDetailsMutableBuilder[Self <: ReturnedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: js.Any): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
