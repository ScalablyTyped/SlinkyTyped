package typingsSlinky.alloy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * The global Alloy module.
    */
  val Alloy: AlloyInterface = js.native
  /**
    * True if the current target platform is Android, false otherwise
    */
  val OS_ANDROID: Boolean = js.native
  /**
    * True if the current target platform is iOS, false otherwise
    */
  val OS_IOS: Boolean = js.native
  /**
    * The global Widget module.
    */
  val Widget: WidgetInterface = js.native
  /**
    * Shows an AlertDialog with the specified message.
    *
    * @param msg Message to show in the alert dialog
    */
  def alert(msg: String): Unit = js.native
}

