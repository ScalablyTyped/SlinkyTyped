package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TWDTZS extends js.Object {
  
  var JPY: js.Array[String] = js.native
  
  var KES: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
  
  var TZS: js.Array[String] = js.native
}
object TWDTZS {
  
  @scala.inline
  def apply(
    JPY: js.Array[String],
    KES: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    TZS: js.Array[String]
  ): TWDTZS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], TZS = TZS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TWDTZS]
  }
  
  @scala.inline
  implicit class TWDTZSOps[Self <: TWDTZS] (val x: Self) extends AnyVal {
    
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
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKESVarargs(value: String*): Self = this.set("KES", js.Array(value :_*))
    
    @scala.inline
    def setKES(value: js.Array[String]): Self = this.set("KES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTZSVarargs(value: String*): Self = this.set("TZS", js.Array(value :_*))
    
    @scala.inline
    def setTZS(value: js.Array[String]): Self = this.set("TZS", value.asInstanceOf[js.Any])
  }
}
