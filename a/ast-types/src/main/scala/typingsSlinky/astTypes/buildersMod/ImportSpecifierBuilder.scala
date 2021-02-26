package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Imported
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSpecifierBuilder extends StObject {
  
  def apply(imported: IdentifierKind): ImportSpecifier = js.native
  def apply(imported: IdentifierKind, local: IdentifierKind): ImportSpecifier = js.native
  
  def from(params: Imported): ImportSpecifier = js.native
}
