package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestGridSessionResult extends js.Object {
  /**
    * The TestGridSession that was requested.
    */
  var testGridSession: js.UndefOr[TestGridSession] = js.native
}

object GetTestGridSessionResult {
  @scala.inline
  def apply(): GetTestGridSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestGridSessionResult]
  }
  @scala.inline
  implicit class GetTestGridSessionResultOps[Self <: GetTestGridSessionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestGridSession(value: TestGridSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testGridSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestGridSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testGridSession")(js.undefined)
        ret
    }
  }
  
}

