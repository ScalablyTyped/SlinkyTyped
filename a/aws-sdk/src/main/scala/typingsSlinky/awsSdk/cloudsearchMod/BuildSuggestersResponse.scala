package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildSuggestersResponse extends js.Object {
  var FieldNames: js.UndefOr[FieldNameList] = js.native
}

object BuildSuggestersResponse {
  @scala.inline
  def apply(): BuildSuggestersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSuggestersResponse]
  }
  @scala.inline
  implicit class BuildSuggestersResponseOps[Self <: BuildSuggestersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldNames(value: FieldNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldNames")(js.undefined)
        ret
    }
  }
  
}

