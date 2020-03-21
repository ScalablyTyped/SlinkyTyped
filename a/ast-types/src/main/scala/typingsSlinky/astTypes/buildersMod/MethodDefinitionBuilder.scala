package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonKind
import typingsSlinky.astTypes.astTypesStrings.constructor
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.method
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.FunctionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
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
  def from(params: AnonKind): MethodDefinition = js.native
}

