package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Name
import typingsSlinky.astTypes.kindsMod.JSXElementKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXAttributeBuilder extends js.Object {
  
  def apply(name: JSXIdentifierKind): JSXAttribute = js.native
  def apply(name: JSXIdentifierKind, value: JSXElementKind): JSXAttribute = js.native
  def apply(name: JSXIdentifierKind, value: JSXExpressionContainerKind): JSXAttribute = js.native
  def apply(name: JSXIdentifierKind, value: JSXFragmentKind): JSXAttribute = js.native
  def apply(name: JSXIdentifierKind, value: LiteralKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind, value: JSXElementKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind, value: JSXExpressionContainerKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind, value: JSXFragmentKind): JSXAttribute = js.native
  def apply(name: JSXNamespacedNameKind, value: LiteralKind): JSXAttribute = js.native
  
  def from(params: Name): JSXAttribute = js.native
}
