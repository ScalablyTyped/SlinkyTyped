package typingsSlinky.firebaseRemoteConfig

import typingsSlinky.firebaseRemoteConfigTypes.mod.ValueSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/remote-config/dist/src/value", JSImport.Namespace)
@js.native
object valueMod extends js.Object {
  
  @js.native
  class Value protected ()
    extends typingsSlinky.firebaseRemoteConfigTypes.mod.Value {
    def this(_source: ValueSource) = this()
    def this(_source: ValueSource, _value: String) = this()
    
    val _source: js.Any = js.native
    
    val _value: js.Any = js.native
  }
}
