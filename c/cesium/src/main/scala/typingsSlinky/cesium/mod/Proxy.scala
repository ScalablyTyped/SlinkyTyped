package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proxy extends StObject {
  
  def getURL(resource: String): String = js.native
}
object Proxy {
  
  @scala.inline
  def apply(getURL: String => String): Proxy = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction1(getURL))
    __obj.asInstanceOf[Proxy]
  }
  
  @scala.inline
  implicit class ProxyMutableBuilder[Self <: Proxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetURL(value: String => String): Self = StObject.set(x, "getURL", js.Any.fromFunction1(value))
  }
}
