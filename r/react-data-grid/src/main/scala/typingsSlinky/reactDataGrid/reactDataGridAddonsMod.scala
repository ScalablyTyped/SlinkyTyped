package typingsSlinky.reactDataGrid

import typingsSlinky.reactDataGrid.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactDataGridAddonsMod {
  
  // attach to window
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var ReactDataGridPlugins: Data = js.native
    }
    object Window {
      
      @scala.inline
      def apply(ReactDataGridPlugins: Data): Window = {
        val __obj = js.Dynamic.literal(ReactDataGridPlugins = ReactDataGridPlugins.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setReactDataGridPlugins(value: Data): Self = StObject.set(x, "ReactDataGridPlugins", value.asInstanceOf[js.Any])
      }
    }
  }
}
