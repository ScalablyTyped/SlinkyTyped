package typingsSlinky.datastoreCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeytransformDatastore[Value] extends Datastore[Value] {
  var child: Datastore[Value]
  var transform: Transform
}

@JSImport("datastore-core", "KeytransformDatastore")
@js.native
object KeytransformDatastore extends TopLevel[KeytransformDatastoreConstructor]

