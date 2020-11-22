package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ExpressionExtra
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeAssertionBuilder extends js.Object {
  
  def apply(typeAnnotation: TSTypeKind, expression: ExpressionKind): TSTypeAssertion = js.native
  
  def from(params: ExpressionExtra): TSTypeAssertion = js.native
}
