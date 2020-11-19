package typingsSlinky.datastoreCore.mod

import typingsSlinky.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("datastore-core", "TieredDatastore")
@js.native
class TieredDatastoreCls protected () extends TieredDatastore {
  def this(stores: js.Array[Datastore[_]]) = this()
}
