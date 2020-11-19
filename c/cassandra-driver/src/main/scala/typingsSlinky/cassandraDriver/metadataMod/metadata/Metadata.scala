package typingsSlinky.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cassandraDriver.anon.Info
import typingsSlinky.cassandraDriver.anon.Name
import typingsSlinky.cassandraDriver.mod.EmptyCallback
import typingsSlinky.cassandraDriver.mod.Host
import typingsSlinky.cassandraDriver.mod.ValueCallback
import typingsSlinky.cassandraDriver.mod.token.Token
import typingsSlinky.cassandraDriver.mod.token.TokenRange
import typingsSlinky.cassandraDriver.typesMod.types.Uuid
import typingsSlinky.cassandraDriver.typesMod.types.consistencies
import typingsSlinky.node.Buffer
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends js.Object {
  
  def clearPrepared(): Unit = js.native
  
  def getAggregate(keyspaceName: String, name: String, signature: js.Array[Info | String]): js.Promise[Aggregate] = js.native
  def getAggregate(
    keyspaceName: String,
    name: String,
    signature: js.Array[Info | String],
    callback: ValueCallback[Aggregate]
  ): Unit = js.native
  
  def getAggregates(keyspaceName: String, name: String): js.Promise[js.Array[Aggregate]] = js.native
  def getAggregates(keyspaceName: String, name: String, callback: ValueCallback[js.Array[Aggregate]]): Unit = js.native
  
  def getFunction(keyspaceName: String, name: String, signature: js.Array[Info | String]): js.Promise[SchemaFunction] = js.native
  def getFunction(
    keyspaceName: String,
    name: String,
    signature: js.Array[Info | String],
    callback: ValueCallback[SchemaFunction]
  ): Unit = js.native
  
  def getFunctions(keyspaceName: String, name: String): js.Promise[js.Array[SchemaFunction]] = js.native
  def getFunctions(keyspaceName: String, name: String, callback: ValueCallback[js.Array[SchemaFunction]]): Unit = js.native
  
  def getMaterializedView(keyspaceName: String, name: String, callback: EmptyCallback): js.Promise[MaterializedView] = js.native
  def getMaterializedView(keyspaceName: String, name: String, callback: ValueCallback[MaterializedView]): Unit = js.native
  
  def getReplicas(keyspaceName: String, token: Token): js.Array[Host] = js.native
  def getReplicas(keyspaceName: String, token: TokenRange): js.Array[Host] = js.native
  def getReplicas(keyspaceName: String, token: Buffer): js.Array[Host] = js.native
  
  def getTable(keyspaceName: String, name: String): js.Promise[TableMetadata] = js.native
  def getTable(keyspaceName: String, name: String, callback: ValueCallback[TableMetadata]): Unit = js.native
  
  def getTokenRanges(): Set[TokenRange] = js.native
  
  def getTokenRangesForHost(keyspaceName: String, host: Host): Set[TokenRange] | Null = js.native
  
  def getTrace(traceId: Uuid): js.Promise[QueryTrace] = js.native
  def getTrace(traceId: Uuid, callback: ValueCallback[QueryTrace]): Unit = js.native
  def getTrace(traceId: Uuid, consistency: consistencies): js.Promise[QueryTrace] = js.native
  def getTrace(traceId: Uuid, consistency: consistencies, callback: ValueCallback[QueryTrace]): Unit = js.native
  
  def getUdt(keyspaceName: String, name: String): js.Promise[Udt] = js.native
  def getUdt(keyspaceName: String, name: String, callback: ValueCallback[Udt]): Unit = js.native
  
  var keyspaces: StringDictionary[Name] = js.native
  
  def newToken(components: String): Token = js.native
  def newToken(components: js.Array[Buffer]): Token = js.native
  def newToken(components: Buffer): Token = js.native
  
  def newTokenRange(start: Token, end: Token): TokenRange = js.native
  
  def refreshKeyspace(name: String): js.Promise[Unit] = js.native
  def refreshKeyspace(name: String, callback: EmptyCallback): Unit = js.native
  
  def refreshKeyspaces(): js.Promise[Unit] = js.native
  def refreshKeyspaces(callback: EmptyCallback): Unit = js.native
  def refreshKeyspaces(waitReconnect: Boolean): js.Promise[Unit] = js.native
  def refreshKeyspaces(waitReconnect: Boolean, callback: EmptyCallback): Unit = js.native
}
