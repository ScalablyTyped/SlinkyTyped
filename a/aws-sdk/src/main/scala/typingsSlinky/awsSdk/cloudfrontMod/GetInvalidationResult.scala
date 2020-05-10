package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvalidationResult extends js.Object {
  /**
    * The invalidation's information. For more information, see Invalidation Complex Type. 
    */
  var Invalidation: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.Invalidation] = js.native
}

object GetInvalidationResult {
  @scala.inline
  def apply(): GetInvalidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInvalidationResult]
  }
  @scala.inline
  implicit class GetInvalidationResultOps[Self <: GetInvalidationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidation(value: Invalidation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invalidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invalidation")(js.undefined)
        ret
    }
  }
  
}

