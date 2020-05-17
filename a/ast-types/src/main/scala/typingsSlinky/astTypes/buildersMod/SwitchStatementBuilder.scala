package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Cases
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SwitchCaseKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchStatementBuilder extends js.Object {
  def apply(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind]): SwitchStatement = js.native
  def apply(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind], lexical: Boolean): SwitchStatement = js.native
  def from(params: Cases): SwitchStatement = js.native
}

