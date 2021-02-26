package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.arraydraw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Padding extends StObject {
  
  /**
    * The amount of padding (in px) along the bottom of the component.
    */
  var b: Double = js.native
  
  var editType: arraydraw = js.native
  
  /**
    * The amount of padding (in px) on the left side of the component.
    */
  var l: Double = js.native
  
  /**
    * The amount of padding (in px) on the right side of the component.
    */
  var r: Double = js.native
  
  /**
    * The amount of padding (in px) along the top of the component.
    */
  var t: Double = js.native
}
object Padding {
  
  @scala.inline
  def apply(b: Double, editType: arraydraw, l: Double, r: Double, t: Double): Padding = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], editType = editType.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit class PaddingMutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditType(value: arraydraw): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
