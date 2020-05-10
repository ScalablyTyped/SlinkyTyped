package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInputResponse extends js.Object {
  /**
    * Information about the configuration of the input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.native
}

object UpdateInputResponse {
  @scala.inline
  def apply(): UpdateInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInputResponse]
  }
  @scala.inline
  implicit class UpdateInputResponseOps[Self <: UpdateInputResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputConfiguration(value: InputConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfiguration")(js.undefined)
        ret
    }
  }
  
}

