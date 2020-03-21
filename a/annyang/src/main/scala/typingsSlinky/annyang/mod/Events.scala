package typingsSlinky.annyang.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.annyang.annyangStrings.start
  - typingsSlinky.annyang.annyangStrings.soundstart
  - typingsSlinky.annyang.annyangStrings.error
  - typingsSlinky.annyang.annyangStrings.end
  - typingsSlinky.annyang.annyangStrings.result
  - typingsSlinky.annyang.annyangStrings.resultMatch
  - typingsSlinky.annyang.annyangStrings.resultNoMatch
  - typingsSlinky.annyang.annyangStrings.errorNetwork
  - typingsSlinky.annyang.annyangStrings.errorPermissionBlocked
  - typingsSlinky.annyang.annyangStrings.errorPermissionDenied
*/
trait Events extends js.Object

object Events {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typingsSlinky.annyang.annyangStrings.end = this.cast("end")
  @scala.inline
  def error: typingsSlinky.annyang.annyangStrings.error = this.cast("error")
  @scala.inline
  def errorNetwork: typingsSlinky.annyang.annyangStrings.errorNetwork = this.cast("errorNetwork")
  @scala.inline
  def errorPermissionBlocked: typingsSlinky.annyang.annyangStrings.errorPermissionBlocked = this.cast("errorPermissionBlocked")
  @scala.inline
  def errorPermissionDenied: typingsSlinky.annyang.annyangStrings.errorPermissionDenied = this.cast("errorPermissionDenied")
  @scala.inline
  def result: typingsSlinky.annyang.annyangStrings.result = this.cast("result")
  @scala.inline
  def resultMatch: typingsSlinky.annyang.annyangStrings.resultMatch = this.cast("resultMatch")
  @scala.inline
  def resultNoMatch: typingsSlinky.annyang.annyangStrings.resultNoMatch = this.cast("resultNoMatch")
  @scala.inline
  def soundstart: typingsSlinky.annyang.annyangStrings.soundstart = this.cast("soundstart")
  @scala.inline
  def start: typingsSlinky.annyang.annyangStrings.start = this.cast("start")
}

