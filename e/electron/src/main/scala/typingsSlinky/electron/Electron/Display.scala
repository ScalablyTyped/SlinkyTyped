package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.available
import typingsSlinky.electron.electronStrings.unavailable
import typingsSlinky.electron.electronStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Display extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/display
  /**
    * Can be `available`, `unavailable`, `unknown`.
    */
  var accelerometerSupport: available | unavailable | unknown_ = js.native
  
  var bounds: Rectangle = js.native
  
  /**
    * The number of bits per pixel.
    */
  var colorDepth: Double = js.native
  
  /**
    * represent a color space (three-dimensional object which contains all realizable
    * color combinations) for the purpose of color conversions
    */
  var colorSpace: String = js.native
  
  /**
    * The number of bits per color component.
    */
  var depthPerComponent: Double = js.native
  
  /**
    * Unique identifier associated with the display.
    */
  var id: Double = js.native
  
  /**
    * `true` for an internal display and `false` for an external display
    */
  var internal: Boolean = js.native
  
  /**
    * Whether or not the display is a monochrome display.
    */
  var monochrome: Boolean = js.native
  
  /**
    * Can be 0, 90, 180, 270, represents screen rotation in clock-wise degrees.
    */
  var rotation: Double = js.native
  
  /**
    * Output device's pixel scale factor.
    */
  var scaleFactor: Double = js.native
  
  var size: Size = js.native
  
  /**
    * Can be `available`, `unavailable`, `unknown`.
    */
  var touchSupport: available | unavailable | unknown_ = js.native
  
  var workArea: Rectangle = js.native
  
  var workAreaSize: Size = js.native
}
object Display {
  
  @scala.inline
  def apply(
    accelerometerSupport: available | unavailable | unknown_,
    bounds: Rectangle,
    colorDepth: Double,
    colorSpace: String,
    depthPerComponent: Double,
    id: Double,
    internal: Boolean,
    monochrome: Boolean,
    rotation: Double,
    scaleFactor: Double,
    size: Size,
    touchSupport: available | unavailable | unknown_,
    workArea: Rectangle,
    workAreaSize: Size
  ): Display = {
    val __obj = js.Dynamic.literal(accelerometerSupport = accelerometerSupport.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], depthPerComponent = depthPerComponent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], monochrome = monochrome.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], touchSupport = touchSupport.asInstanceOf[js.Any], workArea = workArea.asInstanceOf[js.Any], workAreaSize = workAreaSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit class DisplayMutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerometerSupport(value: available | unavailable | unknown_): Self = StObject.set(x, "accelerometerSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: Rectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDepth(value: Double): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthPerComponent(value: Double): Self = StObject.set(x, "depthPerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonochrome(value: Boolean): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchSupport(value: available | unavailable | unknown_): Self = StObject.set(x, "touchSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkArea(value: Rectangle): Self = StObject.set(x, "workArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAreaSize(value: Size): Self = StObject.set(x, "workAreaSize", value.asInstanceOf[js.Any])
  }
}
