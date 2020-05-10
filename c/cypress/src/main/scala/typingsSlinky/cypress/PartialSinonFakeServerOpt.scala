package typingsSlinky.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress/types/sinon.SinonFakeServerOptions> */
@js.native
trait PartialSinonFakeServerOpt extends js.Object {
  var autoRespond: js.UndefOr[Boolean] = js.native
  var autoRespondAfter: js.UndefOr[Double] = js.native
  var fakeHTTPMethods: js.UndefOr[Boolean] = js.native
  var respondImmediately: js.UndefOr[Boolean] = js.native
}

object PartialSinonFakeServerOpt {
  @scala.inline
  def apply(): PartialSinonFakeServerOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonFakeServerOpt]
  }
  @scala.inline
  implicit class PartialSinonFakeServerOptOps[Self <: PartialSinonFakeServerOpt] (val x: Self) extends AnyVal {
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

