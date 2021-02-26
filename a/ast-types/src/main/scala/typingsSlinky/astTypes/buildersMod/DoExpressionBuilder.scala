package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.BodyCommentsLoc
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoExpressionBuilder extends StObject {
  
  def apply(body: js.Array[StatementKind]): DoExpression = js.native
  
  def from(params: BodyCommentsLoc): DoExpression = js.native
}
