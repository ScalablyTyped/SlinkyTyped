package typingsSlinky.reactVis.anon

import typingsSlinky.reactVis.reactVisStrings.horizontal
import typingsSlinky.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HORIZONTAL_ extends StObject {
  
  var HORIZONTAL: horizontal = js.native
  
  var VERTICAL: vertical = js.native
}
object HORIZONTAL_ {
  
  @scala.inline
  def apply(HORIZONTAL: horizontal, VERTICAL: vertical): HORIZONTAL_ = {
    val __obj = js.Dynamic.literal(HORIZONTAL = HORIZONTAL.asInstanceOf[js.Any], VERTICAL = VERTICAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[HORIZONTAL_]
  }
  
  @scala.inline
  implicit class HORIZONTAL_MutableBuilder[Self <: HORIZONTAL_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHORIZONTAL(value: horizontal): Self = StObject.set(x, "HORIZONTAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERTICAL(value: vertical): Self = StObject.set(x, "VERTICAL", value.asInstanceOf[js.Any])
  }
}
