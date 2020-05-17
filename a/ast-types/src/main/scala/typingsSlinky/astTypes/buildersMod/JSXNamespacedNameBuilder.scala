package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Namespace
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXNamespacedNameBuilder extends js.Object {
  def apply(namespace: JSXIdentifierKind, name: JSXIdentifierKind): JSXNamespacedName = js.native
  def from(params: Namespace): JSXNamespacedName = js.native
}

