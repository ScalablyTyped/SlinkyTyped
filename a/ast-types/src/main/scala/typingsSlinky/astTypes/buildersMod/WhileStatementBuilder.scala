package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Test
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhileStatementBuilder extends StObject {
  
  def apply(test: ExpressionKind, body: StatementKind): WhileStatement = js.native
  
  def from(params: Test): WhileStatement = js.native
}
