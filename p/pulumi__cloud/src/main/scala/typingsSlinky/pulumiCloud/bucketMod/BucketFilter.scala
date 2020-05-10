package typingsSlinky.pulumiCloud.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketFilter extends js.Object {
  var keyPrefix: js.UndefOr[String] = js.native
  var keySuffix: js.UndefOr[String] = js.native
}

object BucketFilter {
  @scala.inline
  def apply(): BucketFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketFilter]
  }
  @scala.inline
  implicit class BucketFilterOps[Self <: BucketFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySuffix")(js.undefined)
        ret
    }
  }
  
}

