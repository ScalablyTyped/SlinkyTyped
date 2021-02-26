package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassPrivateProperty
import typingsSlinky.babelTypes.babelTypesStrings.ClassProperty
import typingsSlinky.babelTypes.babelTypesStrings.ObjectProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.ObjectProperty_
  - typingsSlinky.babelTypes.indexTs37Mod.ClassProperty_
  - typingsSlinky.babelTypes.indexTs37Mod.ClassPrivateProperty_
*/
trait Property extends _Node
object Property {
  
  @scala.inline
  def ClassPrivateProperty_(key: PrivateName_, static: js.Any, `type`: ClassPrivateProperty): typingsSlinky.babelTypes.indexTs37Mod.ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ClassPrivateProperty_]
  }
  
  @scala.inline
  def ClassProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    static: Boolean,
    `type`: ClassProperty
  ): typingsSlinky.babelTypes.indexTs37Mod.ClassProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ClassProperty_]
  }
  
  @scala.inline
  def ObjectProperty_(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    shorthand: Boolean,
    `type`: ObjectProperty,
    value: Expression | PatternLike
  ): typingsSlinky.babelTypes.indexTs37Mod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ObjectProperty_]
  }
}
