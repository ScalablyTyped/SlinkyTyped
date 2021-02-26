package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Object
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStatementBuilder extends StObject {
  
  def apply(`object`: ExpressionKind, body: StatementKind): WithStatement = js.native
  
  def from(params: Object): WithStatement = js.native
}
