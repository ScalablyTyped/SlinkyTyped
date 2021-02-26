package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdGroupUrls
  extends AdWordsUrls
     with hasSetTrackingTemplate {
  
  def clearTrackingTemplate(): Unit = js.native
}
object AdGroupUrls {
  
  @scala.inline
  def apply(
    clearTrackingTemplate: () => Unit,
    getCustomParameters: () => js.Object,
    getTrackingTemplate: () => String,
    setCustomParameters: js.Object => Unit,
    setTrackingTemplate: String => Unit
  ): AdGroupUrls = {
    val __obj = js.Dynamic.literal(clearTrackingTemplate = js.Any.fromFunction0(clearTrackingTemplate), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
    __obj.asInstanceOf[AdGroupUrls]
  }
  
  @scala.inline
  implicit class AdGroupUrlsMutableBuilder[Self <: AdGroupUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearTrackingTemplate(value: () => Unit): Self = StObject.set(x, "clearTrackingTemplate", js.Any.fromFunction0(value))
  }
}
