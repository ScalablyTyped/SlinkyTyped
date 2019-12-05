package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsComputedConstructor
import typingsSlinky.astDashTypes.astDashTypesStrings.constructor
import typingsSlinky.astDashTypes.astDashTypesStrings.get
import typingsSlinky.astDashTypes.astDashTypesStrings.method
import typingsSlinky.astDashTypes.astDashTypesStrings.set
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.FunctionKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.MethodDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodDefinitionBuilder extends js.Object {
  def apply(kind: constructor, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: constructor, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def apply(kind: get, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: get, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def apply(kind: method, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: method, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def apply(kind: set, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: set, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def from(params: Anon_CommentsComputedConstructor): MethodDefinition = js.native
}

