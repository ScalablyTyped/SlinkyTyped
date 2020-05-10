package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInvalidationResult extends js.Object {
  /**
    * The invalidation's information.
    */
  var Invalidation: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.Invalidation] = js.native
  /**
    * The fully qualified URI of the distribution and invalidation batch request, including the Invalidation ID.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateInvalidationResult {
  @scala.inline
  def apply(): CreateInvalidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInvalidationResult]
  }
  @scala.inline
  implicit class CreateInvalidationResultOps[Self <: CreateInvalidationResult] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(js.undefined)
        ret
    }
  }
  
}

