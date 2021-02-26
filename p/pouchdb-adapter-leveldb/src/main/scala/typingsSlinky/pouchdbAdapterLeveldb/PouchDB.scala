package typingsSlinky.pouchdbAdapterLeveldb

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.pouchdbAdapterLeveldb.PouchDB.LevelDbAdapter.LevelDbAdapterConfiguration
import typingsSlinky.pouchdbAdapterLeveldb.pouchdbAdapterLeveldbStrings.leveldb
import typingsSlinky.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import typingsSlinky.pouchdbCore.PouchDB.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  object LevelDbAdapter {
    
    @js.native
    trait LevelDbAdapterConfiguration extends LocalDatabaseConfiguration {
      
      @JSName("adapter")
      var adapter_LevelDbAdapterConfiguration: leveldb = js.native
    }
    object LevelDbAdapterConfiguration {
      
      @scala.inline
      def apply(adapter: leveldb): LevelDbAdapterConfiguration = {
        val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
        __obj.asInstanceOf[LevelDbAdapterConfiguration]
      }
      
      @scala.inline
      implicit class LevelDbAdapterConfigurationMutableBuilder[Self <: LevelDbAdapterConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdapter(value: leveldb): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait Static
    extends Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ LevelDbAdapterConfiguration, 
          Database[js.Object]
        ]
}
