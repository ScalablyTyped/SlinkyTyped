package typingsSlinky.rcTrigger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-trigger/es/Popup/useVisibleStatus", JSImport.Namespace)
@js.native
object useVisibleStatusMod extends js.Object {
  
  def default(visible: Boolean, doMeasure: Func): js.Tuple2[PopupStatus, js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.native
  
  trait _PopupStatus extends js.Object
  
  type Func = js.Function0[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsSlinky.rcTrigger.rcTriggerStrings.measure
    - typingsSlinky.rcTrigger.rcTriggerStrings.align
    - typingsSlinky.rcTrigger.rcTriggerStrings.aligned
    - typingsSlinky.rcTrigger.rcTriggerStrings.motion
    - typingsSlinky.rcTrigger.rcTriggerStrings.stable
  */
  type PopupStatus = _PopupStatus | Null
}
