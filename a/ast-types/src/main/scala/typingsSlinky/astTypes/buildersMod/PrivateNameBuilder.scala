package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsId
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateNameBuilder extends js.Object {
  
  def apply(id: IdentifierKind): PrivateName = js.native
  
  def from(params: CommentsId): PrivateName = js.native
}
