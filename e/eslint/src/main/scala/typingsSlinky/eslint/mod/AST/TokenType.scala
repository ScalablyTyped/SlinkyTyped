package typingsSlinky.eslint.mod.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eslint.eslintStrings.Boolean
  - typingsSlinky.eslint.eslintStrings.Null
  - typingsSlinky.eslint.eslintStrings.Identifier
  - typingsSlinky.eslint.eslintStrings.Keyword
  - typingsSlinky.eslint.eslintStrings.Punctuator
  - typingsSlinky.eslint.eslintStrings.JSXIdentifier
  - typingsSlinky.eslint.eslintStrings.JSXText
  - typingsSlinky.eslint.eslintStrings.Numeric
  - typingsSlinky.eslint.eslintStrings.String
  - typingsSlinky.eslint.eslintStrings.RegularExpression
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def Boolean: typingsSlinky.eslint.eslintStrings.Boolean = this.cast("Boolean")
  @scala.inline
  def Identifier: typingsSlinky.eslint.eslintStrings.Identifier = this.cast("Identifier")
  @scala.inline
  def JSXIdentifier: typingsSlinky.eslint.eslintStrings.JSXIdentifier = this.cast("JSXIdentifier")
  @scala.inline
  def JSXText: typingsSlinky.eslint.eslintStrings.JSXText = this.cast("JSXText")
  @scala.inline
  def Keyword: typingsSlinky.eslint.eslintStrings.Keyword = this.cast("Keyword")
  @scala.inline
  def Null: typingsSlinky.eslint.eslintStrings.Null = this.cast("Null")
  @scala.inline
  def Numeric: typingsSlinky.eslint.eslintStrings.Numeric = this.cast("Numeric")
  @scala.inline
  def Punctuator: typingsSlinky.eslint.eslintStrings.Punctuator = this.cast("Punctuator")
  @scala.inline
  def RegularExpression: typingsSlinky.eslint.eslintStrings.RegularExpression = this.cast("RegularExpression")
  @scala.inline
  def String: typingsSlinky.eslint.eslintStrings.String = this.cast("String")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

