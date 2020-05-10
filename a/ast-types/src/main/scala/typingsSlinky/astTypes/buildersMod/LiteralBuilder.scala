package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonRegex
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralBuilder extends js.Object {
  def apply(): Literal = js.native
  def apply(value: String): Literal = js.native
  def apply(value: Boolean): Literal = js.native
  def apply(value: Double): Literal = js.native
  def apply(value: js.RegExp): Literal = js.native
  def from(params: AnonRegex): Literal = js.native
}

