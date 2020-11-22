package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Imported
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSpecifierBuilder extends js.Object {
  
  def apply(imported: IdentifierKind): ImportSpecifier = js.native
  def apply(imported: IdentifierKind, local: IdentifierKind): ImportSpecifier = js.native
  
  def from(params: Imported): ImportSpecifier = js.native
}
