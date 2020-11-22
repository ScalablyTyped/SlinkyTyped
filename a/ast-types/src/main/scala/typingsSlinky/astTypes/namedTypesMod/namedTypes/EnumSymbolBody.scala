package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.EnumDefaultedMemberKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumSymbolBody extends ASTNode {
  
  var members: js.Array[EnumDefaultedMemberKind] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.EnumSymbolBody = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumSymbolBody")
@js.native
object EnumSymbolBody extends TopLevel[Type[EnumSymbolBody]]
