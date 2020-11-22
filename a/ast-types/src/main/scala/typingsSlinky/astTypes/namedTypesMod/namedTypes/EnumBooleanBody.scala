package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.EnumBooleanMemberKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumBooleanBody extends ASTNode {
  
  var explicitType: Boolean = js.native
  
  var members: js.Array[EnumBooleanMemberKind] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.EnumBooleanBody = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumBooleanBody")
@js.native
object EnumBooleanBody extends TopLevel[Type[EnumBooleanBody]]
