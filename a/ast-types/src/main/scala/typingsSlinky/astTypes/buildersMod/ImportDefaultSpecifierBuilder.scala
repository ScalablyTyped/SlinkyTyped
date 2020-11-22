package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Local
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDefaultSpecifierBuilder extends js.Object {
  
  def apply(): ImportDefaultSpecifier = js.native
  def apply(local: IdentifierKind): ImportDefaultSpecifier = js.native
  
  def from(params: Local): ImportDefaultSpecifier = js.native
}
