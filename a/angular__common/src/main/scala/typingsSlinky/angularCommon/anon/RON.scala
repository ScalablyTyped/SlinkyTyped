package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RON extends js.Object {
  
  var AZN: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var RON: js.Array[js.UndefOr[String]] = js.native
  
  var SYP: js.Array[js.UndefOr[String]] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object RON {
  
  @scala.inline
  def apply(
    AZN: js.Array[String],
    JPY: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    SYP: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): RON = {
    val __obj = js.Dynamic.literal(AZN = AZN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], SYP = SYP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[RON]
  }
  
  @scala.inline
  implicit class RONOps[Self <: RON] (val x: Self) extends AnyVal {
    
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
    def setAZNVarargs(value: String*): Self = this.set("AZN", js.Array(value :_*))
    
    @scala.inline
    def setAZN(value: js.Array[String]): Self = this.set("AZN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = this.set("RON", js.Array(value :_*))
    
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSYPVarargs(value: js.UndefOr[String]*): Self = this.set("SYP", js.Array(value :_*))
    
    @scala.inline
    def setSYP(value: js.Array[js.UndefOr[String]]): Self = this.set("SYP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
}
