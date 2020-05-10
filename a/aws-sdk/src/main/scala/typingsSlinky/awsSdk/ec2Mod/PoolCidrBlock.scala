package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolCidrBlock extends js.Object {
  /**
    * The CIDR block.
    */
  var Cidr: js.UndefOr[String] = js.native
}

object PoolCidrBlock {
  @scala.inline
  def apply(): PoolCidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolCidrBlock]
  }
  @scala.inline
  implicit class PoolCidrBlockOps[Self <: PoolCidrBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidr")(js.undefined)
        ret
    }
  }
  
}

