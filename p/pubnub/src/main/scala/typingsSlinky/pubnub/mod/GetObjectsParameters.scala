package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.CustomFields
import typingsSlinky.pubnub.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectsParameters extends js.Object {
  var include: js.UndefOr[CustomFields] = js.native
  var limit: js.UndefOr[Double] = js.native
  var page: js.UndefOr[Next] = js.native
}

object GetObjectsParameters {
  @scala.inline
  def apply(): GetObjectsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectsParameters]
  }
  @scala.inline
  implicit class GetObjectsParametersOps[Self <: GetObjectsParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclude(value: CustomFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Next): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
  }
  
}

