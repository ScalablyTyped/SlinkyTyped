package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a homogeneous matrix by three homogeneous lines */
@js.native
trait HomogenMatrix3 extends StObject {
  
  var Line1: HomogenMatrixLine3 = js.native
  
  var Line2: HomogenMatrixLine3 = js.native
  
  var Line3: HomogenMatrixLine3 = js.native
}
object HomogenMatrix3 {
  
  @scala.inline
  def apply(Line1: HomogenMatrixLine3, Line2: HomogenMatrixLine3, Line3: HomogenMatrixLine3): HomogenMatrix3 = {
    val __obj = js.Dynamic.literal(Line1 = Line1.asInstanceOf[js.Any], Line2 = Line2.asInstanceOf[js.Any], Line3 = Line3.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrix3]
  }
  
  @scala.inline
  implicit class HomogenMatrix3MutableBuilder[Self <: HomogenMatrix3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine1(value: HomogenMatrixLine3): Self = StObject.set(x, "Line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2(value: HomogenMatrixLine3): Self = StObject.set(x, "Line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine3(value: HomogenMatrixLine3): Self = StObject.set(x, "Line3", value.asInstanceOf[js.Any])
  }
}
