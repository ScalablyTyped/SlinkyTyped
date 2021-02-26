package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Await
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForOfStatementBuilder extends StObject {
  
  def apply(left: PatternKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def apply(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  
  def from(params: Await): ForOfStatement = js.native
}
