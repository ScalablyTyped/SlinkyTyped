package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLPerformanceNavigation extends js.Object {
  @JSName("MSHTML.HTMLPerformanceNavigation_typekey")
  var MSHTMLDotHTMLPerformanceNavigation_typekey: HTMLPerformanceNavigation = js.native
  val redirectCount: Double = js.native
  val `type`: Double = js.native
  def toJSON(): js.Any = js.native
}

object HTMLPerformanceNavigation {
  @scala.inline
  def apply(
    MSHTMLDotHTMLPerformanceNavigation_typekey: HTMLPerformanceNavigation,
    redirectCount: Double,
    toJSON: () => js.Any,
    `type`: Double
  ): HTMLPerformanceNavigation = {
    val __obj = js.Dynamic.literal(redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("MSHTML.HTMLPerformanceNavigation_typekey")(MSHTMLDotHTMLPerformanceNavigation_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPerformanceNavigation]
  }
  @scala.inline
  implicit class HTMLPerformanceNavigationOps[Self <: HTMLPerformanceNavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLPerformanceNavigation_typekey(value: HTMLPerformanceNavigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLPerformanceNavigation_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

