package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.BodyCommentsId
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareModuleBuilder extends StObject {
  
  def apply(id: IdentifierKind, body: BlockStatementKind): DeclareModule = js.native
  def apply(id: LiteralKind, body: BlockStatementKind): DeclareModule = js.native
  
  def from(params: BodyCommentsId): DeclareModule = js.native
}
