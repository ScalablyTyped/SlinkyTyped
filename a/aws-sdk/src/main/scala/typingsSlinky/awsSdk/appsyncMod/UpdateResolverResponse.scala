package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResolverResponse extends js.Object {
  /**
    * The updated Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.native
}

object UpdateResolverResponse {
  @scala.inline
  def apply(): UpdateResolverResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResolverResponse]
  }
  @scala.inline
  implicit class UpdateResolverResponseOps[Self <: UpdateResolverResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolver(value: Resolver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(js.undefined)
        ret
    }
  }
  
}

