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

trait TypeofPg extends js.Object {
  var Client: Instantiable1[js.UndefOr[String | ClientConfig], typingsSlinky.pg.mod.Client]
  var ClientBase: Instantiable1[js.UndefOr[String | ClientConfig], typingsSlinky.pg.mod.ClientBase]
  var Connection: Instantiable1[js.UndefOr[/* config */ ConnectionConfig], typingsSlinky.pg.mod.Connection]
  var Events: Instantiable0[typingsSlinky.pg.mod.Events]
  var Pool: Instantiable1[js.UndefOr[/* config */ PoolConfig], typingsSlinky.pg.mod.Pool]
  var Query: Instantiable2[
    js.UndefOr[
      String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
    ], 
    js.UndefOr[
      /* import warning: RewrittenClass.unapply cls was tparam I */ /* values */ js.Any
    ], 
    typingsSlinky.pg.mod.Query[QueryResultRow, js.Array[js.Any]]
  ]
  val defaults: Defaults_ with ClientConfig
  val native: (/* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any) | Null
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
    defaults: Defaults_ with ClientConfig,
    native: /* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any = null
  ): TypeofPg = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], ClientBase = ClientBase.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPg]
  }
}

