package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Exported
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSpecifierBuilder extends StObject {
  
  def apply(): ExportSpecifier = js.native
  def apply(id: js.UndefOr[scala.Nothing], name: IdentifierKind): ExportSpecifier = js.native
  def apply(id: Null, name: IdentifierKind): ExportSpecifier = js.native
  def apply(id: IdentifierKind): ExportSpecifier = js.native
  def apply(id: IdentifierKind, name: IdentifierKind): ExportSpecifier = js.native
  
  def from(params: Exported): ExportSpecifier = js.native
}
