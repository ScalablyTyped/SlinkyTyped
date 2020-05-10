package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationExceptionResourceKey extends js.Object {
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var ResourceId: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * The type of a resource.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object RemediationExceptionResourceKey {
  @scala.inline
  def apply(): RemediationExceptionResourceKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExceptionResourceKey]
  }
  @scala.inline
  implicit class RemediationExceptionResourceKeyOps[Self <: RemediationExceptionResourceKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: StringWithCharLimit1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

