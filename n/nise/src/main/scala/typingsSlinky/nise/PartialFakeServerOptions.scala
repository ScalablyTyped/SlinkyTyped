package typingsSlinky.nise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<nise.nise.FakeServerOptions> */
@js.native
trait PartialFakeServerOptions extends js.Object {
  var autoRespond: js.UndefOr[Boolean] = js.native
  var autoRespondAfter: js.UndefOr[Double] = js.native
  var fakeHTTPMethods: js.UndefOr[Boolean] = js.native
  var respondImmediately: js.UndefOr[Boolean] = js.native
}

object PartialFakeServerOptions {
  @scala.inline
  def apply(): PartialFakeServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFakeServerOptions]
  }
  @scala.inline
  implicit class PartialFakeServerOptionsOps[Self <: PartialFakeServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRespond(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRespond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRespond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRespond")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRespondAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRespondAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRespondAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRespondAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withFakeHTTPMethods(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fakeHTTPMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFakeHTTPMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fakeHTTPMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withRespondImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRespondImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondImmediately")(js.undefined)
        ret
    }
  }
  
}

