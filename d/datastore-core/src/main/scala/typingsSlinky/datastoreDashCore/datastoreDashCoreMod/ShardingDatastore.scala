package typingsSlinky.datastoreDashCore.datastoreDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.datastoreDashCore.datastoreDashCoreMod.shard.Shard
import typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShardingDatastore[Value] extends Datastore[Value] {
  var child: KeytransformDatastore[Value]
  var shard: Shard
}

@JSImport("datastore-core", "ShardingDatastore")
@js.native
object ShardingDatastore extends TopLevel[ShardingDatastoreConstructor]

