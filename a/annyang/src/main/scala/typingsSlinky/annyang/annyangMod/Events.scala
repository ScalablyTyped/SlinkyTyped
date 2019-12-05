package typingsSlinky.annyang.annyangMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.annyang.annyangStrings.start
  - typings.annyang.annyangStrings.soundstart
  - typings.annyang.annyangStrings.error
  - typings.annyang.annyangStrings.end
  - typings.annyang.annyangStrings.result
  - typings.annyang.annyangStrings.resultMatch
  - typings.annyang.annyangStrings.resultNoMatch
  - typings.annyang.annyangStrings.errorNetwork
  - typings.annyang.annyangStrings.errorPermissionBlocked
  - typings.annyang.annyangStrings.errorPermissionDenied
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

