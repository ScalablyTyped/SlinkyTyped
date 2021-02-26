package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Quasi
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.TemplateLiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaggedTemplateExpressionBuilder extends StObject {
  
  def apply(tag: ExpressionKind, quasi: TemplateLiteralKind): TaggedTemplateExpression = js.native
  
  def from(params: Quasi): TaggedTemplateExpression = js.native
}
