package typingsSlinky.astring.anon

import typingsSlinky.astring.astringStrings.ChainExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `60` extends StObject {
  
  var `type`: ChainExpression = js.native
}
object `60` {
  
  @scala.inline
  def apply(`type`: ChainExpression): `60` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`60`]
  }
  
  @scala.inline
  implicit class `60MutableBuilder`[Self <: `60`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ChainExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
