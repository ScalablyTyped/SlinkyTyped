package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixList extends js.Object {
  /**
    * The IP address range of the AWS service.
    */
  var Cidrs: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[String] = js.native
  /**
    * The name of the prefix.
    */
  var PrefixListName: js.UndefOr[String] = js.native
}

object PrefixList {
  @scala.inline
  def apply(): PrefixList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixList]
  }
  @scala.inline
  implicit class PrefixListOps[Self <: PrefixList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrs(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidrs")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrefixListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrefixListId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixListName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrefixListName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixListName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrefixListName")(js.undefined)
        ret
    }
  }
  
}

