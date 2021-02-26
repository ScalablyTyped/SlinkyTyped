package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.Asterisk
import typingsSlinky.esquery.esqueryStrings.wildcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wildcard
  extends SubjectSelectorAtom
     with Selector
     with SubjectSelector {
  
  @JSName("type")
  var type_Wildcard: wildcard = js.native
  
  var value: Asterisk = js.native
}
object Wildcard {
  
  @scala.inline
  def apply(`type`: wildcard, value: Asterisk): Wildcard = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wildcard]
  }
  
  @scala.inline
  implicit class WildcardMutableBuilder[Self <: Wildcard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: wildcard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Asterisk): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
