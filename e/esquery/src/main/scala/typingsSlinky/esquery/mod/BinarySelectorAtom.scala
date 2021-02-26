package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.adjacent
import typingsSlinky.esquery.esqueryStrings.child
import typingsSlinky.esquery.esqueryStrings.descendant
import typingsSlinky.esquery.esqueryStrings.sibling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinarySelectorAtom extends SubjectSelectorAtom {
  
  var left: SubjectSelector = js.native
  
  var right: SubjectSelector = js.native
  
  @JSName("type")
  var type_BinarySelectorAtom: child | sibling | adjacent | descendant = js.native
}
object BinarySelectorAtom {
  
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector, `type`: child | sibling | adjacent | descendant): BinarySelectorAtom = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelectorAtom]
  }
  
  @scala.inline
  implicit class BinarySelectorAtomMutableBuilder[Self <: BinarySelectorAtom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: SubjectSelector): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: SubjectSelector): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: child | sibling | adjacent | descendant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
