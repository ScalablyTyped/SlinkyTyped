package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ExpressionStringLiteralKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSExternalModuleReferenceBuilder extends js.Object {
  
  def apply(expression: StringLiteralKind): TSExternalModuleReference = js.native
  
  def from(params: ExpressionStringLiteralKind): TSExternalModuleReference = js.native
}
