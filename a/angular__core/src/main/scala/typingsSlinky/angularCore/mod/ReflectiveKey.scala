package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "ReflectiveKey")
@js.native
class ReflectiveKey protected () extends StObject {
  /**
    * Private
    */
  def this(token: js.Object, id: Double) = this()
  
  val displayName: String = js.native
  
  var id: Double = js.native
  
  var token: js.Object = js.native
}
/* static members */
object ReflectiveKey {
  
  /**
    * Retrieves a `Key` for a token.
    */
  @JSImport("@angular/core", "ReflectiveKey.get")
  @js.native
  def get(token: js.Object): ReflectiveKey = js.native
}
