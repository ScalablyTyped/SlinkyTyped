package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.ObjectTypeInternalSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `226` extends StObject {
  
  var `type`: ObjectTypeInternalSlot = js.native
}
object `226` {
  
  @scala.inline
  def apply(`type`: ObjectTypeInternalSlot): `226` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`226`]
  }
  
  @scala.inline
  implicit class `226MutableBuilder`[Self <: `226`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ObjectTypeInternalSlot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
