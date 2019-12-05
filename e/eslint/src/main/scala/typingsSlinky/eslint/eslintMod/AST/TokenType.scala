package typingsSlinky.eslint.eslintMod.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.eslintStrings.Boolean
  - typings.eslint.eslintStrings.Null
  - typings.eslint.eslintStrings.Identifier
  - typings.eslint.eslintStrings.Keyword
  - typings.eslint.eslintStrings.Punctuator
  - typings.eslint.eslintStrings.JSXIdentifier
  - typings.eslint.eslintStrings.JSXText
  - typings.eslint.eslintStrings.Numeric
  - typings.eslint.eslintStrings.String
  - typings.eslint.eslintStrings.RegularExpression
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

