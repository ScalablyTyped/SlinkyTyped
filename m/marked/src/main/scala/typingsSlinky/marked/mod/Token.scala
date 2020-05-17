package typingsSlinky.marked.mod

import typingsSlinky.marked.mod.Tokens.BlockquoteEnd
import typingsSlinky.marked.mod.Tokens.BlockquoteStart
import typingsSlinky.marked.mod.Tokens.Code
import typingsSlinky.marked.mod.Tokens.HTML
import typingsSlinky.marked.mod.Tokens.Heading
import typingsSlinky.marked.mod.Tokens.Hr
import typingsSlinky.marked.mod.Tokens.ListEnd
import typingsSlinky.marked.mod.Tokens.ListItemEnd
import typingsSlinky.marked.mod.Tokens.ListItemStart
import typingsSlinky.marked.mod.Tokens.ListStart
import typingsSlinky.marked.mod.Tokens.LooseItemStart
import typingsSlinky.marked.mod.Tokens.Paragraph
import typingsSlinky.marked.mod.Tokens.Space
import typingsSlinky.marked.mod.Tokens.Table
import typingsSlinky.marked.mod.Tokens.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.marked.mod.Tokens.Space
  - typingsSlinky.marked.mod.Tokens.Code
  - typingsSlinky.marked.mod.Tokens.Heading
  - typingsSlinky.marked.mod.Tokens.Table
  - typingsSlinky.marked.mod.Tokens.Hr
  - typingsSlinky.marked.mod.Tokens.BlockquoteStart
  - typingsSlinky.marked.mod.Tokens.BlockquoteEnd
  - typingsSlinky.marked.mod.Tokens.ListStart
  - typingsSlinky.marked.mod.Tokens.LooseItemStart
  - typingsSlinky.marked.mod.Tokens.ListItemStart
  - typingsSlinky.marked.mod.Tokens.ListItemEnd
  - typingsSlinky.marked.mod.Tokens.ListEnd
  - typingsSlinky.marked.mod.Tokens.Paragraph
  - typingsSlinky.marked.mod.Tokens.HTML
  - typingsSlinky.marked.mod.Tokens.Text
*/
trait Token extends js.Object

object Token {
  @scala.inline
  implicit def apply(value: BlockquoteEnd): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: BlockquoteStart): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: Code): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: HTML): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: Heading): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: Hr): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ListEnd): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ListItemEnd): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ListItemStart): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: ListStart): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: LooseItemStart): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: Paragraph): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: Space): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: Table): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: Text): Token = value.asInstanceOf[Token]
}

