package typingsSlinky.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpellCheckerState extends js.Object

/**
  * Lists values specifying the spell checking state.
  */
@JSGlobal("SpellCheckerState")
@js.native
object SpellCheckerState extends js.Object {
  /**
    * Spell checking is disabled.
    */
  @js.native
  sealed trait Disabled extends SpellCheckerState
  
  /**
    * Spell checking is completed.
    */
  @js.native
  sealed trait Done extends SpellCheckerState
  
  /**
    * Spell checking is in progress.
    */
  @js.native
  sealed trait InProgress extends SpellCheckerState
  
  /* 0 */ val Disabled: typingsSlinky.devexpressDashWeb.SpellCheckerState.Disabled with Double = js.native
  /* 2 */ val Done: typingsSlinky.devexpressDashWeb.SpellCheckerState.Done with Double = js.native
  /* 1 */ val InProgress: typingsSlinky.devexpressDashWeb.SpellCheckerState.InProgress with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpellCheckerState with Double] = js.native
}

