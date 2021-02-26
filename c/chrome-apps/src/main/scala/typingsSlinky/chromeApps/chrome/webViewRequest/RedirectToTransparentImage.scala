package typingsSlinky.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Declarative event action that redirects a network request to a transparent image. */
@js.native
trait RedirectToTransparentImage extends OnRequestActions {
  
  val instanceType: String = js.native
  
  val typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.RedirectToTransparentImage = js.native
}
object RedirectToTransparentImage {
  
  @scala.inline
  def apply(
    instanceType: String,
    typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.RedirectToTransparentImage
  ): RedirectToTransparentImage = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectToTransparentImage]
  }
  
  @scala.inline
  implicit class RedirectToTransparentImageMutableBuilder[Self <: RedirectToTransparentImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typingsSlinky.chromeApps.chromeAppsStrings.RedirectToTransparentImage): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
