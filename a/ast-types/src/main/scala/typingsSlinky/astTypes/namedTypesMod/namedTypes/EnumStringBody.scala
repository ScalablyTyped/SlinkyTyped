package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.EnumDefaultedMemberKind
import typingsSlinky.astTypes.kindsMod.EnumStringMemberKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumStringBody extends ASTNode {
  
  var explicitType: Boolean = js.native
  
  var members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.EnumStringBody = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumStringBody")
@js.native
object EnumStringBody extends TopLevel[Type[EnumStringBody]]
