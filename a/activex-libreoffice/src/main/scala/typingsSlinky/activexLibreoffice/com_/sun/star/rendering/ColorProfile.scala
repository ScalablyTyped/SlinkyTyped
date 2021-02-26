package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorProfile extends StObject {
  
  var dummy: Double = js.native
}
object ColorProfile {
  
  @scala.inline
  def apply(dummy: Double): ColorProfile = {
    val __obj = js.Dynamic.literal(dummy = dummy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProfile]
  }
  
  @scala.inline
  implicit class ColorProfileMutableBuilder[Self <: ColorProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDummy(value: Double): Self = StObject.set(x, "dummy", value.asInstanceOf[js.Any])
  }
}
