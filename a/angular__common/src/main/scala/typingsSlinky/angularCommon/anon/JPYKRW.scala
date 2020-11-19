package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JPYKRW extends js.Object {
  
  var AUD: js.Array[String] = js.native
  
  var CNY: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var KRW: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
  
  var XXX: js.Array[scala.Nothing] = js.native
}
object JPYKRW {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    CNY: js.Array[String],
    JPY: js.Array[String],
    KRW: js.Array[String],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): JPYKRW = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYKRW]
  }
  
  @scala.inline
  implicit class JPYKRWOps[Self <: JPYKRW] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = this.set("AUD", js.Array(value :_*))
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = this.set("AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCNYVarargs(value: String*): Self = this.set("CNY", js.Array(value :_*))
    
    @scala.inline
    def setCNY(value: js.Array[String]): Self = this.set("CNY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKRWVarargs(value: String*): Self = this.set("KRW", js.Array(value :_*))
    
    @scala.inline
    def setKRW(value: js.Array[String]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXXXVarargs(value: scala.Nothing*): Self = this.set("XXX", js.Array(value :_*))
    
    @scala.inline
    def setXXX(value: js.Array[scala.Nothing]): Self = this.set("XXX", value.asInstanceOf[js.Any])
  }
}
