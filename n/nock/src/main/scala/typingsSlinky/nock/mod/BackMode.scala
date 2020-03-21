package typingsSlinky.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nock.nockStrings.wild
  - typingsSlinky.nock.nockStrings.dryrun
  - typingsSlinky.nock.nockStrings.record
  - typingsSlinky.nock.nockStrings.lockdown
*/
trait BackMode extends js.Object

object BackMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dryrun: typingsSlinky.nock.nockStrings.dryrun = this.cast("dryrun")
  @scala.inline
  def lockdown: typingsSlinky.nock.nockStrings.lockdown = this.cast("lockdown")
  @scala.inline
  def record: typingsSlinky.nock.nockStrings.record = this.cast("record")
  @scala.inline
  def wild: typingsSlinky.nock.nockStrings.wild = this.cast("wild")
}

