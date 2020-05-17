package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.LocParams
import typingsSlinky.astTypes.kindsMod.TSTypeParameterKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterDeclarationBuilder extends js.Object {
  def apply(params: js.Array[TSTypeParameterKind]): TSTypeParameterDeclaration = js.native
  def from(params: LocParams): TSTypeParameterDeclaration = js.native
}

