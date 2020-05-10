package typingsSlinky.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetExpectCtConfiguration extends js.Object {
  var enforce: js.UndefOr[Boolean] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var reportUri: js.UndefOr[String] = js.native
}

object IHelmetExpectCtConfiguration {
  @scala.inline
  def apply(): IHelmetExpectCtConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetExpectCtConfiguration]
  }
  @scala.inline
  implicit class IHelmetExpectCtConfigurationOps[Self <: IHelmetExpectCtConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnforce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withReportUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(js.undefined)
        ret
    }
  }
  
}

