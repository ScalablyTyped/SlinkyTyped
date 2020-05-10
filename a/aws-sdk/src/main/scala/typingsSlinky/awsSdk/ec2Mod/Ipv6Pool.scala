package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ipv6Pool extends js.Object {
  /**
    * The description for the address pool.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The CIDR blocks for the address pool.
    */
  var PoolCidrBlocks: js.UndefOr[PoolCidrBlocksSet] = js.native
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[String] = js.native
  /**
    * Any tags for the address pool.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Ipv6Pool {
  @scala.inline
  def apply(): Ipv6Pool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6Pool]
  }
  @scala.inline
  implicit class Ipv6PoolOps[Self <: Ipv6Pool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolCidrBlocks(value: PoolCidrBlocksSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolCidrBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolCidrBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolCidrBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolId")(js.undefined)
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

