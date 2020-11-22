package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.EnumBooleanBody
import typingsSlinky.babelTypes.babelTypesStrings.EnumNumberBody
import typingsSlinky.babelTypes.babelTypesStrings.EnumStringBody
import typingsSlinky.babelTypes.babelTypesStrings.EnumSymbolBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.EnumBooleanBody_
  - typingsSlinky.babelTypes.indexTs37Mod.EnumNumberBody_
  - typingsSlinky.babelTypes.indexTs37Mod.EnumStringBody_
  - typingsSlinky.babelTypes.indexTs37Mod.EnumSymbolBody_
*/
trait EnumBody extends _Node
object EnumBody {
  
  @scala.inline
  def EnumBooleanBody_(explicit: Boolean, members: js.Array[EnumBooleanMember_], `type`: EnumBooleanBody): EnumBody = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBody]
  }
  
  @scala.inline
  def EnumNumberBody_(explicit: Boolean, members: js.Array[EnumNumberMember_], `type`: EnumNumberBody): EnumBody = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBody]
  }
  
  @scala.inline
  def EnumStringBody_(
    explicit: Boolean,
    members: js.Array[EnumStringMember_ | EnumDefaultedMember_],
    `type`: EnumStringBody
  ): EnumBody = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBody]
  }
  
  @scala.inline
  def EnumSymbolBody_(members: js.Array[EnumDefaultedMember_], `type`: EnumSymbolBody): EnumBody = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBody]
  }
}
