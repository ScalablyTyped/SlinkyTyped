package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Elements
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.RestElementKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayExpressionBuilder extends StObject {
  
  def apply(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): ArrayExpression = js.native
  
  def from(params: Elements): ArrayExpression = js.native
}
