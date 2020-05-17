package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Local
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportNamespaceSpecifierBuilder extends js.Object {
  def apply(): ImportNamespaceSpecifier = js.native
  def apply(local: IdentifierKind): ImportNamespaceSpecifier = js.native
  def from(params: Local): ImportNamespaceSpecifier = js.native
}

