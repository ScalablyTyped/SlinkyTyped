package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEasingFunction extends StObject {
  
  /**
    * Given an input gradient between 0 and 1, this returns the corrseponding value
    * of the easing function.
    * The link below provides some of the most common examples of easing functions.
    * @see https://easings.net/
    * @param gradient Defines the value between 0 and 1 we want the easing value for
    * @returns the corresponding value on the curve defined by the easing function
    */
  def ease(gradient: Double): Double = js.native
}
object IEasingFunction {
  
  @scala.inline
  def apply(ease: Double => Double): IEasingFunction = {
    val __obj = js.Dynamic.literal(ease = js.Any.fromFunction1(ease))
    __obj.asInstanceOf[IEasingFunction]
  }
  
  @scala.inline
  implicit class IEasingFunctionMutableBuilder[Self <: IEasingFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEase(value: Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
  }
}
