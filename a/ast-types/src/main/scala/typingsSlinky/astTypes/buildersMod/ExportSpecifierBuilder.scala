package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Exported
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSpecifierBuilder extends js.Object {
  def apply(local: js.UndefOr[IdentifierKind | Null], exported: IdentifierKind): ExportSpecifier = js.native
  def from(params: Exported): ExportSpecifier = js.native
}

