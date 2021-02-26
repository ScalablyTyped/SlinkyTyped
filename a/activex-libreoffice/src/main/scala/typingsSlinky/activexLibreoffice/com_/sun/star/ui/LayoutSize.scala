package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Size used for layouting windows. It specifies a range of valid values and a preferred value. The values must not violate the relation 0 <&#61; Minimum
  * <&#61; Preferred <&#61; Maximum.
  * @param Minimum Zero or positive. The value itself is included in the valid range.
  * @param Maximum A value larger than or equal to Minimum. The special value -1 means that there is no upper bound. Every value larger than or equal to Min
  * @param Preferred The preferred size inside the valid range.
  */
@js.native
trait LayoutSize extends StObject {
  
  var Maximum: Double = js.native
  
  var Minimum: Double = js.native
  
  var Preferred: Double = js.native
}
object LayoutSize {
  
  @scala.inline
  def apply(Maximum: Double, Minimum: Double, Preferred: Double): LayoutSize = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any], Preferred = Preferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutSize]
  }
  
  @scala.inline
  implicit class LayoutSizeMutableBuilder[Self <: LayoutSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferred(value: Double): Self = StObject.set(x, "Preferred", value.asInstanceOf[js.Any])
  }
}
