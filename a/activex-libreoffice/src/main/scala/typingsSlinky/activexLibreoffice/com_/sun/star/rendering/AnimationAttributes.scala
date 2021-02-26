package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains attributes needed to run an animation.
  * @since OOo 2.0
  */
@js.native
trait AnimationAttributes extends StObject {
  
  var Duration: Double = js.native
  
  /**
    * Repeat mode of the animation sequence.
    *
    * This value determines how the [0,1] parameter space of the animation should be swept through. Permissible values are given in {@link AnimationRepeat}
    * .
    * @see AnimationRepeat.
    */
  var RepeatMode: Double = js.native
  
  /**
    * Size of the untransformed animation sequence.
    *
    * This value specifies the size of the animation when rendered with the identity view transform. This permits e.g. {@link XSprite} implementations to
    * cache rendered animation content in finite-sized bitmaps.
    */
  var UntransformedSize: RealSize2D = js.native
}
object AnimationAttributes {
  
  @scala.inline
  def apply(Duration: Double, RepeatMode: Double, UntransformedSize: RealSize2D): AnimationAttributes = {
    val __obj = js.Dynamic.literal(Duration = Duration.asInstanceOf[js.Any], RepeatMode = RepeatMode.asInstanceOf[js.Any], UntransformedSize = UntransformedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAttributes]
  }
  
  @scala.inline
  implicit class AnimationAttributesMutableBuilder[Self <: AnimationAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatMode(value: Double): Self = StObject.set(x, "RepeatMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntransformedSize(value: RealSize2D): Self = StObject.set(x, "UntransformedSize", value.asInstanceOf[js.Any])
  }
}
