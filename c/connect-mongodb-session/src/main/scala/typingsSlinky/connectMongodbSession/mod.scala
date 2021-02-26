package typingsSlinky.connectMongodbSession

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.connectMongodbSession.mod.connectMongodbSession.MongoDBStore
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressSession.mod.SessionOptions
import typingsSlinky.expressSession.mod.Store
import typingsSlinky.mongodb.mod.MongoClient
import typingsSlinky.mongodb.mod.MongoClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-mongodb-session", JSImport.Namespace)
  @js.native
  def apply(
    fn: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[ParamsDictionary, _, _, Query]
    ]
  ): MongoDBStore = js.native
  
  object connectMongodbSession {
    
    @js.native
    trait ConnectionInfo extends StObject {
      
      var collection: String = js.native
      
      var connectionOptions: js.UndefOr[MongoClientOptions] = js.native
      
      var databaseName: js.UndefOr[String] = js.native
      
      var expires: js.UndefOr[Double] = js.native
      
      var idField: js.UndefOr[String] = js.native
      
      var uri: String = js.native
    }
    object ConnectionInfo {
      
      @scala.inline
      def apply(collection: String, uri: String): ConnectionInfo = {
        val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConnectionInfo]
      }
      
      @scala.inline
      implicit class ConnectionInfoMutableBuilder[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionOptions(value: MongoClientOptions): Self = StObject.set(x, "connectionOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionOptionsUndefined: Self = StObject.set(x, "connectionOptions", js.undefined)
        
        @scala.inline
        def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
        
        @scala.inline
        def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        @scala.inline
        def setIdField(value: String): Self = StObject.set(x, "idField", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdFieldUndefined: Self = StObject.set(x, "idField", js.undefined)
        
        @scala.inline
        def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait MongoDBStore
      extends Store
         with Instantiable0[MongoDBStore]
         with Instantiable1[/* connection */ ConnectionInfo, MongoDBStore]
         with Instantiable2[
              js.UndefOr[/* connection */ ConnectionInfo], 
              /* callback */ js.Function1[/* error */ js.Error, Unit], 
              MongoDBStore
            ] {
      
      var client: MongoClient = js.native
    }
  }
}
