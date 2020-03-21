package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonLocTypes
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSUnionTypeBuilder extends js.Object {
  def apply(types: js.Array[TSTypeKind]): TSUnionType = js.native
  def from(params: AnonLocTypes): TSUnionType = js.native
}

