package typingsSlinky.handlebars.Handlebars

import typingsSlinky.handlebars.hbs.AST.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompiler extends js.Object {
  def BlockStatement(block: typingsSlinky.handlebars.hbs.AST.BlockStatement): Unit = js.native
  def BooleanLiteral(bool: typingsSlinky.handlebars.hbs.AST.BooleanLiteral): Unit = js.native
  def CommentStatement(): Unit = js.native
  def CommentStatement(comment: typingsSlinky.handlebars.hbs.AST.CommentStatement): Unit = js.native
  def ContentStatement(content: typingsSlinky.handlebars.hbs.AST.ContentStatement): Unit = js.native
  def Decorator(decorator: typingsSlinky.handlebars.hbs.AST.Decorator): Unit = js.native
  def DecoratorBlock(decorator: typingsSlinky.handlebars.hbs.AST.DecoratorBlock): Unit = js.native
  def Hash(hash: typingsSlinky.handlebars.hbs.AST.Hash): Unit = js.native
  def MustacheStatement(mustache: typingsSlinky.handlebars.hbs.AST.MustacheStatement): Unit = js.native
  def NullLiteral(): Unit = js.native
  def NumberLiteral(num: typingsSlinky.handlebars.hbs.AST.NumberLiteral): Unit = js.native
  def PartialBlockStatement(partial: typingsSlinky.handlebars.hbs.AST.PartialBlockStatement): Unit = js.native
  def PartialStatement(partial: typingsSlinky.handlebars.hbs.AST.PartialStatement): Unit = js.native
  def PathExpression(path: typingsSlinky.handlebars.hbs.AST.PathExpression): Unit = js.native
  def Program(program: typingsSlinky.handlebars.hbs.AST.Program): Unit = js.native
  def StringLiteral(str: typingsSlinky.handlebars.hbs.AST.StringLiteral): Unit = js.native
  def SubExpression(sexpr: typingsSlinky.handlebars.hbs.AST.SubExpression): Unit = js.native
  def UndefinedLiteral(): Unit = js.native
  def accept(node: Node): Unit = js.native
}

