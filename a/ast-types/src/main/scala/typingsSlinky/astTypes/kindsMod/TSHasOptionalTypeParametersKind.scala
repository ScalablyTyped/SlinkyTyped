package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
*/
trait TSHasOptionalTypeParametersKind extends StObject
object TSHasOptionalTypeParametersKind {
  
  @scala.inline
  def TSCallSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSCallSignatureDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration]
  }
  
  @scala.inline
  def TSConstructSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSConstructSignatureDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration]
  }
  
  @scala.inline
  def TSConstructorType(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSConstructorType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType]
  }
  
  @scala.inline
  def TSDeclareFunction(params: js.Array[PatternKind], `type`: typingsSlinky.astTypes.astTypesStrings.TSDeclareFunction): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction]
  }
  
  @scala.inline
  def TSDeclareMethod(
    key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSDeclareMethod
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod]
  }
  
  @scala.inline
  def TSFunctionType(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSFunctionType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType]
  }
  
  @scala.inline
  def TSInterfaceDeclaration(
    body: TSInterfaceBodyKind,
    id: IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSInterfaceDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration]
  }
  
  @scala.inline
  def TSMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSMethodSignature
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature]
  }
  
  @scala.inline
  def TSTypeAliasDeclaration(
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAliasDeclaration,
    typeAnnotation: TSTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration]
  }
}
