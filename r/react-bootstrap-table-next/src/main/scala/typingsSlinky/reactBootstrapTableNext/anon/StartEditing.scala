package typingsSlinky.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartEditing extends StObject {
  
  def startEditing(rowIndex: Double, columnIndex: Double): Unit = js.native
}
object StartEditing {
  
  @scala.inline
  def apply(startEditing: (Double, Double) => Unit): StartEditing = {
    val __obj = js.Dynamic.literal(startEditing = js.Any.fromFunction2(startEditing))
    __obj.asInstanceOf[StartEditing]
  }
  
  @scala.inline
  implicit class StartEditingMutableBuilder[Self <: StartEditing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartEditing(value: (Double, Double) => Unit): Self = StObject.set(x, "startEditing", js.Any.fromFunction2(value))
  }
}
