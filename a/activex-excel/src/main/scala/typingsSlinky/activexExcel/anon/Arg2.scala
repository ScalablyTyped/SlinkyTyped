package typingsSlinky.activexExcel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arg2 extends StObject {
  
  val Arg1: Double = js.native
  
  val Arg2: Double = js.native
  
  val ElementID: Double = js.native
}
object Arg2 {
  
  @scala.inline
  def apply(Arg1: Double, Arg2: Double, ElementID: Double): Arg2 = {
    val __obj = js.Dynamic.literal(Arg1 = Arg1.asInstanceOf[js.Any], Arg2 = Arg2.asInstanceOf[js.Any], ElementID = ElementID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arg2]
  }
  
  @scala.inline
  implicit class Arg2MutableBuilder[Self <: Arg2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArg1(value: Double): Self = StObject.set(x, "Arg1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArg2(value: Double): Self = StObject.set(x, "Arg2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementID(value: Double): Self = StObject.set(x, "ElementID", value.asInstanceOf[js.Any])
  }
}
