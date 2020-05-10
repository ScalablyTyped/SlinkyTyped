package typingsSlinky.iotaLibJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddresses extends js.Object {
  var addresses: js.UndefOr[js.Array[String]] = js.native
  var approvees: js.UndefOr[js.Array[String]] = js.native
  var bundles: js.UndefOr[js.Array[String]] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object AnonAddresses {
  @scala.inline
  def apply(): AnonAddresses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAddresses]
  }
  @scala.inline
  implicit class AnonAddressesOps[Self <: AnonAddresses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovees(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvees")(js.undefined)
        ret
    }
    @scala.inline
    def withBundles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundles")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

