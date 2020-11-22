package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Constraint
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeParameterBuilder extends js.Object {
  
  def apply(name: String): TSTypeParameter = js.native
  def apply(name: String, constraint: js.UndefOr[scala.Nothing], defaultParam: TSTypeKind): TSTypeParameter = js.native
  def apply(name: String, constraint: TSTypeKind): TSTypeParameter = js.native
  def apply(name: String, constraint: TSTypeKind, defaultParam: TSTypeKind): TSTypeParameter = js.native
  
  def from(params: Constraint): TSTypeParameter = js.native
}
