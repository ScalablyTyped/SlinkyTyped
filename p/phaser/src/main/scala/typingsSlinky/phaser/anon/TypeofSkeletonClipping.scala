package typingsSlinky.phaser.anon

import typingsSlinky.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSkeletonClipping extends StObject {
  
  /* static member */
  def makeClockwise(polygon: ArrayLike[Double]): Unit = js.native
}
object TypeofSkeletonClipping {
  
  @scala.inline
  def apply(makeClockwise: ArrayLike[Double] => Unit): TypeofSkeletonClipping = {
    val __obj = js.Dynamic.literal(makeClockwise = js.Any.fromFunction1(makeClockwise))
    __obj.asInstanceOf[TypeofSkeletonClipping]
  }
  
  @scala.inline
  implicit class TypeofSkeletonClippingMutableBuilder[Self <: TypeofSkeletonClipping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMakeClockwise(value: ArrayLike[Double] => Unit): Self = StObject.set(x, "makeClockwise", js.Any.fromFunction1(value))
  }
}
