package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsLocRegex
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Literal
import typingsSlinky.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralBuilder extends js.Object {
  def apply(): Literal = js.native
  def apply(value: String): Literal = js.native
  def apply(value: Boolean): Literal = js.native
  def apply(value: Double): Literal = js.native
  def apply(value: RegExp): Literal = js.native
  def from(params: Anon_CommentsLocRegex): Literal = js.native
}

