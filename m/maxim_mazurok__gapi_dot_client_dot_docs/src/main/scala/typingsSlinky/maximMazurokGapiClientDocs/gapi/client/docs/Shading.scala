package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shading extends StObject {
  
  /** The background color of this paragraph shading. */
  var backgroundColor: js.UndefOr[OptionalColor] = js.native
}
object Shading {
  
  @scala.inline
  def apply(): Shading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shading]
  }
  
  @scala.inline
  implicit class ShadingMutableBuilder[Self <: Shading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: OptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
  }
}
