package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
@js.native
trait EnhancedCustomShapeTextPath extends StObject {
  
  /** This property specifies if the text is scaled using the shape path. */
  var ScaleX: Boolean = js.native
  
  /** This property specifies if a text path is used. The default is false. */
  var TextPath: Boolean = js.native
  
  /** This property specifies how the text is drawn. */
  var TextPathMode: EnhancedCustomShapeTextPathMode = js.native
}
object EnhancedCustomShapeTextPath {
  
  @scala.inline
  def apply(ScaleX: Boolean, TextPath: Boolean, TextPathMode: EnhancedCustomShapeTextPathMode): EnhancedCustomShapeTextPath = {
    val __obj = js.Dynamic.literal(ScaleX = ScaleX.asInstanceOf[js.Any], TextPath = TextPath.asInstanceOf[js.Any], TextPathMode = TextPathMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeTextPath]
  }
  
  @scala.inline
  implicit class EnhancedCustomShapeTextPathMutableBuilder[Self <: EnhancedCustomShapeTextPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleX(value: Boolean): Self = StObject.set(x, "ScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPath(value: Boolean): Self = StObject.set(x, "TextPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPathMode(value: EnhancedCustomShapeTextPathMode): Self = StObject.set(x, "TextPathMode", value.asInstanceOf[js.Any])
  }
}
