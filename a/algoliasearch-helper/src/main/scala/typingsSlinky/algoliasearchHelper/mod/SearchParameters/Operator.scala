package typingsSlinky.algoliasearchHelper.mod.SearchParameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.Equalssign
  - typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.Greaterthansign
  - typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.GreaterthansignEqualssign
  - typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.Lessthansign
  - typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.LessthansignEqualssign
  - typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.ExclamationmarkEqualssign
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def Equalssign: typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.Equalssign = this.cast("=")
  @scala.inline
  def ExclamationmarkEqualssign: typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def Greaterthansign: typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

