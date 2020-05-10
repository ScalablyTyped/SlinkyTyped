package typingsSlinky.pulumiAws.getPrefixListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPrefixListArgs extends js.Object {
  /**
    * The name of the prefix list to select.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * The ID of the prefix list to select.
    */
  val prefixListId: js.UndefOr[String] = js.native
}

object GetPrefixListArgs {
  @scala.inline
  def apply(): GetPrefixListArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPrefixListArgs]
  }
  @scala.inline
  implicit class GetPrefixListArgsOps[Self <: GetPrefixListArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPrefixListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixListId")(js.undefined)
        ret
    }
  }
  
}

