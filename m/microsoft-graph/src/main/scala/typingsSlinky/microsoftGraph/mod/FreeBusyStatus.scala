package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.free
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.tentative
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.busy
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.oof
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.workingElsewhere
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
*/
trait FreeBusyStatus extends js.Object

object FreeBusyStatus {
  @scala.inline
  def busy: typingsSlinky.microsoftGraph.microsoftGraphStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def free: typingsSlinky.microsoftGraph.microsoftGraphStrings.free = this.cast("free")
  @scala.inline
  def oof: typingsSlinky.microsoftGraph.microsoftGraphStrings.oof = this.cast("oof")
  @scala.inline
  def tentative: typingsSlinky.microsoftGraph.microsoftGraphStrings.tentative = this.cast("tentative")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def workingElsewhere: typingsSlinky.microsoftGraph.microsoftGraphStrings.workingElsewhere = this.cast("workingElsewhere")
}

