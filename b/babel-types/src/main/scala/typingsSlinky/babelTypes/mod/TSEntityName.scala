package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.Identifier_
  - typingsSlinky.babelTypes.mod.TSQualifiedName
*/
trait TSEntityName extends js.Object
object TSEntityName {
  
  @scala.inline
  def Identifier_(end: Double, loc: SourceLocation, name: String, start: Double, `type`: Identifier): TSEntityName = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEntityName]
  }
  
  @scala.inline
  def TSQualifiedName(
    end: Double,
    left: TSEntityName,
    loc: SourceLocation,
    right: Identifier_,
    start: Double,
    `type`: typingsSlinky.babelTypes.babelTypesStrings.TSQualifiedName
  ): TSEntityName = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEntityName]
  }
}
