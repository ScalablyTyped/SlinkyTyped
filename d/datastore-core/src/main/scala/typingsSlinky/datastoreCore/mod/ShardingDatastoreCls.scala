package typingsSlinky.datastoreCore.mod

import typingsSlinky.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("datastore-core", "ShardingDatastore")
@js.native
class ShardingDatastoreCls[Value] protected () extends ShardingDatastore[Value] {
  def this(stores: js.Array[Datastore[Value]]) = this()
}
