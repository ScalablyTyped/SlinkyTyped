package typingsSlinky.datastoreCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeytransformDatastore[Value] extends Datastore[Value] {
  
  var child: Datastore[Value] = js.native
  
  var transform: Transform = js.native
}
@JSImport("datastore-core", "KeytransformDatastore")
@js.native
object KeytransformDatastore extends TopLevel[KeytransformDatastoreConstructor]
