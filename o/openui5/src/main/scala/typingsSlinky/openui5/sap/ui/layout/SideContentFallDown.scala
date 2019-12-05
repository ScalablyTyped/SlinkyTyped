package typingsSlinky.openui5.sap.ui.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SideContentFallDown extends js.Object

/**
  * Types of the DynamicSideContent FallDown options
  */
@JSGlobal("sap.ui.layout.SideContentFallDown")
@js.native
object SideContentFallDown extends js.Object {
  @js.native
  sealed trait BelowL extends SideContentFallDown
  
  @js.native
  sealed trait BelowM extends SideContentFallDown
  
  @js.native
  sealed trait BelowXL extends SideContentFallDown
  
  @js.native
  sealed trait OnMinimumWidth extends SideContentFallDown
  
  /* 0 */ val BelowL: typingsSlinky.openui5.sap.ui.layout.SideContentFallDown.BelowL with Double = js.native
  /* 1 */ val BelowM: typingsSlinky.openui5.sap.ui.layout.SideContentFallDown.BelowM with Double = js.native
  /* 2 */ val BelowXL: typingsSlinky.openui5.sap.ui.layout.SideContentFallDown.BelowXL with Double = js.native
  /* 3 */ val OnMinimumWidth: typingsSlinky.openui5.sap.ui.layout.SideContentFallDown.OnMinimumWidth with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SideContentFallDown with Double] = js.native
}

