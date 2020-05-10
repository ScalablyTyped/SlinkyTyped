package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInternalIpOwner extends js.Object {
  /**
    * IP CIDR range being owned.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * URLs of the IP owners of the IP CIDR range.
    */
  var owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether this IP CIDR range is reserved for system use.
    */
  var systemOwned: js.UndefOr[Boolean] = js.native
}

object SchemaInternalIpOwner {
  @scala.inline
  def apply(): SchemaInternalIpOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalIpOwner]
  }
  @scala.inline
  implicit class SchemaInternalIpOwnerOps[Self <: SchemaInternalIpOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpCidrRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCidrRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpCidrRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCidrRange")(js.undefined)
        ret
    }
    @scala.inline
    def withOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemOwned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemOwned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemOwned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemOwned")(js.undefined)
        ret
    }
  }
  
}

