package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSAnyKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSArrayType
import typingsSlinky.babelTypes.babelTypesStrings.TSBigIntKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSBooleanKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSConditionalType
import typingsSlinky.babelTypes.babelTypesStrings.TSConstructorType
import typingsSlinky.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments
import typingsSlinky.babelTypes.babelTypesStrings.TSFunctionType
import typingsSlinky.babelTypes.babelTypesStrings.TSImportType
import typingsSlinky.babelTypes.babelTypesStrings.TSIndexedAccessType
import typingsSlinky.babelTypes.babelTypesStrings.TSInferType
import typingsSlinky.babelTypes.babelTypesStrings.TSIntersectionType
import typingsSlinky.babelTypes.babelTypesStrings.TSIntrinsicKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSLiteralType
import typingsSlinky.babelTypes.babelTypesStrings.TSMappedType
import typingsSlinky.babelTypes.babelTypesStrings.TSNeverKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSNullKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSNumberKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSObjectKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSOptionalType
import typingsSlinky.babelTypes.babelTypesStrings.TSParenthesizedType
import typingsSlinky.babelTypes.babelTypesStrings.TSRestType
import typingsSlinky.babelTypes.babelTypesStrings.TSStringKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSSymbolKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSThisType
import typingsSlinky.babelTypes.babelTypesStrings.TSTupleType
import typingsSlinky.babelTypes.babelTypesStrings.TSTypeLiteral
import typingsSlinky.babelTypes.babelTypesStrings.TSTypeOperator
import typingsSlinky.babelTypes.babelTypesStrings.TSTypePredicate
import typingsSlinky.babelTypes.babelTypesStrings.TSTypeQuery
import typingsSlinky.babelTypes.babelTypesStrings.TSTypeReference
import typingsSlinky.babelTypes.babelTypesStrings.TSUndefinedKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSUnionType
import typingsSlinky.babelTypes.babelTypesStrings.TSUnknownKeyword
import typingsSlinky.babelTypes.babelTypesStrings.TSVoidKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.TSAnyKeyword_
  - typingsSlinky.babelTypes.mod.TSBooleanKeyword_
  - typingsSlinky.babelTypes.mod.TSBigIntKeyword_
  - typingsSlinky.babelTypes.mod.TSIntrinsicKeyword_
  - typingsSlinky.babelTypes.mod.TSNeverKeyword_
  - typingsSlinky.babelTypes.mod.TSNullKeyword_
  - typingsSlinky.babelTypes.mod.TSNumberKeyword_
  - typingsSlinky.babelTypes.mod.TSObjectKeyword_
  - typingsSlinky.babelTypes.mod.TSStringKeyword_
  - typingsSlinky.babelTypes.mod.TSSymbolKeyword_
  - typingsSlinky.babelTypes.mod.TSUndefinedKeyword_
  - typingsSlinky.babelTypes.mod.TSUnknownKeyword_
  - typingsSlinky.babelTypes.mod.TSVoidKeyword_
  - typingsSlinky.babelTypes.mod.TSThisType_
  - typingsSlinky.babelTypes.mod.TSFunctionType_
  - typingsSlinky.babelTypes.mod.TSConstructorType_
  - typingsSlinky.babelTypes.mod.TSTypeReference_
  - typingsSlinky.babelTypes.mod.TSTypePredicate_
  - typingsSlinky.babelTypes.mod.TSTypeQuery_
  - typingsSlinky.babelTypes.mod.TSTypeLiteral_
  - typingsSlinky.babelTypes.mod.TSArrayType_
  - typingsSlinky.babelTypes.mod.TSTupleType_
  - typingsSlinky.babelTypes.mod.TSOptionalType_
  - typingsSlinky.babelTypes.mod.TSRestType_
  - typingsSlinky.babelTypes.mod.TSUnionType_
  - typingsSlinky.babelTypes.mod.TSIntersectionType_
  - typingsSlinky.babelTypes.mod.TSConditionalType_
  - typingsSlinky.babelTypes.mod.TSInferType_
  - typingsSlinky.babelTypes.mod.TSParenthesizedType_
  - typingsSlinky.babelTypes.mod.TSTypeOperator_
  - typingsSlinky.babelTypes.mod.TSIndexedAccessType_
  - typingsSlinky.babelTypes.mod.TSMappedType_
  - typingsSlinky.babelTypes.mod.TSLiteralType_
  - typingsSlinky.babelTypes.mod.TSExpressionWithTypeArguments_
  - typingsSlinky.babelTypes.mod.TSImportType_
*/
trait TSType extends _Node
object TSType {
  
  @scala.inline
  def TSUndefinedKeyword_(`type`: TSUndefinedKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSIntrinsicKeyword_(`type`: TSIntrinsicKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSBooleanKeyword_(`type`: TSBooleanKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSLiteralType_(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_,
    `type`: TSLiteralType
  ): TSType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTupleType_(elementTypes: js.Array[TSType | TSNamedTupleMember_], `type`: TSTupleType): TSType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSConstructorType_(parameters: js.Array[Identifier_ | RestElement_], `type`: TSConstructorType): TSType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSIndexedAccessType_(indexType: TSType, objectType: TSType, `type`: TSIndexedAccessType): TSType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSBigIntKeyword_(`type`: TSBigIntKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSNullKeyword_(`type`: TSNullKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSFunctionType_(parameters: js.Array[Identifier_ | RestElement_], `type`: TSFunctionType): TSType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSThisType_(`type`: TSThisType): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTypeLiteral_(members: js.Array[TSTypeElement], `type`: TSTypeLiteral): TSType = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSExpressionWithTypeArguments_(expression: TSEntityName, `type`: TSExpressionWithTypeArguments): TSType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSConditionalType_(
    checkType: TSType,
    extendsType: TSType,
    falseType: TSType,
    trueType: TSType,
    `type`: TSConditionalType
  ): TSType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTypeQuery_(exprName: TSEntityName | TSImportType_, `type`: TSTypeQuery): TSType = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSArrayType_(elementType: TSType, `type`: TSArrayType): TSType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSNeverKeyword_(`type`: TSNeverKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTypeOperator_(operator: String, `type`: TSTypeOperator, typeAnnotation: TSType): TSType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSRestType_(`type`: TSRestType, typeAnnotation: TSType): TSType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSVoidKeyword_(`type`: TSVoidKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSOptionalType_(`type`: TSOptionalType, typeAnnotation: TSType): TSType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSIntersectionType_(`type`: TSIntersectionType, types: js.Array[TSType]): TSType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSUnknownKeyword_(`type`: TSUnknownKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSUnionType_(`type`: TSUnionType, types: js.Array[TSType]): TSType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSSymbolKeyword_(`type`: TSSymbolKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSObjectKeyword_(`type`: TSObjectKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTypeReference_(`type`: TSTypeReference, typeName: TSEntityName): TSType = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSStringKeyword_(`type`: TSStringKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSAnyKeyword_(`type`: TSAnyKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSNumberKeyword_(`type`: TSNumberKeyword): TSType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSMappedType_(`type`: TSMappedType, typeParameter: TSTypeParameter_): TSType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSInferType_(`type`: TSInferType, typeParameter: TSTypeParameter_): TSType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSParenthesizedType_(`type`: TSParenthesizedType, typeAnnotation: TSType): TSType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTypePredicate_(parameterName: Identifier_ | TSThisType_, `type`: TSTypePredicate): TSType = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSImportType_(argument: StringLiteral_, `type`: TSImportType): TSType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
}
