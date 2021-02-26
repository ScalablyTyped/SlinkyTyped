package typingsSlinky.primereact.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delta extends StObject {
  
  var delta: Double = js.native
  
  var element: HTMLElement = js.native
}
object Delta {
  
  @scala.inline
  def apply(delta: Double, element: HTMLElement): Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  @scala.inline
  implicit class DeltaMutableBuilder[Self <: Delta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
