package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.NumericLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `210` extends StObject {
  
  var `type`: NumericLiteral = js.native
}
object `210` {
  
  @scala.inline
  def apply(`type`: NumericLiteral): `210` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`210`]
  }
  
  @scala.inline
  implicit class `210MutableBuilder`[Self <: `210`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
