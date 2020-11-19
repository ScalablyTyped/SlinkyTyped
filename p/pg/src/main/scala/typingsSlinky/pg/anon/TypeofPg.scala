package typingsSlinky.pg.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.pg.mod.Client
import typingsSlinky.pg.mod.ClientBase
import typingsSlinky.pg.mod.ClientConfig
import typingsSlinky.pg.mod.Connection
import typingsSlinky.pg.mod.ConnectionConfig
import typingsSlinky.pg.mod.Defaults_
import typingsSlinky.pg.mod.Events
import typingsSlinky.pg.mod.Pool
import typingsSlinky.pg.mod.PoolConfig
import typingsSlinky.pg.mod.Query
import typingsSlinky.pg.mod.QueryConfig
import typingsSlinky.pg.mod.QueryResultRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPg extends js.Object {
  
  var Client: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], typingsSlinky.pg.mod.Client] = js.native
  
  var ClientBase: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], typingsSlinky.pg.mod.ClientBase] = js.native
  
  var Connection: Instantiable1[/* config */ js.UndefOr[ConnectionConfig], typingsSlinky.pg.mod.Connection] = js.native
  
  var Events: Instantiable0[typingsSlinky.pg.mod.Events] = js.native
  
  var Pool: Instantiable1[/* config */ js.UndefOr[PoolConfig], typingsSlinky.pg.mod.Pool] = js.native
  
  var Query: Instantiable2[
    /* queryTextOrConfig */ js.UndefOr[
      String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
    ], 
    /* values */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any], 
    typingsSlinky.pg.mod.Query[QueryResultRow, js.Array[js.Any]]
  ] = js.native
  
  val defaults: Defaults_ with ClientConfig = js.native
  
  val native: (/* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any) | Null = js.native
}
object TypeofPg {
  
  @scala.inline
  def apply(
    Client: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], Client],
    ClientBase: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], ClientBase],
    Connection: Instantiable1[/* config */ js.UndefOr[ConnectionConfig], Connection],
    Events: Instantiable0[Events],
    Pool: Instantiable1[/* config */ js.UndefOr[PoolConfig], Pool],
    Query: Instantiable2[
      /* queryTextOrConfig */ js.UndefOr[
        String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
      ], 
      /* values */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any], 
      Query[QueryResultRow, js.Array[js.Any]]
    ],
    defaults: Defaults_ with ClientConfig
  ): TypeofPg = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], ClientBase = ClientBase.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPg]
  }
  
  @scala.inline
  implicit class TypeofPgOps[Self <: TypeofPg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient(value: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], Client]): Self = this.set("Client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientBase(value: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], ClientBase]): Self = this.set("ClientBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: Instantiable1[/* config */ js.UndefOr[ConnectionConfig], Connection]): Self = this.set("Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: Instantiable0[Events]): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: Instantiable1[/* config */ js.UndefOr[PoolConfig], Pool]): Self = this.set("Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(
      value: Instantiable2[
          /* queryTextOrConfig */ js.UndefOr[
            String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
          ], 
          /* values */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any], 
          Query[QueryResultRow, js.Array[js.Any]]
        ]
    ): Self = this.set("Query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaults(value: Defaults_ with ClientConfig): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: /* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeNull: Self = this.set("native", null)
  }
}
