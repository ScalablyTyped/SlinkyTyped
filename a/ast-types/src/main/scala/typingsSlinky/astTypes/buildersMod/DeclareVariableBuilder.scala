package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsId
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareVariableBuilder extends js.Object {
  
  def apply(id: IdentifierKind): DeclareVariable = js.native
  
  def from(params: CommentsId): DeclareVariable = js.native
}
