package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType
*/
trait TSHasOptionalTypeParameterInstantiationKind extends js.Object

object TSHasOptionalTypeParameterInstantiationKind {
  @scala.inline
  implicit def apply(value: TSExpressionWithTypeArguments): TSHasOptionalTypeParameterInstantiationKind = value.asInstanceOf[TSHasOptionalTypeParameterInstantiationKind]
  @scala.inline
  implicit def apply(value: TSImportType): TSHasOptionalTypeParameterInstantiationKind = value.asInstanceOf[TSHasOptionalTypeParameterInstantiationKind]
  @scala.inline
  implicit def apply(value: TSTypeReference): TSHasOptionalTypeParameterInstantiationKind = value.asInstanceOf[TSHasOptionalTypeParameterInstantiationKind]
}

