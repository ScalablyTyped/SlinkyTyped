package typingsSlinky.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueState extends js.Object

/**
  * Marker for the correctness of the current value.
  */
@JSGlobal("sap.ui.core.ValueState")
@js.native
object ValueState extends js.Object {
  @js.native
  sealed trait Error extends ValueState
  
  @js.native
  sealed trait None extends ValueState
  
  @js.native
  sealed trait Success extends ValueState
  
  @js.native
  sealed trait Warning extends ValueState
  
  /* 0 */ val Error: typingsSlinky.openui5.sap.ui.core.ValueState.Error with Double = js.native
  /* 1 */ val None: typingsSlinky.openui5.sap.ui.core.ValueState.None with Double = js.native
  /* 2 */ val Success: typingsSlinky.openui5.sap.ui.core.ValueState.Success with Double = js.native
  /* 3 */ val Warning: typingsSlinky.openui5.sap.ui.core.ValueState.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueState with Double] = js.native
}

