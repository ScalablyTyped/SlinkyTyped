package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#core/animation
  *
  */
@js.native
trait AnimationFitOptions extends StObject {
  
  var eles: CollectionArgument | Selector = js.native
  
  // to which the viewport will be fitted.
  var padding: Double = js.native
}
object AnimationFitOptions {
  
  @scala.inline
  def apply(eles: CollectionArgument | Selector, padding: Double): AnimationFitOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationFitOptions]
  }
  
  @scala.inline
  implicit class AnimationFitOptionsMutableBuilder[Self <: AnimationFitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEles(value: CollectionArgument | Selector): Self = StObject.set(x, "eles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
