package typingsSlinky.pg

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
import scala.scalajs.js.annotation._

@js.native
trait TypeofPg extends js.Object {
  var Client: Instantiable1[js.UndefOr[String | ClientConfig], typingsSlinky.pg.mod.Client] = js.native
  var ClientBase: Instantiable1[js.UndefOr[String | ClientConfig], typingsSlinky.pg.mod.ClientBase] = js.native
  var Connection: Instantiable1[js.UndefOr[/* config */ ConnectionConfig], typingsSlinky.pg.mod.Connection] = js.native
  var Events: Instantiable0[typingsSlinky.pg.mod.Events] = js.native
  var Pool: Instantiable1[js.UndefOr[/* config */ PoolConfig], typingsSlinky.pg.mod.Pool] = js.native
  var Query: Instantiable2[
    js.UndefOr[
      String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
    ], 
    js.UndefOr[
      /* import warning: RewrittenClass.unapply cls was tparam I */ /* values */ js.Any
    ], 
    typingsSlinky.pg.mod.Query[QueryResultRow, js.Array[js.Any]]
  ] = js.native
  val defaults: Defaults_ with ClientConfig = js.native
  val native: (/* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any) | Null = js.native
}

object TypeofPg {
  @scala.inline
  def apply(
    Client: Instantiable1[js.UndefOr[String | ClientConfig], Client],
    ClientBase: Instantiable1[js.UndefOr[String | ClientConfig], ClientBase],
    Connection: Instantiable1[js.UndefOr[/* config */ ConnectionConfig], Connection],
    Events: Instantiable0[Events],
    Pool: Instantiable1[js.UndefOr[/* config */ PoolConfig], Pool],
    Query: Instantiable2[
      js.UndefOr[
        String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
      ], 
      js.UndefOr[
        /* import warning: RewrittenClass.unapply cls was tparam I */ /* values */ js.Any
      ], 
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
    def withClient(value: Instantiable1[js.UndefOr[String | ClientConfig], Client]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientBase(value: Instantiable1[js.UndefOr[String | ClientConfig], ClientBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: Instantiable1[js.UndefOr[/* config */ ConnectionConfig], Connection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: Instantiable0[Events]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPool(value: Instantiable1[js.UndefOr[/* config */ PoolConfig], Pool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(
      value: Instantiable2[
          js.UndefOr[
            String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
          ], 
          js.UndefOr[
            /* import warning: RewrittenClass.unapply cls was tparam I */ /* values */ js.Any
          ], 
          Query[QueryResultRow, js.Array[js.Any]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaults(value: Defaults_ with ClientConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNative(value: /* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(null)
        ret
    }
  }
  
}

