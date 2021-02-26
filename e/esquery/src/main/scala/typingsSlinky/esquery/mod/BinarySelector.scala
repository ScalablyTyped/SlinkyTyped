package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.adjacent
import typingsSlinky.esquery.esqueryStrings.child
import typingsSlinky.esquery.esqueryStrings.descendant
import typingsSlinky.esquery.esqueryStrings.sibling
import org.scalablytyped.runtime.StObject
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
  def Adjacent(left: SubjectSelector, right: SubjectSelector, `type`: adjacent): typingsSlinky.esquery.mod.Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Adjacent]
  }
  
  @scala.inline
  def Child(left: SubjectSelector, right: SubjectSelector, `type`: child): typingsSlinky.esquery.mod.Child = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Child]
  }
  
  @scala.inline
  def Descendant(left: SubjectSelector, right: SubjectSelector, `type`: descendant): typingsSlinky.esquery.mod.Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Descendant]
  }
  
  @scala.inline
  def Sibling(left: SubjectSelector, right: SubjectSelector, `type`: sibling): typingsSlinky.esquery.mod.Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Sibling]
  }
}
