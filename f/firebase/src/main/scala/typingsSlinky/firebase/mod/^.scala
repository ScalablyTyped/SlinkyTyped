package typingsSlinky.firebase.mod

import typingsSlinky.firebase.mod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * The current SDK version.
    */
  var SDK_VERSION: String = js.native
  
  /**
    * A (read-only) array of all initialized apps.
    */
  var apps: js.Array[App] = js.native
}
