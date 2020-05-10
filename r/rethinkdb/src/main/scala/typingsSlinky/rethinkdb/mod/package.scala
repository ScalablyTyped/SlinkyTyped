package typingsSlinky.rethinkdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExpressionFunction[U] = js.Function1[
    /* doc */ typingsSlinky.rethinkdb.mod.Expression[js.Any], 
    typingsSlinky.rethinkdb.mod.Expression[U]
  ]
  type IndexFunction[U] = typingsSlinky.rethinkdb.mod.Expression[U] | js.Array[typingsSlinky.rethinkdb.mod.Expression[U]] | (js.Function1[
    /* doc */ typingsSlinky.rethinkdb.mod.Expression[js.Any], 
    typingsSlinky.rethinkdb.mod.Expression[U] | js.Array[typingsSlinky.rethinkdb.mod.Expression[U]]
  ])
  type JoinFunction[U] = js.Function2[
    /* left */ typingsSlinky.rethinkdb.mod.Expression[js.Any], 
    /* right */ typingsSlinky.rethinkdb.mod.Expression[js.Any], 
    typingsSlinky.rethinkdb.mod.Expression[U]
  ]
  type Polygon_ = typingsSlinky.rethinkdb.mod.Geometry
  type ReduceFunction[U] = js.Function2[
    /* acc */ typingsSlinky.rethinkdb.mod.Expression[js.Any], 
    /* val */ typingsSlinky.rethinkdb.mod.Expression[js.Any], 
    typingsSlinky.rethinkdb.mod.Expression[U]
  ]
  /**
    * An error has occurred within the driver. This may be a driver bug, or it may
    * be an unfulfillable command, such as an unserializable query.
    *
    * See https://www.rethinkdb.com/docs/error-types/
    */
  type ReqlDriverError = js.Error
  type ReqlError = js.Error
}
