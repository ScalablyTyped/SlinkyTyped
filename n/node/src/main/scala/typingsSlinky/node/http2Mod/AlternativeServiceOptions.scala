package typingsSlinky.node.http2Mod

import typingsSlinky.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlternativeServiceOptions extends StObject {
  
  var origin: Double | String | URL_ = js.native
}
object AlternativeServiceOptions {
  
  @scala.inline
  def apply(origin: Double | String | URL_): AlternativeServiceOptions = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternativeServiceOptions]
  }
  
  @scala.inline
  implicit class AlternativeServiceOptionsMutableBuilder[Self <: AlternativeServiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: Double | String | URL_): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
