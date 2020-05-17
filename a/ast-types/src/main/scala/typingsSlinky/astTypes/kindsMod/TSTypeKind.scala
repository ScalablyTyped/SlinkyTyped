package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
*/
trait TSTypeKind extends js.Object

object TSTypeKind {
  @scala.inline
  implicit def apply(value: TSAnyKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSArrayType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSBigIntKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSBooleanKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSConditionalType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSConstructorType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSExpressionWithTypeArguments): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSFunctionType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSImportType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSIndexedAccessType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSInferType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSIntersectionType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSLiteralType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSMappedType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSNeverKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSNullKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSNumberKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSObjectKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSOptionalType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSParenthesizedType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSRestType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSStringKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSSymbolKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSThisType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSTupleType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSTypeLiteral): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSTypeOperator): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSTypeQuery): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSTypeReference): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSUndefinedKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSUnionType): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSUnknownKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
  @scala.inline
  implicit def apply(value: TSVoidKeyword): TSTypeKind = value.asInstanceOf[TSTypeKind]
}

