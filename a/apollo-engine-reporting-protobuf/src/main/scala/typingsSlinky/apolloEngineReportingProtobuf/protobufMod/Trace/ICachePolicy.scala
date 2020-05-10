package typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace

import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CachePolicy. */
@js.native
trait ICachePolicy extends js.Object {
  /** CachePolicy maxAgeNs */
  var maxAgeNs: js.UndefOr[Double | Null] = js.native
  /** CachePolicy scope */
  var scope: js.UndefOr[Scope | Null] = js.native
}

object ICachePolicy {
  @scala.inline
  def apply(): ICachePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICachePolicy]
  }
  @scala.inline
  implicit class ICachePolicyOps[Self <: ICachePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAgeNs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAgeNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeNs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAgeNsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeNs")(null)
        ret
    }
    @scala.inline
    def withScope(value: Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(null)
        ret
    }
  }
  
}

