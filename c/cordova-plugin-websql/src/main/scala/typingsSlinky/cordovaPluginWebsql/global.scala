package typingsSlinky.cordovaPluginWebsql

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class Database protected ()
    extends typingsSlinky.cordovaPluginWebsql.Database {
    /** Constructor for Database object */
    def this(
      name: String,
      version: String,
      displayname: String,
      size: Double,
      creationCallback: js.Function1[/* database */ typingsSlinky.cordovaPluginWebsql.Database, Unit]
    ) = this()
  }
  @js.native
  object Database
    extends /** Constructor for Database object */
  Instantiable5[
          /* name */ String, 
          /* version */ String, 
          /* displayname */ String, 
          /* size */ Double, 
          /* creationCallback */ js.Function1[/* database */ typingsSlinky.cordovaPluginWebsql.Database, Unit], 
          typingsSlinky.cordovaPluginWebsql.Database
        ]
  
  @js.native
  object SqlError extends js.Object {
    
    var CONSTRAINT_ERR: Double = js.native
    
    var DATABASE_ERR: Double = js.native
    
    var QUOTA_ERR: Double = js.native
    
    var SYNTAX_ERR: Double = js.native
    
    var TIMEOUT_ERR: Double = js.native
    
    var TOO_LARGE_ERR: Double = js.native
    
    // Error code constants from http://www.w3.org/TR/webdatabase/#sqlerror
    var UNKNOWN_ERR: Double = js.native
    
    var VERSION_ERR: Double = js.native
  }
  
  @js.native
  class SqlTransaction ()
    extends typingsSlinky.cordovaPluginWebsql.SqlTransaction
  @js.native
  object SqlTransaction
    extends Instantiable0[typingsSlinky.cordovaPluginWebsql.SqlTransaction]
}
