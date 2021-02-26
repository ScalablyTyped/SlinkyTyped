package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.EnumBooleanBody
import typingsSlinky.babelTypes.babelTypesStrings.EnumNumberBody
import typingsSlinky.babelTypes.babelTypesStrings.EnumStringBody
import typingsSlinky.babelTypes.babelTypesStrings.EnumSymbolBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.EnumBooleanBody_
  - typingsSlinky.babelTypes.mod.EnumNumberBody_
  - typingsSlinky.babelTypes.mod.EnumStringBody_
  - typingsSlinky.babelTypes.mod.EnumSymbolBody_
*/
trait EnumBody extends _Node
object EnumBody {
  
  @scala.inline
  def EnumBooleanBody_(explicit: Boolean, members: js.Array[EnumBooleanMember_], `type`: EnumBooleanBody): typingsSlinky.babelTypes.mod.EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.EnumBooleanBody_]
  }
  
  @scala.inline
  def EnumNumberBody_(explicit: Boolean, members: js.Array[EnumNumberMember_], `type`: EnumNumberBody): typingsSlinky.babelTypes.mod.EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.EnumNumberBody_]
  }
  
  @scala.inline
  def EnumStringBody_(
    explicit: Boolean,
    members: js.Array[EnumStringMember_ | EnumDefaultedMember_],
    `type`: EnumStringBody
  ): typingsSlinky.babelTypes.mod.EnumStringBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.EnumStringBody_]
  }
  
  @scala.inline
  def EnumSymbolBody_(members: js.Array[EnumDefaultedMember_], `type`: EnumSymbolBody): typingsSlinky.babelTypes.mod.EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.EnumSymbolBody_]
  }
}
