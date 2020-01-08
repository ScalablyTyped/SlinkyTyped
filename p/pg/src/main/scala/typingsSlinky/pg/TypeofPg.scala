package typingsSlinky.pg

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.pg.pgMod.Client
import typingsSlinky.pg.pgMod.ClientBase
import typingsSlinky.pg.pgMod.ClientConfig
import typingsSlinky.pg.pgMod.Connection
import typingsSlinky.pg.pgMod.ConnectionConfig
import typingsSlinky.pg.pgMod.Defaults
import typingsSlinky.pg.pgMod.Events
import typingsSlinky.pg.pgMod.Pool
import typingsSlinky.pg.pgMod.PoolConfig
import typingsSlinky.pg.pgMod.Query
import typingsSlinky.pg.pgMod.QueryConfig
import typingsSlinky.pg.pgMod.QueryResultRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofPg extends js.Object {
  var Client: Instantiable1[js.UndefOr[String | ClientConfig], typingsSlinky.pg.pgMod.Client]
  var ClientBase: Instantiable1[js.UndefOr[String | ClientConfig], typingsSlinky.pg.pgMod.ClientBase]
  var Connection: Instantiable1[js.UndefOr[/* config */ ConnectionConfig], typingsSlinky.pg.pgMod.Connection]
  var Events: Instantiable0[typingsSlinky.pg.pgMod.Events]
  var Pool: Instantiable1[js.UndefOr[/* config */ PoolConfig], typingsSlinky.pg.pgMod.Pool]
  var Query: Instantiable2[
    js.UndefOr[
      String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
    ], 
    js.UndefOr[
      /* import warning: RewrittenClass.unapply cls was tparam I */ /* values */ js.Any
    ], 
    typingsSlinky.pg.pgMod.Query[QueryResultRow, js.Array[js.Any]]
  ]
  val defaults: Defaults with ClientConfig
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
    defaults: Defaults with ClientConfig,
    native: /* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any = null
  ): TypeofPg = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], ClientBase = ClientBase.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPg]
  }
}

