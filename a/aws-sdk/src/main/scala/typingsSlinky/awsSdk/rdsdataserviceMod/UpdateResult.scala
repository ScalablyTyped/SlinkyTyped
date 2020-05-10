package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResult extends js.Object {
  /**
    * Values for fields generated during the request.
    */
  var generatedFields: js.UndefOr[FieldList] = js.native
}

object UpdateResult {
  @scala.inline
  def apply(): UpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResult]
  }
  @scala.inline
  implicit class UpdateResultOps[Self <: UpdateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneratedFields(value: FieldList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratedFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedFields")(js.undefined)
        ret
    }
  }
  
}

