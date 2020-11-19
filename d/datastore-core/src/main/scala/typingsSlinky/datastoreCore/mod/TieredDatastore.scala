package typingsSlinky.datastoreCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TieredDatastore
  extends Datastore[js.Any] {
  
  var stores: js.Array[Datastore[_]] = js.native
}
@JSImport("datastore-core", "TieredDatastore")
@js.native
object TieredDatastore extends TopLevel[TieredDatastoreConstructor]
