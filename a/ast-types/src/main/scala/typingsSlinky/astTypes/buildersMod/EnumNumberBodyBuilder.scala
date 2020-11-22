package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Members
import typingsSlinky.astTypes.kindsMod.EnumNumberMemberKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumNumberBodyBuilder extends js.Object {
  
  def apply(members: js.Array[EnumNumberMemberKind], explicitType: Boolean): EnumNumberBody = js.native
  
  def from(params: Members): EnumNumberBody = js.native
}
