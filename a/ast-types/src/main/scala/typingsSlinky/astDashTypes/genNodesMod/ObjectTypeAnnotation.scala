package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.ObjectTypeCallPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypeIndexerKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypeInternalSlotKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypePropertyKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypeSpreadPropertyKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait ObjectTypeAnnotation extends ASTNode {
  var callProperties: js.Array[ObjectTypeCallPropertyKind]
  var exact: Boolean
  var indexers: js.Array[ObjectTypeIndexerKind]
  var inexact: js.UndefOr[Boolean] = js.undefined
  var internalSlots: js.Array[ObjectTypeInternalSlotKind]
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ObjectTypeAnnotation
}

object ObjectTypeAnnotation {
  @scala.inline
  def apply(
    callProperties: js.Array[ObjectTypeCallPropertyKind],
    exact: Boolean,
    indexers: js.Array[ObjectTypeIndexerKind],
    internalSlots: js.Array[ObjectTypeInternalSlotKind],
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ObjectTypeAnnotation,
    inexact: js.UndefOr[Boolean] = js.undefined
  ): ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], internalSlots = internalSlots.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(inexact)) __obj.updateDynamic("inexact")(inexact.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeAnnotation]
  }
}

