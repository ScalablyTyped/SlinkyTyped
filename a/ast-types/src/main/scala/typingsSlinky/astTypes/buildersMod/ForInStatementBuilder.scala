package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Left
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForInStatementBuilder extends js.Object {
  
  def apply(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  def apply(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  
  def from(params: Left): ForInStatement = js.native
}
