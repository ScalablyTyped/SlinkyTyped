package typingsSlinky.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBucketOptions extends js.Object {
  var authType: js.UndefOr[String] = js.native
  var bucketType: js.UndefOr[String] = js.native
  /**
    * The bucket name
    */
  var name: js.UndefOr[String] = js.native
  var ramQuotaMB: js.UndefOr[Double] = js.native
  var replicaNumber: js.UndefOr[Double] = js.native
}

object CreateBucketOptions {
  @scala.inline
  def apply(): CreateBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketOptions]
  }
  @scala.inline
  implicit class CreateBucketOptionsOps[Self <: CreateBucketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRamQuotaMB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramQuotaMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamQuotaMB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramQuotaMB")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaNumber")(js.undefined)
        ret
    }
  }
  
}

