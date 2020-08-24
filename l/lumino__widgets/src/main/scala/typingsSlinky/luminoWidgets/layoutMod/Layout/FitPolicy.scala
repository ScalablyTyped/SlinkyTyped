package typingsSlinky.luminoWidgets.layoutMod.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the layout fit policy.
  *
  * #### Notes
  * The fit policy controls the computed size constraints which are
  * applied to the parent widget by the layout.
  *
  * Some layout implementations may ignore the fit policy.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`set-no-constraint`
  - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`set-min-size`
*/
trait FitPolicy extends js.Object

object FitPolicy {
  @scala.inline
  def `set-min-size`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`set-min-size` = "set-min-size".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`set-min-size`]
  @scala.inline
  def `set-no-constraint`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`set-no-constraint` = "set-no-constraint".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`set-no-constraint`]
}

