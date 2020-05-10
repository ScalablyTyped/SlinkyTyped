package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListLanguagesResponse extends js.Object {
  var C: Double = js.native
  var Python: Double = js.native
}

object ReposListLanguagesResponse {
  @scala.inline
  def apply(C: Double, Python: Double): ReposListLanguagesResponse = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], Python = Python.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListLanguagesResponse]
  }
  @scala.inline
  implicit class ReposListLanguagesResponseOps[Self <: ReposListLanguagesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPython(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Python")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

