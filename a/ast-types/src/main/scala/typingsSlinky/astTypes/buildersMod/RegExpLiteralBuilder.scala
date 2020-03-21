package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpLiteralBuilder extends js.Object {
  def apply(pattern: String, flags: String): RegExpLiteral = js.native
  def from(params: AnonPattern): RegExpLiteral = js.native
}

