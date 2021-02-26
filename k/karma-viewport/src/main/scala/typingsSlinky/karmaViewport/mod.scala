package typingsSlinky.karmaViewport

import typingsSlinky.karmaViewport.anon.PartialViewportConfigurat
import typingsSlinky.karmaViewport.viewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Declare ambient viewport instance
    */
  object global {
    
    @JSGlobal("viewport")
    @js.native
    val viewport: Viewport = js.native
  }
  
  /**
    * Augment Karma configuration type
    *
    * This is the exported configuration type for usage within Karma, because the
    * context selector and breakpoints are optional (merged with defaults).
    */
  object karmaAugmentingMod {
    
    @js.native
    trait ConfigOptions extends StObject {
      
      var viewport: js.UndefOr[PartialViewportConfigurat] = js.native
    }
    object ConfigOptions {
      
      @scala.inline
      def apply(): ConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConfigOptions]
      }
      
      @scala.inline
      implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setViewport(value: PartialViewportConfigurat): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
      }
    }
  }
}
