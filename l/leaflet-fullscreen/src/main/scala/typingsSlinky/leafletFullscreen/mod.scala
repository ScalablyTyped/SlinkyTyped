package typingsSlinky.leafletFullscreen

import typingsSlinky.leafletFullscreen.anon.PseudoFullscreen
import typingsSlinky.leafletFullscreen.leafletFullscreenBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait MapOptions extends StObject {
    
    var fullscreenControl: js.UndefOr[`true` | PseudoFullscreen] = js.native
  }
  object MapOptions {
    
    @scala.inline
    def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullscreenControl(value: `true` | PseudoFullscreen): Self = StObject.set(x, "fullscreenControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenControlUndefined: Self = StObject.set(x, "fullscreenControl", js.undefined)
    }
  }
}
