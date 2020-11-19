package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLPerformanceNavigation extends js.Object {
  
  @JSName("MSHTML.IHTMLPerformanceNavigation_typekey")
  var MSHTMLDotIHTMLPerformanceNavigation_typekey: IHTMLPerformanceNavigation = js.native
  
  val redirectCount: Double = js.native
  
  def toJSON(): js.Any = js.native
  
  val `type`: Double = js.native
}
object IHTMLPerformanceNavigation {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLPerformanceNavigation_typekey: IHTMLPerformanceNavigation,
    redirectCount: Double,
    toJSON: () => js.Any,
    `type`: Double
  ): IHTMLPerformanceNavigation = {
    val __obj = js.Dynamic.literal(redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("MSHTML.IHTMLPerformanceNavigation_typekey")(MSHTMLDotIHTMLPerformanceNavigation_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLPerformanceNavigation]
  }
  
  @scala.inline
  implicit class IHTMLPerformanceNavigationOps[Self <: IHTMLPerformanceNavigation] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotIHTMLPerformanceNavigation_typekey(value: IHTMLPerformanceNavigation): Self = this.set("MSHTML.IHTMLPerformanceNavigation_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectCount(value: Double): Self = this.set("redirectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
