package typingsSlinky.googleGax.descriptorMod

import typingsSlinky.googleGax.apiCallerMod.APICaller
import typingsSlinky.googleGax.gaxMod.CallSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Descriptor extends js.Object {
  def getApiCaller(settings: CallSettings): APICaller = js.native
}

object Descriptor {
  @scala.inline
  def apply(getApiCaller: CallSettings => APICaller): Descriptor = {
    val __obj = js.Dynamic.literal(getApiCaller = js.Any.fromFunction1(getApiCaller))
    __obj.asInstanceOf[Descriptor]
  }
  @scala.inline
  implicit class DescriptorOps[Self <: Descriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetApiCaller(value: CallSettings => APICaller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApiCaller")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

