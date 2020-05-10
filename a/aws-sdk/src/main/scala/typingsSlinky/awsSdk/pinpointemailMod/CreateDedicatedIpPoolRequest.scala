package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDedicatedIpPoolRequest extends js.Object {
  /**
    * The name of the dedicated IP pool.
    */
  var PoolName: typingsSlinky.awsSdk.pinpointemailMod.PoolName = js.native
  /**
    * An object that defines the tags (keys and values) that you want to associate with the pool.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDedicatedIpPoolRequest {
  @scala.inline
  def apply(PoolName: PoolName): CreateDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDedicatedIpPoolRequest]
  }
  @scala.inline
  implicit class CreateDedicatedIpPoolRequestOps[Self <: CreateDedicatedIpPoolRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoolName(value: PoolName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

