package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CallProperties
import typingsSlinky.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeIndexerKind
import typingsSlinky.astTypes.kindsMod.ObjectTypePropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
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
  def from(params: CallProperties): ObjectTypeAnnotation = js.native
}

