package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.MembersArray
import typingsSlinky.astTypes.kindsMod.EnumDefaultedMemberKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumSymbolBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumSymbolBodyBuilder extends js.Object {
  
  def apply(members: js.Array[EnumDefaultedMemberKind]): EnumSymbolBody = js.native
  
  def from(params: MembersArray): EnumSymbolBody = js.native
}
