package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.free
  - typings.microsoftDashGraph.microsoftDashGraphStrings.tentative
  - typings.microsoftDashGraph.microsoftDashGraphStrings.busy
  - typings.microsoftDashGraph.microsoftDashGraphStrings.oof
  - typings.microsoftDashGraph.microsoftDashGraphStrings.workingElsewhere
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
*/
trait FreeBusyStatus extends js.Object

object FreeBusyStatus {
  @scala.inline
  def busy: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def free: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.free = this.cast("free")
  @scala.inline
  def oof: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.oof = this.cast("oof")
  @scala.inline
  def tentative: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.tentative = this.cast("tentative")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def workingElsewhere: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.workingElsewhere = this.cast("workingElsewhere")
}

