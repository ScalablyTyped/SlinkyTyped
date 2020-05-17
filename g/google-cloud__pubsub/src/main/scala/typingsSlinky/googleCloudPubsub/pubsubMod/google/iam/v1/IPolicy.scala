package typingsSlinky.googleCloudPubsub.pubsubMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Policy. */
@js.native
trait IPolicy extends js.Object {
  /** Policy bindings */
  var bindings: js.UndefOr[js.Array[IBinding] | Null] = js.native
  /** Policy etag */
  var etag: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** Policy version */
  var version: js.UndefOr[Double | Null] = js.native
}

object IPolicy {
  @scala.inline
  def apply(): IPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicy]
  }
  @scala.inline
  implicit class IPolicyOps[Self <: IPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: js.Array[IBinding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withBindingsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(null)
        ret
    }
    @scala.inline
    def withEtag(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withEtagNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(null)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(null)
        ret
    }
  }
  
}

