package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLPerformanceTiming extends js.Object {
  @JSName("MSHTML.IHTMLPerformanceTiming_typekey")
  var MSHTMLDotIHTMLPerformanceTiming_typekey: IHTMLPerformanceTiming = js.native
  val connectEnd: Double = js.native
  val connectStart: Double = js.native
  val domComplete: Double = js.native
  val domContentLoadedEventEnd: Double = js.native
  val domContentLoadedEventStart: Double = js.native
  val domInteractive: Double = js.native
  val domLoading: Double = js.native
  val domainLookupEnd: Double = js.native
  val domainLookupStart: Double = js.native
  val fetchStart: Double = js.native
  val loadEventEnd: Double = js.native
  val loadEventStart: Double = js.native
  val msFirstPaint: Double = js.native
  val navigationStart: Double = js.native
  val redirectEnd: Double = js.native
  val redirectStart: Double = js.native
  val requestStart: Double = js.native
  val responseEnd: Double = js.native
  val responseStart: Double = js.native
  val unloadEventEnd: Double = js.native
  val unloadEventStart: Double = js.native
  def toJSON(): js.Any = js.native
}

object IHTMLPerformanceTiming {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLPerformanceTiming_typekey: IHTMLPerformanceTiming,
    connectEnd: Double,
    connectStart: Double,
    domComplete: Double,
    domContentLoadedEventEnd: Double,
    domContentLoadedEventStart: Double,
    domInteractive: Double,
    domLoading: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    fetchStart: Double,
    loadEventEnd: Double,
    loadEventStart: Double,
    msFirstPaint: Double,
    navigationStart: Double,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    toJSON: () => js.Any,
    unloadEventEnd: Double,
    unloadEventStart: Double
  ): IHTMLPerformanceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domLoading = domLoading.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], msFirstPaint = msFirstPaint.asInstanceOf[js.Any], navigationStart = navigationStart.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLPerformanceTiming_typekey")(MSHTMLDotIHTMLPerformanceTiming_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLPerformanceTiming]
  }
  @scala.inline
  implicit class IHTMLPerformanceTimingOps[Self <: IHTMLPerformanceTiming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLPerformanceTiming_typekey(value: IHTMLPerformanceTiming): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLPerformanceTiming_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomComplete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomContentLoadedEventEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domContentLoadedEventEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomContentLoadedEventStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domContentLoadedEventStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomInteractive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomLoading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainLookupEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainLookupEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainLookupStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainLookupStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadEventEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadEventEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadEventStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadEventStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsFirstPaint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msFirstPaint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnloadEventEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unloadEventEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnloadEventStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unloadEventStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

