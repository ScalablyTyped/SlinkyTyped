package typingsSlinky.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interpolation extends StObject {
  
  @JSName("apply")
  def apply(start: Double, end: Double, a: Double): Double = js.native
  
  /* protected */ def applyInternal(a: Double): Double = js.native
}
object Interpolation {
  
  @scala.inline
  def apply(apply: (Double, Double, Double) => Double, applyInternal: Double => Double): Interpolation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), applyInternal = js.Any.fromFunction1(applyInternal))
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  implicit class InterpolationMutableBuilder[Self <: Interpolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: (Double, Double, Double) => Double): Self = StObject.set(x, "apply", js.Any.fromFunction3(value))
    
    @scala.inline
    def setApplyInternal(value: Double => Double): Self = StObject.set(x, "applyInternal", js.Any.fromFunction1(value))
  }
}
