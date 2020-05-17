package typingsSlinky.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies whether to select (highlight) the location to navigate to (when using the {@link Office.Document | Document}.goToByIdAsync method).
  */
@JSGlobal("Office.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  /* 0 */ val Default: typingsSlinky.officeJs.Office.SelectionMode.Default with Double = js.native
  /* 2 */ val None: typingsSlinky.officeJs.Office.SelectionMode.None with Double = js.native
  /* 1 */ val Selected: typingsSlinky.officeJs.Office.SelectionMode.Selected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.officeJs.Office.SelectionMode with Double] = js.native
}

