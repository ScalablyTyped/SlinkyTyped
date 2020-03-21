package typingsSlinky.oracleOraclejet.ojprogresslistMod.ProgressItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.queued
  - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadstarted
  - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.aborted
  - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.errored
  - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timedout
  - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loaded
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def aborted: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.aborted = this.cast("aborted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def errored: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.errored = this.cast("errored")
  @scala.inline
  def loaded: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loaded = this.cast("loaded")
  @scala.inline
  def loadstarted: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadstarted = this.cast("loadstarted")
  @scala.inline
  def queued: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.queued = this.cast("queued")
  @scala.inline
  def timedout: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timedout = this.cast("timedout")
}

