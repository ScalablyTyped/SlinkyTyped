package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CallProperties
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypeCallPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypeIndexerKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypePropertyKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectTypeSpreadPropertyKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeAnnotationBuilder extends js.Object {
  def apply(properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind]
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind],
    callProperties: js.Array[ObjectTypeCallPropertyKind]
  ): ObjectTypeAnnotation = js.native
  def from(params: Anon_CallProperties): ObjectTypeAnnotation = js.native
}

