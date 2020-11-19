package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.`nth-child`
import typingsSlinky.esquery.esqueryStrings.`nth-last-child`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.NthChild
  - typingsSlinky.esquery.mod.NthLastChild
*/
trait NthSelector extends SubjectSelector
object NthSelector {
  
  @scala.inline
  def NthChild(index: NumericLiteral, `type`: `nth-child`): NthSelector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthSelector]
  }
  
  @scala.inline
  def NthLastChild(index: NumericLiteral, `type`: `nth-last-child`): NthSelector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthSelector]
  }
}
