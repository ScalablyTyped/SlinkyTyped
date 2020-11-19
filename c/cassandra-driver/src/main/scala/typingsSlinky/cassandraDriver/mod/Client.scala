package typingsSlinky.cassandraDriver.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cassandraDriver.anon.Query
import typingsSlinky.cassandraDriver.datastaxMod.datastax.graph.GraphResultSet
import typingsSlinky.cassandraDriver.metadataMod.metadata.ClientState
import typingsSlinky.cassandraDriver.metadataMod.metadata.Metadata
import typingsSlinky.cassandraDriver.metricsMod.metrics.ClientMetrics
import typingsSlinky.cassandraDriver.typesMod.types.ResultSet
import typingsSlinky.cassandraDriver.typesMod.types.Row
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "Client")
@js.native
class Client protected () extends EventEmitter {
  def this(options: DseClientOptions) = this()
  
  def batch(queries: js.Array[String | Query]): js.Promise[ResultSet] = js.native
  def batch(queries: js.Array[String | Query], callback: ValueCallback[ResultSet]): Unit = js.native
  def batch(queries: js.Array[String | Query], options: QueryOptions): js.Promise[ResultSet] = js.native
  def batch(queries: js.Array[String | Query], options: QueryOptions, callback: ValueCallback[ResultSet]): Unit = js.native
  
  def connect(): js.Promise[Unit] = js.native
  def connect(callback: EmptyCallback): Unit = js.native
  
  def eachRow(
    query: String,
    params: ArrayOrObject,
    options: QueryOptions,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit]
  ): Unit = js.native
  def eachRow(
    query: String,
    params: ArrayOrObject,
    options: QueryOptions,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit],
    callback: ValueCallback[ResultSet]
  ): Unit = js.native
  def eachRow(
    query: String,
    params: ArrayOrObject,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit]
  ): Unit = js.native
  def eachRow(
    query: String,
    params: ArrayOrObject,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit],
    callback: ValueCallback[ResultSet]
  ): Unit = js.native
  def eachRow(query: String, rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit]): Unit = js.native
  
  def execute(query: String): js.Promise[ResultSet] = js.native
  def execute(query: String, callback: ValueCallback[ResultSet]): Unit = js.native
  def execute(query: String, params: js.UndefOr[ArrayOrObject], options: QueryOptions): js.Promise[ResultSet] = js.native
  def execute(query: String, params: ArrayOrObject): js.Promise[ResultSet] = js.native
  def execute(query: String, params: ArrayOrObject, callback: ValueCallback[ResultSet]): Unit = js.native
  def execute(query: String, params: ArrayOrObject, options: QueryOptions, callback: ValueCallback[ResultSet]): Unit = js.native
  
  def executeGraph(traversal: String): js.Promise[GraphResultSet] = js.native
  def executeGraph(traversal: String, callback: ValueCallback[GraphResultSet]): Unit = js.native
  def executeGraph(traversal: String, parameters: js.UndefOr[scala.Nothing], callback: ValueCallback[GraphResultSet]): Unit = js.native
  def executeGraph(traversal: String, parameters: js.UndefOr[scala.Nothing], options: GraphQueryOptions): js.Promise[GraphResultSet] = js.native
  def executeGraph(
    traversal: String,
    parameters: js.UndefOr[scala.Nothing],
    options: GraphQueryOptions,
    callback: ValueCallback[GraphResultSet]
  ): Unit = js.native
  def executeGraph(traversal: String, parameters: StringDictionary[js.Any]): js.Promise[GraphResultSet] = js.native
  def executeGraph(traversal: String, parameters: StringDictionary[js.Any], callback: ValueCallback[GraphResultSet]): Unit = js.native
  def executeGraph(traversal: String, parameters: StringDictionary[js.Any], options: GraphQueryOptions): js.Promise[GraphResultSet] = js.native
  def executeGraph(
    traversal: String,
    parameters: StringDictionary[js.Any],
    options: GraphQueryOptions,
    callback: ValueCallback[GraphResultSet]
  ): Unit = js.native
  
  def getReplicas(keyspace: String, token: Buffer): js.Array[Host] = js.native
  
  def getState(): ClientState = js.native
  
  var hosts: HostMap = js.native
  
  var keyspace: String = js.native
  
  var metadata: Metadata = js.native
  
  var metrics: ClientMetrics = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
  def shutdown(callback: EmptyCallback): Unit = js.native
  
  def stream(query: String): EventEmitter = js.native
  def stream(
    query: String,
    params: js.UndefOr[ArrayOrObject],
    options: js.UndefOr[scala.Nothing],
    callback: EmptyCallback
  ): EventEmitter = js.native
  def stream(query: String, params: js.UndefOr[ArrayOrObject], options: QueryOptions): EventEmitter = js.native
  def stream(query: String, params: js.UndefOr[ArrayOrObject], options: QueryOptions, callback: EmptyCallback): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject): EventEmitter = js.native
}
