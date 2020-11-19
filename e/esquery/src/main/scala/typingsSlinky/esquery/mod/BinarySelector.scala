package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.adjacent
import typingsSlinky.esquery.esqueryStrings.child
import typingsSlinky.esquery.esqueryStrings.descendant
import typingsSlinky.esquery.esqueryStrings.sibling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.Descendant
  - typingsSlinky.esquery.mod.Child
  - typingsSlinky.esquery.mod.Sibling
  - typingsSlinky.esquery.mod.Adjacent
*/
trait BinarySelector extends SubjectSelector
object BinarySelector {
  
  @scala.inline
  def Descendant(left: SubjectSelector, right: SubjectSelector, `type`: descendant): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
  
  @scala.inline
  def Child(left: SubjectSelector, right: SubjectSelector, `type`: child): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
  
  @scala.inline
  def Sibling(left: SubjectSelector, right: SubjectSelector, `type`: sibling): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
  
  @scala.inline
  def Adjacent(left: SubjectSelector, right: SubjectSelector, `type`: adjacent): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
}
