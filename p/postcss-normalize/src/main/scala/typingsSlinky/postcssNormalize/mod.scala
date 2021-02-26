package typingsSlinky.postcssNormalize

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.postcss.mod.Plugin_
import typingsSlinky.postcssNormalize.mod.Normalize.NormalizePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-normalize", JSImport.Namespace)
  @js.native
  val ^ : NormalizePlugin = js.native
  
  object Normalize {
    
    type NormalizePlugin = Plugin_[Options]
    
    @js.native
    trait Options extends StObject {
      
      /**
        * @default false
        */
      var allowDuplicates: js.UndefOr[Boolean] = js.native
      
      /**
        * @default null
        */
      var browsers: js.UndefOr[String] = js.native
      
      /**
        * @default null
        */
      var forceImport: js.UndefOr[Boolean | String] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowDuplicates(value: Boolean): Self = StObject.set(x, "allowDuplicates", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowDuplicatesUndefined: Self = StObject.set(x, "allowDuplicates", js.undefined)
        
        @scala.inline
        def setBrowsers(value: String): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
        
        @scala.inline
        def setForceImport(value: Boolean | String): Self = StObject.set(x, "forceImport", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceImportUndefined: Self = StObject.set(x, "forceImport", js.undefined)
      }
    }
  }
  
  type _To = NormalizePlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NormalizePlugin = ^
}
