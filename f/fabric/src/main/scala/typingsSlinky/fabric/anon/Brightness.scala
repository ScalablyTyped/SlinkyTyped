package typingsSlinky.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Brightness extends StObject {
  
  /**
    * Value to brighten the image up (0..255)
    * @default 0
    */
  var brightness: Double = js.native
}
object Brightness {
  
  @scala.inline
  def apply(brightness: Double): Brightness = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brightness]
  }
  
  @scala.inline
  implicit class BrightnessMutableBuilder[Self <: Brightness] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
  }
}
