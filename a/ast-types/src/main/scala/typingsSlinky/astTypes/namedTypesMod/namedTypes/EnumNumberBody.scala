package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.EnumNumberMemberKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumNumberBody extends ASTNode {
  
  var explicitType: Boolean = js.native
  
  var members: js.Array[EnumNumberMemberKind] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.EnumNumberBody = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumNumberBody")
@js.native
object EnumNumberBody extends TopLevel[Type[EnumNumberBody]]
