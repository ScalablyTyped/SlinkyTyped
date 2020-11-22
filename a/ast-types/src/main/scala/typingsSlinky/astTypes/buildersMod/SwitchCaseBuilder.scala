package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Consequent
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchCaseBuilder extends js.Object {
  
  def apply(test: Null, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def apply(test: ExpressionKind, consequent: js.Array[StatementKind]): SwitchCase = js.native
  
  def from(params: Consequent): SwitchCase = js.native
}
