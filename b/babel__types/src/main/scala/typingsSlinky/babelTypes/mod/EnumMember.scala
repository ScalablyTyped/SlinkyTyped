package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.EnumBooleanMember
import typingsSlinky.babelTypes.babelTypesStrings.EnumDefaultedMember
import typingsSlinky.babelTypes.babelTypesStrings.EnumNumberMember
import typingsSlinky.babelTypes.babelTypesStrings.EnumStringMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.EnumBooleanMember_
  - typingsSlinky.babelTypes.mod.EnumNumberMember_
  - typingsSlinky.babelTypes.mod.EnumStringMember_
  - typingsSlinky.babelTypes.mod.EnumDefaultedMember_
*/
trait EnumMember extends _Node

object EnumMember {
  @scala.inline
  def EnumBooleanMember_(id: Identifier_, init: BooleanLiteral_, `type`: EnumBooleanMember): EnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMember]
  }
  @scala.inline
  def EnumNumberMember_(id: Identifier_, init: NumericLiteral_, `type`: EnumNumberMember): EnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMember]
  }
  @scala.inline
  def EnumStringMember_(id: Identifier_, init: StringLiteral_, `type`: EnumStringMember): EnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMember]
  }
  @scala.inline
  def EnumDefaultedMember_(id: Identifier_, `type`: EnumDefaultedMember): EnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMember]
  }
}

