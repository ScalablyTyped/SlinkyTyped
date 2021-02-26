package typingsSlinky.rethinkdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  def asc(property: java.lang.String): typingsSlinky.rethinkdb.mod.Sort = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("asc")(property.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Sort]
  
  @scala.inline
  def avg(prop: java.lang.String): typingsSlinky.rethinkdb.mod.Aggregator = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("avg")(prop.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Aggregator]
  
  @scala.inline
  def branch(
    test: typingsSlinky.rethinkdb.mod.Expression[scala.Boolean],
    trueBranch: typingsSlinky.rethinkdb.mod.Expression[_],
    falseBranch: typingsSlinky.rethinkdb.mod.Expression[_]
  ): typingsSlinky.rethinkdb.mod.Expression[_] = (typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("branch")(test.asInstanceOf[js.Any], trueBranch.asInstanceOf[js.Any], falseBranch.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.rethinkdb.mod.Expression[_]]
  
  @scala.inline
  def circle(point: typingsSlinky.rethinkdb.mod.Point_, radius: scala.Double): typingsSlinky.rethinkdb.mod.Geometry = (typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(point.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.rethinkdb.mod.Geometry]
  @scala.inline
  def circle(
    point: typingsSlinky.rethinkdb.mod.Point_,
    radius: scala.Double,
    options: typingsSlinky.rethinkdb.mod.CircleOptions
  ): typingsSlinky.rethinkdb.mod.Geometry = (typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(point.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.rethinkdb.mod.Geometry]
  
  @scala.inline
  def connect(host: java.lang.String): js.Promise[typingsSlinky.rethinkdb.mod.Connection] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(host.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.rethinkdb.mod.Connection]]
  @scala.inline
  def connect(
    host: java.lang.String,
    cb: js.Function2[js.Error, /* conn */ typingsSlinky.rethinkdb.mod.Connection, scala.Unit]
  ): scala.Unit = (typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(host.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def connect(opts: typingsSlinky.rethinkdb.mod.ConnectionOptions): js.Promise[typingsSlinky.rethinkdb.mod.Connection] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.rethinkdb.mod.Connection]]
  @scala.inline
  def connect(
    opts: typingsSlinky.rethinkdb.mod.ConnectionOptions,
    cb: js.Function2[js.Error, /* conn */ typingsSlinky.rethinkdb.mod.Connection, scala.Unit]
  ): scala.Unit = (typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def count: typingsSlinky.rethinkdb.mod.Aggregator = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].selectDynamic("count").asInstanceOf[typingsSlinky.rethinkdb.mod.Aggregator]
  @scala.inline
  def count_=(x: typingsSlinky.rethinkdb.mod.Aggregator): scala.Unit = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def db(name: java.lang.String): typingsSlinky.rethinkdb.mod.Db_ = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("db")(name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Db_]
  
  @scala.inline
  def dbCreate(name: java.lang.String): typingsSlinky.rethinkdb.mod.Operation[typingsSlinky.rethinkdb.mod.CreateResult] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dbCreate")(name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Operation[typingsSlinky.rethinkdb.mod.CreateResult]]
  
  @scala.inline
  def dbDrop(name: java.lang.String): typingsSlinky.rethinkdb.mod.Operation[typingsSlinky.rethinkdb.mod.DropResult] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dbDrop")(name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Operation[typingsSlinky.rethinkdb.mod.DropResult]]
  
  @scala.inline
  def dbList(): typingsSlinky.rethinkdb.mod.Operation[js.Array[java.lang.String]] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dbList")().asInstanceOf[typingsSlinky.rethinkdb.mod.Operation[js.Array[java.lang.String]]]
  
  @scala.inline
  def desc(property: java.lang.String): typingsSlinky.rethinkdb.mod.Sort = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("desc")(property.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Sort]
  
  @scala.inline
  def epochTime(): typingsSlinky.rethinkdb.mod.Expression[typingsSlinky.rethinkdb.mod.Time] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("epochTime")().asInstanceOf[typingsSlinky.rethinkdb.mod.Expression[typingsSlinky.rethinkdb.mod.Time]]
  
  @scala.inline
  def expr(stuff: js.Any): typingsSlinky.rethinkdb.mod.Expression[_] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("expr")(stuff.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Expression[_]]
  
  @scala.inline
  def js_(jsString: java.lang.String): typingsSlinky.rethinkdb.mod.Operation[_] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("js")(jsString.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Operation[_]]
  @scala.inline
  def js_(jsString: java.lang.String, opts: typingsSlinky.rethinkdb.anon.Timeout): typingsSlinky.rethinkdb.mod.Operation[_] = (typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("js")(jsString.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.rethinkdb.mod.Operation[_]]
  
  @scala.inline
  def now(): typingsSlinky.rethinkdb.mod.Expression[typingsSlinky.rethinkdb.mod.Time] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsSlinky.rethinkdb.mod.Expression[typingsSlinky.rethinkdb.mod.Time]]
  
  @scala.inline
  def point(lng: scala.Double, lat: scala.Double): typingsSlinky.rethinkdb.mod.Point_ = (typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(lng.asInstanceOf[js.Any], lat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.rethinkdb.mod.Point_]
  
  @scala.inline
  def polygon(point: typingsSlinky.rethinkdb.mod.Point_ *): typingsSlinky.rethinkdb.mod.Polygon_ = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(point.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Polygon_]
  
  @scala.inline
  def row: typingsSlinky.rethinkdb.mod.Row_ = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].selectDynamic("row").asInstanceOf[typingsSlinky.rethinkdb.mod.Row_]
  
  @scala.inline
  def sum(prop: java.lang.String): typingsSlinky.rethinkdb.mod.Aggregator = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sum")(prop.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Aggregator]
  
  @scala.inline
  def table(name: java.lang.String): typingsSlinky.rethinkdb.mod.Table_ = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("table")(name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Table_]
  @scala.inline
  def table(name: java.lang.String, options: typingsSlinky.rethinkdb.anon.UseOutdated): typingsSlinky.rethinkdb.mod.Table_ = (typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("table")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.rethinkdb.mod.Table_]
  
  @scala.inline
  def uuid(): typingsSlinky.rethinkdb.mod.Operation[java.lang.String] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[typingsSlinky.rethinkdb.mod.Operation[java.lang.String]]
  @scala.inline
  def uuid(input: java.lang.String): typingsSlinky.rethinkdb.mod.Operation[java.lang.String] = typingsSlinky.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uuid")(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rethinkdb.mod.Operation[java.lang.String]]
}
