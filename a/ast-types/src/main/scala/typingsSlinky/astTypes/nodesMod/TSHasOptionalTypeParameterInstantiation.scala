package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSHasOptionalTypeParameterInstantiation extends js.Object {
  var typeParameters: TSTypeParameterInstantiationKind | Null
}

object TSHasOptionalTypeParameterInstantiation {
  @scala.inline
  def apply(typeParameters: TSTypeParameterInstantiationKind = null): TSHasOptionalTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSHasOptionalTypeParameterInstantiation]
  }
}

