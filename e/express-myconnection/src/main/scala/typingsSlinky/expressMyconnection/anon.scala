package typingsSlinky.expressMyconnection

import typingsSlinky.mysql.anon.ToSqlString
import typingsSlinky.mysql.mod.Connection
import typingsSlinky.mysql.mod.ConnectionConfig
import typingsSlinky.mysql.mod.Pool
import typingsSlinky.mysql.mod.PoolCluster
import typingsSlinky.mysql.mod.PoolClusterConfig
import typingsSlinky.mysql.mod.PoolConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofmysql extends StObject {
    
    def createConnection(connectionUri: String): Connection = js.native
    def createConnection(connectionUri: ConnectionConfig): Connection = js.native
    
    def createPool(config: String): Pool = js.native
    def createPool(config: PoolConfig): Pool = js.native
    
    def createPoolCluster(): PoolCluster = js.native
    def createPoolCluster(config: PoolClusterConfig): PoolCluster = js.native
    
    def escape(value: js.Any): String = js.native
    def escape(value: js.Any, stringifyObjects: js.UndefOr[scala.Nothing], timeZone: String): String = js.native
    def escape(value: js.Any, stringifyObjects: Boolean): String = js.native
    def escape(value: js.Any, stringifyObjects: Boolean, timeZone: String): String = js.native
    
    def escapeId(value: String): String = js.native
    def escapeId(value: String, forbidQualified: Boolean): String = js.native
    
    def format(sql: String, values: js.Array[_]): String = js.native
    def format(sql: String, values: js.Array[_], stringifyObjects: js.UndefOr[scala.Nothing], timeZone: String): String = js.native
    def format(sql: String, values: js.Array[_], stringifyObjects: Boolean): String = js.native
    def format(sql: String, values: js.Array[_], stringifyObjects: Boolean, timeZone: String): String = js.native
    
    def raw(sql: String): ToSqlString = js.native
  }
}
