package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.AnonParams
import typingsSlinky.cassandraDriver.concurrentMod.concurrent.Options
import typingsSlinky.cassandraDriver.concurrentMod.concurrent.ResultSetGroup
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "concurrent")
@js.native
object concurrent extends js.Object {
  def executeConcurrent(client: Client, queries: js.Array[AnonParams]): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, queries: js.Array[AnonParams], options: Options): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[_]]): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[_]], options: Options): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: Readable, options: Options): js.Promise[ResultSetGroup] = js.native
}

