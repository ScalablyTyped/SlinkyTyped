package typingsSlinky.estree.mod

import typingsSlinky.estree.estreeStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.estreeStrings.`-_`
  - typingsSlinky.estree.estreeStrings.Plussign
  - typingsSlinky.estree.estreeStrings.Exclamationmark
  - typingsSlinky.estree.estreeStrings.Tilde
  - typingsSlinky.estree.estreeStrings.typeof
  - typingsSlinky.estree.estreeStrings.void
  - typingsSlinky.estree.estreeStrings.delete
*/
trait UnaryOperator extends js.Object

object UnaryOperator {
  @scala.inline
  def Exclamationmark: typingsSlinky.estree.estreeStrings.Exclamationmark = this.cast("!")
  @scala.inline
  def Plussign: typingsSlinky.estree.estreeStrings.Plussign = this.cast("+")
  @scala.inline
  def Tilde: typingsSlinky.estree.estreeStrings.Tilde = this.cast("~")
  @scala.inline
  def _dash: `-_` = this.cast("-")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsSlinky.estree.estreeStrings.delete = this.cast("delete")
  @scala.inline
  def typeof: typingsSlinky.estree.estreeStrings.typeof = this.cast("typeof")
  @scala.inline
  def void: typingsSlinky.estree.estreeStrings.void = this.cast("void")
}

