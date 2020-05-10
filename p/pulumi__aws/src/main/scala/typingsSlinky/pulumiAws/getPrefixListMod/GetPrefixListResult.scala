package typingsSlinky.pulumiAws.getPrefixListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPrefixListResult extends js.Object {
  /**
    * The list of CIDR blocks for the AWS service associated
    * with the prefix list.
    */
  val cidrBlocks: js.Array[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the selected prefix list.
    */
  val name: String = js.native
  val prefixListId: js.UndefOr[String] = js.native
}

object GetPrefixListResult {
  @scala.inline
  def apply(cidrBlocks: js.Array[String], id: String, name: String): GetPrefixListResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrefixListResult]
  }
  @scala.inline
  implicit class GetPrefixListResultOps[Self <: GetPrefixListResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrBlocks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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

