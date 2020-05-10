package typingsSlinky.axiosMockAdapter.mod

import typingsSlinky.axiosMockAdapter.axiosMockAdapterStrings.passthrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockAdapterOptions extends js.Object {
  var delayResponse: js.UndefOr[Double] = js.native
  var onNoMatch: js.UndefOr[passthrough] = js.native
}

object MockAdapterOptions {
  @scala.inline
  def apply(): MockAdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockAdapterOptions]
  }
  @scala.inline
  implicit class MockAdapterOptionsOps[Self <: MockAdapterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayResponse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNoMatch(value: passthrough): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNoMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnNoMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNoMatch")(js.undefined)
        ret
    }
  }
  
}

