package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISample extends js.Object {
  /**
    * Sample rate
    */
  var sampleRate: Double = js.native
}

object ISample {
  @scala.inline
  def apply(sampleRate: Double): ISample = {
    val __obj = js.Dynamic.literal(sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISample]
  }
  @scala.inline
  implicit class ISampleOps[Self <: ISample] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

