package typingsSlinky.firebasePerformance.apiServiceMod._Global_

import typingsSlinky.firebasePerformance.AnonInstantiable
import typingsSlinky.firebasePerformance.AnonOnFirstInputDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var PerformanceObserver: AnonInstantiable = js.native
  var perfMetrics: js.UndefOr[AnonOnFirstInputDelay] = js.native
}

object Window {
  @scala.inline
  def apply(PerformanceObserver: AnonInstantiable): Window = {
    val __obj = js.Dynamic.literal(PerformanceObserver = PerformanceObserver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerformanceObserver(value: AnonInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformanceObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerfMetrics(value: AnonOnFirstInputDelay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfMetrics")(js.undefined)
        ret
    }
  }
  
}

