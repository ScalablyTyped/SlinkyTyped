package typingsSlinky.datastoreCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.datastoreCore.mod.shard.Shard
import typingsSlinky.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShardingDatastore[Value] extends Datastore[Value] {
  
  var child: KeytransformDatastore[Value] = js.native
  
  var shard: Shard = js.native
}
@JSImport("datastore-core", "ShardingDatastore")
@js.native
object ShardingDatastore extends TopLevel[ShardingDatastoreConstructor]
