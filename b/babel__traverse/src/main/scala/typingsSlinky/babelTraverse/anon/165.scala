package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.ConditionalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `165` extends StObject {
  
  var `type`: ConditionalExpression = js.native
}
object `165` {
  
  @scala.inline
  def apply(`type`: ConditionalExpression): `165` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`165`]
  }
  
  @scala.inline
  implicit class `165MutableBuilder`[Self <: `165`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
