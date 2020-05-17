package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLPerformance extends js.Object {
  @JSName("MSHTML.HTMLPerformance_typekey")
  var MSHTMLDotHTMLPerformance_typekey: HTMLPerformance = js.native
  val navigation: IHTMLPerformanceNavigation = js.native
  val timing: IHTMLPerformanceTiming = js.native
  def toJSON(): js.Any = js.native
}

object HTMLPerformance {
  @scala.inline
  def apply(
    MSHTMLDotHTMLPerformance_typekey: HTMLPerformance,
    navigation: IHTMLPerformanceNavigation,
    timing: IHTMLPerformanceTiming,
    toJSON: () => js.Any
  ): HTMLPerformance = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("MSHTML.HTMLPerformance_typekey")(MSHTMLDotHTMLPerformance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPerformance]
  }
  @scala.inline
  implicit class HTMLPerformanceOps[Self <: HTMLPerformance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLPerformance_typekey(value: HTMLPerformance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLPerformance_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigation(value: IHTMLPerformanceNavigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiming(value: IHTMLPerformanceTiming): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

