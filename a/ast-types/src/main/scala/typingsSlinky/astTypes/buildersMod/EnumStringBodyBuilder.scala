package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ExplicitTypeMembers
import typingsSlinky.astTypes.kindsMod.EnumDefaultedMemberKind
import typingsSlinky.astTypes.kindsMod.EnumStringMemberKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumStringBodyBuilder extends js.Object {
  
  def apply(members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind], explicitType: Boolean): EnumStringBody = js.native
  
  def from(params: ExplicitTypeMembers): EnumStringBody = js.native
}
