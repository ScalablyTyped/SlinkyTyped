package typingsSlinky.httpCacheSemantics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevalidationPolicy extends js.Object {
  var matches: Boolean = js.native
  /**
    * Boolean indicating whether the response body has changed.
    *
    * - If `false`, then a valid 304 Not Modified response has been received, and you can reuse the old
    * cached response body.
    * - If `true`, you should use new response's body (if present), or make another request to the origin
    * server without any conditional headers (i.e. don't use `revalidationHeaders()` this time) to get
    * the new resource.
    */
  var modified: Boolean = js.native
  /**
    * A new `CachePolicy` with HTTP headers updated from `revalidationResponse`. You can always replace
    * the old cached `CachePolicy` with the new one.
    */
  var policy: CachePolicy = js.native
}

object RevalidationPolicy {
  @scala.inline
  def apply(matches: Boolean, modified: Boolean, policy: CachePolicy): RevalidationPolicy = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevalidationPolicy]
  }
  @scala.inline
  implicit class RevalidationPolicyOps[Self <: RevalidationPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: CachePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

