package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttachedPoliciesResponse extends js.Object {
  /**
    * The token to retrieve the next set of results, or ``null`` if there are no more results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The policies.
    */
  var policies: js.UndefOr[Policies] = js.native
}

object ListAttachedPoliciesResponse {
  @scala.inline
  def apply(): ListAttachedPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttachedPoliciesResponse]
  }
  @scala.inline
  implicit class ListAttachedPoliciesResponseOps[Self <: ListAttachedPoliciesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicies(value: Policies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(js.undefined)
        ret
    }
  }
  
}

