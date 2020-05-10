package typingsSlinky.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLoggerConfiguration extends js.Object {
  var extendErrorObjects: js.UndefOr[Boolean] = js.native
  var jsonSpace: js.UndefOr[Double] = js.native
  var logFunction: js.UndefOr[js.Function1[/* msg */ js.Any, Unit]] = js.native
}

object RequestLoggerConfiguration {
  @scala.inline
  def apply(): RequestLoggerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLoggerConfiguration]
  }
  @scala.inline
  implicit class RequestLoggerConfigurationOps[Self <: RequestLoggerConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendErrorObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendErrorObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendErrorObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendErrorObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFunction(value: /* msg */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFunction")(js.undefined)
        ret
    }
  }
  
}

