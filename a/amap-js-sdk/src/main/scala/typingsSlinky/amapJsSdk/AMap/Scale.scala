package typingsSlinky.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scale
  extends EventBindable
     with MapControl {
  
  var offset: Pixel = js.native
  
  var position: String = js.native
}
object Scale {
  
  @scala.inline
  def apply(
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    offset: Pixel,
    on: (String, EventCallback) => Unit,
    position: String,
    show: () => Unit
  ): Scale = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), offset = offset.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), position = position.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
