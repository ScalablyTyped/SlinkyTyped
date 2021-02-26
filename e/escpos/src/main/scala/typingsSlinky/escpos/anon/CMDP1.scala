package typingsSlinky.escpos.anon

import typingsSlinky.escpos.escposStrings.InformationseparatorthreeLeftparenthesisk
import typingsSlinky.escpos.escposStrings.`1P0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CMDP1 extends StObject {
  
  // Format= CMD_P1{LEN_2BYTE}CMD_P2{DATA}
  // DATA Max Length= 256*256 - 3 (65533)
  var CMD_P1: InformationseparatorthreeLeftparenthesisk = js.native
  
  var CMD_P2: `1P0` = js.native
}
object CMDP1 {
  
  @scala.inline
  def apply(CMD_P1: InformationseparatorthreeLeftparenthesisk, CMD_P2: `1P0`): CMDP1 = {
    val __obj = js.Dynamic.literal(CMD_P1 = CMD_P1.asInstanceOf[js.Any], CMD_P2 = CMD_P2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMDP1]
  }
  
  @scala.inline
  implicit class CMDP1MutableBuilder[Self <: CMDP1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCMD_P1(value: InformationseparatorthreeLeftparenthesisk): Self = StObject.set(x, "CMD_P1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCMD_P2(value: `1P0`): Self = StObject.set(x, "CMD_P2", value.asInstanceOf[js.Any])
  }
}
