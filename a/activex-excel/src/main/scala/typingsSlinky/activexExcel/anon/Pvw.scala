package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.ProtectedViewWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pvw extends StObject {
  
  val Pvw: ProtectedViewWindow = js.native
}
object Pvw {
  
  @scala.inline
  def apply(Pvw: ProtectedViewWindow): Pvw = {
    val __obj = js.Dynamic.literal(Pvw = Pvw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pvw]
  }
  
  @scala.inline
  implicit class PvwMutableBuilder[Self <: Pvw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPvw(value: ProtectedViewWindow): Self = StObject.set(x, "Pvw", value.asInstanceOf[js.Any])
  }
}
