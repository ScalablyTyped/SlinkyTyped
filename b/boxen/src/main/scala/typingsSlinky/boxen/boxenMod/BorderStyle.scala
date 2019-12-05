package typingsSlinky.boxen.boxenMod

import typingsSlinky.boxen.boxenStrings.bold
import typingsSlinky.boxen.boxenStrings.classic
import typingsSlinky.boxen.boxenStrings.double
import typingsSlinky.boxen.boxenStrings.doubleSingle
import typingsSlinky.boxen.boxenStrings.round
import typingsSlinky.boxen.boxenStrings.single
import typingsSlinky.boxen.boxenStrings.singleDouble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.boxen.boxenStrings.single
  - typings.boxen.boxenStrings.double
  - typings.boxen.boxenStrings.round
  - typings.boxen.boxenStrings.bold
  - typings.boxen.boxenStrings.singleDouble
  - typings.boxen.boxenStrings.doubleSingle
  - typings.boxen.boxenStrings.classic
*/
trait BorderStyle extends js.Object

object BorderStyle {
  @scala.inline
  def Bold: bold = this.cast("bold")
  @scala.inline
  def Classic: classic = this.cast("classic")
  @scala.inline
  def Double: double = this.cast("double")
  @scala.inline
  def DoubleSingle: doubleSingle = this.cast("doubleSingle")
  @scala.inline
  def Round: round = this.cast("round")
  @scala.inline
  def Single: single = this.cast("single")
  @scala.inline
  def SingleDouble: singleDouble = this.cast("singleDouble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

