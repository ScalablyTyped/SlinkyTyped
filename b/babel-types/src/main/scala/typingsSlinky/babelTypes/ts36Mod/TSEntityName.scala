package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.Identifier_
  - typingsSlinky.babelTypes.ts36Mod.TSQualifiedName
*/
trait TSEntityName extends StObject
object TSEntityName {
  
  @scala.inline
  def Identifier_(end: Double, loc: SourceLocation, name: String, start: Double, `type`: Identifier): typingsSlinky.babelTypes.ts36Mod.Identifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.Identifier_]
  }
  
  @scala.inline
  def TSQualifiedName(
    end: Double,
    left: TSEntityName,
    loc: SourceLocation,
    right: Identifier_,
    start: Double,
    `type`: typingsSlinky.babelTypes.babelTypesStrings.TSQualifiedName
  ): typingsSlinky.babelTypes.ts36Mod.TSQualifiedName = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.TSQualifiedName]
  }
}
