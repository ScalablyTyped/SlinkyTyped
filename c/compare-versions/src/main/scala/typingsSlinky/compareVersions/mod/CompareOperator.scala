package typingsSlinky.compareVersions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed arithmetic operators
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.compareVersions.compareVersionsStrings.Greaterthansign
  - typingsSlinky.compareVersions.compareVersionsStrings.GreaterthansignEqualssign
  - typingsSlinky.compareVersions.compareVersionsStrings.Equalssign
  - typingsSlinky.compareVersions.compareVersionsStrings.Lessthansign
  - typingsSlinky.compareVersions.compareVersionsStrings.LessthansignEqualssign
*/
trait CompareOperator extends js.Object

object CompareOperator {
  @scala.inline
  def Equalssign: typingsSlinky.compareVersions.compareVersionsStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typingsSlinky.compareVersions.compareVersionsStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsSlinky.compareVersions.compareVersionsStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsSlinky.compareVersions.compareVersionsStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsSlinky.compareVersions.compareVersionsStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

