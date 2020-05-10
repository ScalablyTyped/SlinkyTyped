package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSuiteResult extends js.Object {
  /**
    * A collection of one or more tests.
    */
  var suite: js.UndefOr[Suite] = js.native
}

object GetSuiteResult {
  @scala.inline
  def apply(): GetSuiteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSuiteResult]
  }
  @scala.inline
  implicit class GetSuiteResultOps[Self <: GetSuiteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuite(value: Suite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(js.undefined)
        ret
    }
  }
  
}

