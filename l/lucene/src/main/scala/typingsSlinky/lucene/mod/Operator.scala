package typingsSlinky.lucene.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lucene.luceneStrings.LessthansignimplicitGreaterthansign
  - typingsSlinky.lucene.luceneStrings.NOT
  - typingsSlinky.lucene.luceneStrings.OR
  - typingsSlinky.lucene.luceneStrings.AND
  - typingsSlinky.lucene.luceneStrings.`AND NOT`
  - typingsSlinky.lucene.luceneStrings.`OR NOT`
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def AND: typingsSlinky.lucene.luceneStrings.AND = this.cast("AND")
  @scala.inline
  def `AND NOT`: typingsSlinky.lucene.luceneStrings.`AND NOT` = this.cast("AND NOT")
  @scala.inline
  def LessthansignimplicitGreaterthansign: typingsSlinky.lucene.luceneStrings.LessthansignimplicitGreaterthansign = this.cast("<implicit>")
  @scala.inline
  def NOT: typingsSlinky.lucene.luceneStrings.NOT = this.cast("NOT")
  @scala.inline
  def OR: typingsSlinky.lucene.luceneStrings.OR = this.cast("OR")
  @scala.inline
  def `OR NOT`: typingsSlinky.lucene.luceneStrings.`OR NOT` = this.cast("OR NOT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

