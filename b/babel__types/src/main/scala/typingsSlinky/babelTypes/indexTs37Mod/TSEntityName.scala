package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.Identifier
import typingsSlinky.babelTypes.babelTypesStrings.TSQualifiedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.Identifier_
  - typingsSlinky.babelTypes.indexTs37Mod.TSQualifiedName_
*/
trait TSEntityName extends _Node
object TSEntityName {
  
  @scala.inline
  def Identifier_(name: String, `type`: Identifier): TSEntityName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEntityName]
  }
  
  @scala.inline
  def TSQualifiedName_(left: TSEntityName, right: Identifier_, `type`: TSQualifiedName): TSEntityName = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEntityName]
  }
}
