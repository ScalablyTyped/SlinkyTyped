package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Quasis
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.TemplateElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateLiteralBuilder extends StObject {
  
  def apply(quasis: js.Array[TemplateElementKind], expressions: js.Array[ExpressionKind]): TemplateLiteral = js.native
  
  def from(params: Quasis): TemplateLiteral = js.native
}
