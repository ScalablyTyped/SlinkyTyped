package typingsSlinky.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analog extends StObject {
  
  var analog: js.UndefOr[Hour] = js.native
  
  var digital: js.UndefOr[Text] = js.native
}
object Analog {
  
  @scala.inline
  def apply(): Analog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analog]
  }
  
  @scala.inline
  implicit class AnalogMutableBuilder[Self <: Analog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalog(value: Hour): Self = StObject.set(x, "analog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalogUndefined: Self = StObject.set(x, "analog", js.undefined)
    
    @scala.inline
    def setDigital(value: Text): Self = StObject.set(x, "digital", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitalUndefined: Self = StObject.set(x, "digital", js.undefined)
  }
}
