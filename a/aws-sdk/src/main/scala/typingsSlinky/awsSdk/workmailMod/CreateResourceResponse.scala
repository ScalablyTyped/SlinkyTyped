package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceResponse extends js.Object {
  /**
    * The identifier of the new resource.
    */
  var ResourceId: js.UndefOr[typingsSlinky.awsSdk.workmailMod.ResourceId] = js.native
}

object CreateResourceResponse {
  @scala.inline
  def apply(): CreateResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResourceResponse]
  }
  @scala.inline
  implicit class CreateResourceResponseOps[Self <: CreateResourceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: ResourceId): Self = {
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
  }
  
}

