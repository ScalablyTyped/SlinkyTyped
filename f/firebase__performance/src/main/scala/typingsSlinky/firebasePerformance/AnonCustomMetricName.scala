package typingsSlinky.firebasePerformance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomMetricName extends js.Object {
  var customMetricName: String = js.native
}

object AnonCustomMetricName {
  @scala.inline
  def apply(customMetricName: String): AnonCustomMetricName = {
    val __obj = js.Dynamic.literal(customMetricName = customMetricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomMetricName]
  }
  @scala.inline
  implicit class AnonCustomMetricNameOps[Self <: AnonCustomMetricName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomMetricName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetricName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

