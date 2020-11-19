package typingsSlinky.datastoreCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MountDatastore
  extends Datastore[js.Any] {
  
  var mounts: js.Array[Mount[_]] = js.native
}
@JSImport("datastore-core", "MountDatastore")
@js.native
object MountDatastore extends TopLevel[MountDatastoreConstructor]
