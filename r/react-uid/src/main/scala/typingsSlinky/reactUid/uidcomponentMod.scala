package typingsSlinky.reactUid

import typingsSlinky.react.mod.Component
import typingsSlinky.reactUid.anon.Id
import typingsSlinky.reactUid.contextMod.UIDProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-uid/dist/es5/UIDComponent", JSImport.Namespace)
@js.native
object uidcomponentMod extends js.Object {
  
  @js.native
  class UID ()
    extends Component[UIDProps, js.Object, js.Any] {
    
    @JSName("state")
    var state_UID: Id = js.native
    
    def uid(item: js.Any): String = js.native
  }
}
