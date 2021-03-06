package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Predicate
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareFunctionBuilder extends StObject {
  
  def apply(id: IdentifierKind): DeclareFunction = js.native
  
  def from(params: Predicate): DeclareFunction = js.native
}
