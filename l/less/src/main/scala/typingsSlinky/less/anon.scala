package typingsSlinky.less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait PluginManager extends StObject {
    
    var pluginManager: typingsSlinky.less.Less.PluginManager = js.native
  }
  object PluginManager {
    
    @scala.inline
    def apply(pluginManager: typingsSlinky.less.Less.PluginManager): PluginManager = {
      val __obj = js.Dynamic.literal(pluginManager = pluginManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginManager]
    }
    
    @scala.inline
    implicit class PluginManagerMutableBuilder[Self <: PluginManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPluginManager(value: typingsSlinky.less.Less.PluginManager): Self = StObject.set(x, "pluginManager", value.asInstanceOf[js.Any])
    }
  }
}
