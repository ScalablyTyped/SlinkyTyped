package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.Chart
import typingsSlinky.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sh extends StObject {
  
  val Sh: Chart | Worksheet = js.native
}
object Sh {
  
  @scala.inline
  def apply(Sh: Chart | Worksheet): Sh = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sh]
  }
  
  @scala.inline
  implicit class ShMutableBuilder[Self <: Sh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSh(value: Chart | Worksheet): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
  }
}
