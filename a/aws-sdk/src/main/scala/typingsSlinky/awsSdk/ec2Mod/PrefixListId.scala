package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixListId extends js.Object {
  /**
    * A description for the security group rule that references this prefix list ID. Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[String] = js.native
}

object PrefixListId {
  @scala.inline
  def apply(): PrefixListId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixListId]
  }
  @scala.inline
  implicit class PrefixListIdOps[Self <: PrefixListId] (val x: Self) extends AnyVal {
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
  }
  
}

