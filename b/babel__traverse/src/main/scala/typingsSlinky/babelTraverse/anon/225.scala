package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.ClassBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `225` extends StObject {
  
  var `type`: ClassBody = js.native
}
object `225` {
  
  @scala.inline
  def apply(`type`: ClassBody): `225` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`225`]
  }
  
  @scala.inline
  implicit class `225MutableBuilder`[Self <: `225`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ClassBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
