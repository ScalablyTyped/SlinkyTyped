package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CidrBlock contains an optional name and one CIDR block.
  */
@js.native
trait SchemaCidrBlock extends js.Object {
  /**
    * cidr_block must be specified in CIDR notation.
    */
  var cidrBlock: js.UndefOr[String] = js.native
  /**
    * display_name is an optional field for users to identify CIDR blocks.
    */
  var displayName: js.UndefOr[String] = js.native
}

object SchemaCidrBlock {
  @scala.inline
  def apply(): SchemaCidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCidrBlock]
  }
  @scala.inline
  implicit class SchemaCidrBlockOps[Self <: SchemaCidrBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
  }
  
}

