package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.danger
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.none
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.primary
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.success
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/intent", JSImport.Namespace)
@js.native
object intentMod extends js.Object {
  /* Inlined {  NONE  :'none',   PRIMARY  :'primary',   SUCCESS  :'success',   WARNING  :'warning',   DANGER  :'danger'}[keyof {  NONE  :'none',   PRIMARY  :'primary',   SUCCESS  :'success',   WARNING  :'warning',   DANGER  :'danger'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.warning
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.none
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.danger
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.primary
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.success
  */
  trait Intent extends js.Object
  
  @js.native
  object Intent extends js.Object {
    var DANGER: danger = js.native
    var NONE: none = js.native
    var PRIMARY: primary = js.native
    var SUCCESS: success = js.native
    var WARNING: warning = js.native
  }
  
}

