package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.LocTypeParameters
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSExpressionWithTypeArgumentsBuilder extends StObject {
  
  def apply(expression: IdentifierKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSQualifiedNameKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  
  def from(params: LocTypeParameters): TSExpressionWithTypeArguments = js.native
}
