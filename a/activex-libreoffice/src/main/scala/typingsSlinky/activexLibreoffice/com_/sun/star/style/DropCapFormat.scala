package typingsSlinky.activexLibreoffice.com_.sun.star.style

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This struct describes drop caps at a paragraph object. */
@js.native
trait DropCapFormat extends StObject {
  
  /** This is the number of characters in the drop cap. */
  var Count: Double = js.native
  
  /** This is the distance between the drop cap in the following text. */
  var Distance: Double = js.native
  
  /** This is the number of lines used for a drop cap. */
  var Lines: Double = js.native
}
object DropCapFormat {
  
  @scala.inline
  def apply(Count: Double, Distance: Double, Lines: Double): DropCapFormat = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], Lines = Lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropCapFormat]
  }
  
  @scala.inline
  implicit class DropCapFormatMutableBuilder[Self <: DropCapFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: Double): Self = StObject.set(x, "Lines", value.asInstanceOf[js.Any])
  }
}
