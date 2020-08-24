package typingsSlinky.datastoreCore.mod

import typingsSlinky.interfaceDatastore.mod.Datastore
import typingsSlinky.interfaceDatastore.mod.Key
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "NamespaceDatastore")
@js.native
class NamespaceDatastoreCls protected () extends NamespaceDatastore[Buffer] {
  def this(child: Datastore[_], prefix: Key) = this()
}

