package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassProperty
import typingsSlinky.babelTypes.babelTypesStrings.ObjectProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.ObjectProperty_
  - typingsSlinky.babelTypes.ts36Mod.ClassProperty_
*/
trait Property extends StObject
object Property {
  
  @scala.inline
  def ClassProperty_(
    end: Double,
    key: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ClassProperty,
    value: Expression
  ): typingsSlinky.babelTypes.ts36Mod.ClassProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ClassProperty_]
  }
  
  @scala.inline
  def ObjectProperty_(
    computed: Boolean,
    end: Double,
    key: Expression,
    loc: SourceLocation,
    shorthand: Boolean,
    start: Double,
    `type`: ObjectProperty,
    value: Expression
  ): typingsSlinky.babelTypes.ts36Mod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ObjectProperty_]
  }
}
