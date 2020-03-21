package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonNamespace
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXNamespacedNameBuilder extends js.Object {
  def apply(namespace: JSXIdentifierKind, name: JSXIdentifierKind): JSXNamespacedName = js.native
  def from(params: AnonNamespace): JSXNamespacedName = js.native
}

