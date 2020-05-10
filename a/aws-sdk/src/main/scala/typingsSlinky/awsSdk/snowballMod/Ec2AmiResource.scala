package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ec2AmiResource extends js.Object {
  /**
    * The ID of the AMI in Amazon EC2.
    */
  var AmiId: typingsSlinky.awsSdk.snowballMod.AmiId = js.native
  /**
    * The ID of the AMI on the Snowball Edge device.
    */
  var SnowballAmiId: js.UndefOr[String] = js.native
}

object Ec2AmiResource {
  @scala.inline
  def apply(AmiId: AmiId): Ec2AmiResource = {
    val __obj = js.Dynamic.literal(AmiId = AmiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2AmiResource]
  }
  @scala.inline
  implicit class Ec2AmiResourceOps[Self <: Ec2AmiResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmiId(value: AmiId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnowballAmiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballAmiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnowballAmiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballAmiId")(js.undefined)
        ret
    }
  }
  
}

