package typingsSlinky.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathJSON extends StObject {
  
  var fixPrefix: js.UndefOr[Boolean] = js.native
  
  var mathjs: js.UndefOr[String] = js.native
  
  var unit: String = js.native
  
  var value: Double = js.native
}
object MathJSON {
  
  @scala.inline
  def apply(unit: String, value: Double): MathJSON = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathJSON]
  }
  
  @scala.inline
  implicit class MathJSONMutableBuilder[Self <: MathJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixPrefix(value: Boolean): Self = StObject.set(x, "fixPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixPrefixUndefined: Self = StObject.set(x, "fixPrefix", js.undefined)
    
    @scala.inline
    def setMathjs(value: String): Self = StObject.set(x, "mathjs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMathjsUndefined: Self = StObject.set(x, "mathjs", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
