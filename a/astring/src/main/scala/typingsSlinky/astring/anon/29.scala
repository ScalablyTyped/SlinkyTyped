package typingsSlinky.astring.anon

import typingsSlinky.astring.astringStrings.BinaryExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `29` extends StObject {
  
  var `type`: BinaryExpression = js.native
}
object `29` {
  
  @scala.inline
  def apply(`type`: BinaryExpression): `29` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit class `29MutableBuilder`[Self <: `29`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BinaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
