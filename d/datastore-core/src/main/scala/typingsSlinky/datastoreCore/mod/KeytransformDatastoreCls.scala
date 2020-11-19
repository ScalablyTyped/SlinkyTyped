package typingsSlinky.datastoreCore.mod

import typingsSlinky.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("datastore-core", "KeytransformDatastore")
@js.native
class KeytransformDatastoreCls[Value] protected () extends KeytransformDatastore[Value] {
  def this(child: Datastore[Value], transform: Transform) = this()
}
