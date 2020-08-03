package typingsSlinky.rcTrigger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popupMod {
  /**
    * Popup should follow the steps for each component work correctly:
    * measure - check for the current stretch size
    * align - let component align the position
    * aligned - re-align again in case additional className changed the size
    * afterAlign - choice next step is trigger motion or finished
    * beforeMotion - should reset motion to invisible so that CSSMotion can do normal motion
    * motion - play the motion
    * stable - everything is done
    */
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsSlinky.rcTrigger.rcTriggerStrings.measure
    - typingsSlinky.rcTrigger.rcTriggerStrings.align
    - typingsSlinky.rcTrigger.rcTriggerStrings.aligned
    - typingsSlinky.rcTrigger.rcTriggerStrings.afterAlign
    - typingsSlinky.rcTrigger.rcTriggerStrings.beforeMotion
    - typingsSlinky.rcTrigger.rcTriggerStrings.motion
    - typingsSlinky.rcTrigger.rcTriggerStrings.AfterMotion
    - typingsSlinky.rcTrigger.rcTriggerStrings.stable
  */
  type PopupStatus = typingsSlinky.rcTrigger.popupMod._PopupStatus | scala.Null
}
