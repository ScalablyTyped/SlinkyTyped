package typingsSlinky.nwJs.mod.global.NWJSHelpers

import typingsSlinky.nwJs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * nw.Screen screen object
  */
@js.native
trait screen extends StObject {
  
  /**
    * Physical screen resolution, can be negative, not necessarily start from 0,depending on screen arrangement
    */
  var bounds: Height = js.native
  
  /**
    * Unique id for a screen
    */
  var id: Double = js.native
  
  var isBuiltIn: Boolean = js.native
  
  var rotation: Double = js.native
  
  var scaleFactor: Double = js.native
  
  var touchSupport: Double = js.native
  
  /**
    * Useable area within the screen bound
    */
  var work_area: Height = js.native
}
object screen {
  
  @scala.inline
  def apply(
    bounds: Height,
    id: Double,
    isBuiltIn: Boolean,
    rotation: Double,
    scaleFactor: Double,
    touchSupport: Double,
    work_area: Height
  ): screen = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBuiltIn = isBuiltIn.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], touchSupport = touchSupport.asInstanceOf[js.Any], work_area = work_area.asInstanceOf[js.Any])
    __obj.asInstanceOf[screen]
  }
  
  @scala.inline
  implicit class screenMutableBuilder[Self <: screen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Height): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBuiltIn(value: Boolean): Self = StObject.set(x, "isBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchSupport(value: Double): Self = StObject.set(x, "touchSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWork_area(value: Height): Self = StObject.set(x, "work_area", value.asInstanceOf[js.Any])
  }
}
