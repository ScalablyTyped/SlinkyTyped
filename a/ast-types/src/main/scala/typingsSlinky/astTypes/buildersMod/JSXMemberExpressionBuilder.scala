package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Property
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXMemberExpressionBuilder extends StObject {
  
  def apply(`object`: JSXIdentifierKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def apply(`object`: JSXMemberExpressionKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  
  def from(params: Property): JSXMemberExpression = js.native
}
