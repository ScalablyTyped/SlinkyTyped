package typingsSlinky.astring.anon

import typingsSlinky.astring.astringStrings.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `48` extends StObject {
  
  var `type`: Literal = js.native
}
object `48` {
  
  @scala.inline
  def apply(`type`: Literal): `48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`48`]
  }
  
  @scala.inline
  implicit class `48MutableBuilder`[Self <: `48`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
