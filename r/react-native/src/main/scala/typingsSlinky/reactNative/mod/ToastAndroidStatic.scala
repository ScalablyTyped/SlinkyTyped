package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastAndroidStatic extends StObject {
  
  var BOTTOM: Double = js.native
  
  var CENTER: Double = js.native
  
  var LONG: Double = js.native
  
  // Toast duration constants
  var SHORT: Double = js.native
  
  // Toast gravity constants
  var TOP: Double = js.native
  
  /**
    * String message: A string with the text to toast
    * int duration: The duration of the toast.
    * May be ToastAndroid.SHORT or ToastAndroid.LONG
    */
  def show(message: String, duration: Double): Unit = js.native
  
  /** `gravity` may be ToastAndroid.TOP, ToastAndroid.BOTTOM, ToastAndroid.CENTER */
  def showWithGravity(message: String, duration: Double, gravity: Double): Unit = js.native
  
  def showWithGravityAndOffset(message: String, duration: Double, gravity: Double, xOffset: Double, yOffset: Double): Unit = js.native
}
object ToastAndroidStatic {
  
  @scala.inline
  def apply(
    BOTTOM: Double,
    CENTER: Double,
    LONG: Double,
    SHORT: Double,
    TOP: Double,
    show: (String, Double) => Unit,
    showWithGravity: (String, Double, Double) => Unit,
    showWithGravityAndOffset: (String, Double, Double, Double, Double) => Unit
  ): ToastAndroidStatic = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], CENTER = CENTER.asInstanceOf[js.Any], LONG = LONG.asInstanceOf[js.Any], SHORT = SHORT.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], show = js.Any.fromFunction2(show), showWithGravity = js.Any.fromFunction3(showWithGravity), showWithGravityAndOffset = js.Any.fromFunction5(showWithGravityAndOffset))
    __obj.asInstanceOf[ToastAndroidStatic]
  }
  
  @scala.inline
  implicit class ToastAndroidStaticMutableBuilder[Self <: ToastAndroidStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBOTTOM(value: Double): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCENTER(value: Double): Self = StObject.set(x, "CENTER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLONG(value: Double): Self = StObject.set(x, "LONG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHORT(value: Double): Self = StObject.set(x, "SHORT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: (String, Double) => Unit): Self = StObject.set(x, "show", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowWithGravity(value: (String, Double, Double) => Unit): Self = StObject.set(x, "showWithGravity", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShowWithGravityAndOffset(value: (String, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "showWithGravityAndOffset", js.Any.fromFunction5(value))
    
    @scala.inline
    def setTOP(value: Double): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
  }
}
