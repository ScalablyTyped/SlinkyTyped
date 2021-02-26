package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileAppUrls
  extends AdWordsUrls
     with hasGetFinalUrl
     with hasSetFinalUrl
     with hasSetTrackingTemplate {
  
  def clearMobileFinalUrl(): Unit = js.native
  
  def clearTrackingTemplate(): Unit = js.native
}
object MobileAppUrls {
  
  @scala.inline
  def apply(
    clearMobileFinalUrl: () => Unit,
    clearTrackingTemplate: () => Unit,
    getCustomParameters: () => js.Object,
    getFinalUrl: () => String,
    getMobileFinalUrl: () => String,
    getTrackingTemplate: () => String,
    setCustomParameters: js.Object => Unit,
    setFinalUrl: String => Unit,
    setMobileFinalUrl: String => Unit,
    setTrackingTemplate: String => Unit
  ): MobileAppUrls = {
    val __obj = js.Dynamic.literal(clearMobileFinalUrl = js.Any.fromFunction0(clearMobileFinalUrl), clearTrackingTemplate = js.Any.fromFunction0(clearTrackingTemplate), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setFinalUrl = js.Any.fromFunction1(setFinalUrl), setMobileFinalUrl = js.Any.fromFunction1(setMobileFinalUrl), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
    __obj.asInstanceOf[MobileAppUrls]
  }
  
  @scala.inline
  implicit class MobileAppUrlsMutableBuilder[Self <: MobileAppUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearMobileFinalUrl(value: () => Unit): Self = StObject.set(x, "clearMobileFinalUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearTrackingTemplate(value: () => Unit): Self = StObject.set(x, "clearTrackingTemplate", js.Any.fromFunction0(value))
  }
}
