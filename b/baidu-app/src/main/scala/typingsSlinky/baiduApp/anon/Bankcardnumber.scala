package typingsSlinky.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bankcardnumber extends StObject {
  
  // 返回结果
  var bank_card_number: String = js.native
  
  // 银行名，不能识别时为空 。
  var bank_card_type: String = js.native
  
  // 银行卡卡号
  var bank_name: String = js.native
}
object Bankcardnumber {
  
  @scala.inline
  def apply(bank_card_number: String, bank_card_type: String, bank_name: String): Bankcardnumber = {
    val __obj = js.Dynamic.literal(bank_card_number = bank_card_number.asInstanceOf[js.Any], bank_card_type = bank_card_type.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankcardnumber]
  }
  
  @scala.inline
  implicit class BankcardnumberMutableBuilder[Self <: Bankcardnumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBank_card_number(value: String): Self = StObject.set(x, "bank_card_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_card_type(value: String): Self = StObject.set(x, "bank_card_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
  }
}
