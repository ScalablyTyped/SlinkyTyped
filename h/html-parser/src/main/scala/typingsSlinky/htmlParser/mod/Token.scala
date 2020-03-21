package typingsSlinky.htmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.htmlParser.htmlParserStrings.Greaterthansign
  - typingsSlinky.htmlParser.htmlParserStrings.SlashGreaterthansign
  - typingsSlinky.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign
*/
trait Token extends js.Object

object Token {
  @scala.inline
  def Greaterthansign: typingsSlinky.htmlParser.htmlParserStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def QuestionmarkGreaterthansign: typingsSlinky.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign = this.cast("?>")
  @scala.inline
  def SlashGreaterthansign: typingsSlinky.htmlParser.htmlParserStrings.SlashGreaterthansign = this.cast("/>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

