package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains spell checking related settings.
  */
@JSGlobal("SpellingInfo")
@js.native
class SpellingInfo ()
  extends typingsSlinky.devexpressWeb.SpellingInfo {
  /**
    * Provides access to an array containing misspelled intervals.
    */
  /* CompleteClass */
  override val misspelledIntervals: js.Array[typingsSlinky.devexpressWeb.MisspelledInterval] = js.native
  /**
    * Gets a value specifying the spell checking state.
    */
  /* CompleteClass */
  override val spellCheckerState: typingsSlinky.devexpressWeb.SpellCheckerState = js.native
}

