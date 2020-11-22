package typingsSlinky.datastoreCore.mod

import typingsSlinky.interfaceDatastore.mod.Adapter
import typingsSlinky.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("datastore-core", "NamespaceDatastore")
@js.native
class NamespaceDatastore[Value] protected () extends KeytransformDatastore[Value] {
  def this(child: Adapter[Value], prefix: Key) = this()
  
  var prefix: Key = js.native
}
