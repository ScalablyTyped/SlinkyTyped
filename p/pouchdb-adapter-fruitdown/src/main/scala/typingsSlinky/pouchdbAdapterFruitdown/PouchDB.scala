package typingsSlinky.pouchdbAdapterFruitdown

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.pouchdbAdapterFruitdown.PouchDB.FruitDOWNAdapter.FruitDOWNAdapterConfiguration
import typingsSlinky.pouchdbAdapterFruitdown.pouchdbAdapterFruitdownStrings.fruitdown
import typingsSlinky.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import typingsSlinky.pouchdbCore.PouchDB.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  object FruitDOWNAdapter {
    
    @js.native
    trait FruitDOWNAdapterConfiguration extends LocalDatabaseConfiguration {
      
      @JSName("adapter")
      var adapter_FruitDOWNAdapterConfiguration: fruitdown = js.native
    }
    object FruitDOWNAdapterConfiguration {
      
      @scala.inline
      def apply(adapter: fruitdown): FruitDOWNAdapterConfiguration = {
        val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
        __obj.asInstanceOf[FruitDOWNAdapterConfiguration]
      }
      
      @scala.inline
      implicit class FruitDOWNAdapterConfigurationMutableBuilder[Self <: FruitDOWNAdapterConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdapter(value: fruitdown): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait Static
    extends Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ FruitDOWNAdapterConfiguration, 
          Database[js.Object]
        ]
}
