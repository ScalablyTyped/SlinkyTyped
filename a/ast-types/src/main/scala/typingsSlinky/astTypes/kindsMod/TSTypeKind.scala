package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
*/
trait TSTypeKind extends StObject
object TSTypeKind {
  
  @scala.inline
  def TSAnyKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSAnyKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword]
  }
  
  @scala.inline
  def TSArrayType(elementType: TSTypeKind, `type`: typingsSlinky.astTypes.astTypesStrings.TSArrayType): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType]
  }
  
  @scala.inline
  def TSBigIntKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSBigIntKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword]
  }
  
  @scala.inline
  def TSBooleanKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSBooleanKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword]
  }
  
  @scala.inline
  def TSConditionalType(
    checkType: TSTypeKind,
    extendsType: TSTypeKind,
    falseType: TSTypeKind,
    trueType: TSTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSConditionalType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType]
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
  def TSExpressionWithTypeArguments(
    expression: IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSExpressionWithTypeArguments
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments]
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
  def TSImportType(argument: StringLiteralKind, `type`: typingsSlinky.astTypes.astTypesStrings.TSImportType): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType]
  }
  
  @scala.inline
  def TSIndexedAccessType(
    indexType: TSTypeKind,
    objectType: TSTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSIndexedAccessType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType]
  }
  
  @scala.inline
  def TSInferType(`type`: typingsSlinky.astTypes.astTypesStrings.TSInferType, typeParameter: TSTypeParameterKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType]
  }
  
  @scala.inline
  def TSIntersectionType(`type`: typingsSlinky.astTypes.astTypesStrings.TSIntersectionType, types: js.Array[TSTypeKind]): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType]
  }
  
  @scala.inline
  def TSLiteralType(
    literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSLiteralType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType]
  }
  
  @scala.inline
  def TSMappedType(`type`: typingsSlinky.astTypes.astTypesStrings.TSMappedType, typeParameter: TSTypeParameterKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType]
  }
  
  @scala.inline
  def TSNamedTupleMember(
    elementType: TSTypeKind,
    label: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSNamedTupleMember
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember]
  }
  
  @scala.inline
  def TSNeverKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSNeverKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword]
  }
  
  @scala.inline
  def TSNullKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSNullKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword]
  }
  
  @scala.inline
  def TSNumberKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSNumberKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword]
  }
  
  @scala.inline
  def TSObjectKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSObjectKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword]
  }
  
  @scala.inline
  def TSOptionalType(`type`: typingsSlinky.astTypes.astTypesStrings.TSOptionalType, typeAnnotation: TSTypeKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType]
  }
  
  @scala.inline
  def TSParenthesizedType(`type`: typingsSlinky.astTypes.astTypesStrings.TSParenthesizedType, typeAnnotation: TSTypeKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType]
  }
  
  @scala.inline
  def TSRestType(`type`: typingsSlinky.astTypes.astTypesStrings.TSRestType, typeAnnotation: TSTypeKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType]
  }
  
  @scala.inline
  def TSStringKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSStringKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword]
  }
  
  @scala.inline
  def TSSymbolKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSSymbolKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword]
  }
  
  @scala.inline
  def TSThisType(`type`: typingsSlinky.astTypes.astTypesStrings.TSThisType): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType]
  }
  
  @scala.inline
  def TSTupleType(
    elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTupleType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType]
  }
  
  @scala.inline
  def TSTypeLiteral(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeLiteral
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral]
  }
  
  @scala.inline
  def TSTypeOperator(
    operator: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeOperator,
    typeAnnotation: TSTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator]
  }
  
  @scala.inline
  def TSTypePredicate(
    parameterName: IdentifierKind | TSThisTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypePredicate
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate]
  }
  
  @scala.inline
  def TSTypeQuery(
    exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeQuery
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery]
  }
  
  @scala.inline
  def TSTypeReference(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeReference,
    typeName: IdentifierKind | TSQualifiedNameKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference]
  }
  
  @scala.inline
  def TSUndefinedKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSUndefinedKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword]
  }
  
  @scala.inline
  def TSUnionType(`type`: typingsSlinky.astTypes.astTypesStrings.TSUnionType, types: js.Array[TSTypeKind]): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType]
  }
  
  @scala.inline
  def TSUnknownKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSUnknownKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword]
  }
  
  @scala.inline
  def TSVoidKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSVoidKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword]
  }
}
