package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvenColor extends StObject {
  
  var evenColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  
  var oddColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  
  var repeat: js.UndefOr[Property] = js.native
}
object EvenColor {
  
  @scala.inline
  def apply(): EvenColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvenColor]
  }
  
  @scala.inline
  implicit class EvenColorMutableBuilder[Self <: EvenColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvenColor(value: typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "evenColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenColorUndefined: Self = StObject.set(x, "evenColor", js.undefined)
    
    @scala.inline
    def setOddColor(value: typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "oddColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOddColorUndefined: Self = StObject.set(x, "oddColor", js.undefined)
    
    @scala.inline
    def setRepeat(value: Property): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
