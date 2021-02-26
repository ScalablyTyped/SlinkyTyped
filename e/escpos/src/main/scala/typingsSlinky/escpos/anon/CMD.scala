package typingsSlinky.escpos.anon

import typingsSlinky.escpos.escposNumbers.`12`
import typingsSlinky.escpos.escposNumbers.`24`
import typingsSlinky.escpos.escposStrings.EscapeNumbersignNumbersignQPIX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CMD extends StObject {
  
  var CMD: EscapeNumbersignNumbersignQPIX = js.native
  
  var DEFAULT: `12` = js.native
  
  var MAX: `24` = js.native
  
  var MIN: typingsSlinky.escpos.escposNumbers.`1` = js.native
}
object CMD {
  
  @scala.inline
  def apply(
    CMD: EscapeNumbersignNumbersignQPIX,
    DEFAULT: `12`,
    MAX: `24`,
    MIN: typingsSlinky.escpos.escposNumbers.`1`
  ): CMD = {
    val __obj = js.Dynamic.literal(CMD = CMD.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMD]
  }
  
  @scala.inline
  implicit class CMDMutableBuilder[Self <: CMD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCMD(value: EscapeNumbersignNumbersignQPIX): Self = StObject.set(x, "CMD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEFAULT(value: `12`): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAX(value: `24`): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIN(value: typingsSlinky.escpos.escposNumbers.`1`): Self = StObject.set(x, "MIN", value.asInstanceOf[js.Any])
  }
}
