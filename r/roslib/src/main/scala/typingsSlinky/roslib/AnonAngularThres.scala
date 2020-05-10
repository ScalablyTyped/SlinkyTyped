package typingsSlinky.roslib

import typingsSlinky.roslib.mod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAngularThres extends js.Object {
  var angularThres: js.UndefOr[Double] = js.native
  var fixedFrame: js.UndefOr[String] = js.native
  var rate: js.UndefOr[Double] = js.native
  var repubServiceName: js.UndefOr[String] = js.native
  var ros: Ros = js.native
  var serverName: js.UndefOr[String] = js.native
  var topicTimeout: js.UndefOr[Double] = js.native
  var transThres: js.UndefOr[Double] = js.native
  var updateDelay: js.UndefOr[Double] = js.native
}

object AnonAngularThres {
  @scala.inline
  def apply(ros: Ros): AnonAngularThres = {
    val __obj = js.Dynamic.literal(ros = ros.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAngularThres]
  }
  @scala.inline
  implicit class AnonAngularThresOps[Self <: AnonAngularThres] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRos(value: Ros): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularThres(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularThres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularThres: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularThres")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedFrame(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.undefined)
        ret
    }
    @scala.inline
    def withRepubServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repubServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepubServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repubServiceName")(js.undefined)
        ret
    }
    @scala.inline
    def withServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransThres(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transThres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransThres: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transThres")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDelay")(js.undefined)
        ret
    }
  }
  
}

