package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineStyle extends StObject {
  
  var dash: js.UndefOr[Length] = js.native
}
object LineStyle {
  
  @scala.inline
  def apply(): LineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyle]
  }
  
  @scala.inline
  implicit class LineStyleMutableBuilder[Self <: LineStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDash(value: Length): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
  }
}
