package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FJD extends js.Object {
  
  var FJD: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object FJD {
  
  @scala.inline
  def apply(FJD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): FJD = {
    val __obj = js.Dynamic.literal(FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[FJD]
  }
  
  @scala.inline
  implicit class FJDOps[Self <: FJD] (val x: Self) extends AnyVal {
    
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
    def setFJDVarargs(value: String*): Self = this.set("FJD", js.Array(value :_*))
    
    @scala.inline
    def setFJD(value: js.Array[String]): Self = this.set("FJD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
}
