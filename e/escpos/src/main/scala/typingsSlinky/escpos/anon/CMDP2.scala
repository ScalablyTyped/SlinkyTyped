package typingsSlinky.escpos.anon

import typingsSlinky.escpos.escposStrings.InformationseparatorthreeLeftparenthesisk
import typingsSlinky.escpos.escposStrings.`1Q0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CMDP2 extends StObject {
  
  // Format= CMD_P1{LEN_2BYTE}CMD_P2
  var CMD_P1: InformationseparatorthreeLeftparenthesisk = js.native
  
  var CMD_P2: `1Q0` = js.native
}
object CMDP2 {
  
  @scala.inline
  def apply(CMD_P1: InformationseparatorthreeLeftparenthesisk, CMD_P2: `1Q0`): CMDP2 = {
    val __obj = js.Dynamic.literal(CMD_P1 = CMD_P1.asInstanceOf[js.Any], CMD_P2 = CMD_P2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMDP2]
  }
  
  @scala.inline
  implicit class CMDP2MutableBuilder[Self <: CMDP2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCMD_P1(value: InformationseparatorthreeLeftparenthesisk): Self = StObject.set(x, "CMD_P1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCMD_P2(value: `1Q0`): Self = StObject.set(x, "CMD_P2", value.asInstanceOf[js.Any])
  }
}
