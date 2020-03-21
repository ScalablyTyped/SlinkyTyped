package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonLocTypes
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSIntersectionTypeBuilder extends js.Object {
  def apply(types: js.Array[TSTypeKind]): TSIntersectionType = js.native
  def from(params: AnonLocTypes): TSIntersectionType = js.native
}

