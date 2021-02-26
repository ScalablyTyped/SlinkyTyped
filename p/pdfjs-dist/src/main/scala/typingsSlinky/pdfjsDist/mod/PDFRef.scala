package typingsSlinky.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFRef extends StObject {
  
  var gen: js.Any = js.native
  
  var num: Double = js.native
}
object PDFRef {
  
  @scala.inline
  def apply(gen: js.Any, num: Double): PDFRef = {
    val __obj = js.Dynamic.literal(gen = gen.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFRef]
  }
  
  @scala.inline
  implicit class PDFRefMutableBuilder[Self <: PDFRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGen(value: js.Any): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
  }
}
