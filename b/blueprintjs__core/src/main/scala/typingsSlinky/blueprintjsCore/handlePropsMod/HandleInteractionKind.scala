package typingsSlinky.blueprintjsCore.handlePropsMod

import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.lock
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.none
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  LOCK :'lock',   PUSH :'push',   NONE :'none'}[keyof {  LOCK :'lock',   PUSH :'push',   NONE :'none'}] */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.lock
  - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.push
  - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.none
*/
trait HandleInteractionKind extends js.Object
@JSImport("@blueprintjs/core/lib/esm/components/slider/handleProps", "HandleInteractionKind")
@js.native
object HandleInteractionKind extends js.Object {
  
  /** Locked handles prevent other handles from being dragged past then. */
  var LOCK: lock = js.native
  
  /**
    * Handles marked "none" are not interactive and do not appear in the UI.
    * They serve only to break the track into subsections that can be colored separately.
    */
  var NONE: none = js.native
  
  /** Push handles move overlapping handles with them as they are dragged. */
  var PUSH: push = js.native
}
