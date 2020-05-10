package typingsSlinky.pulumiAws.organizationalUnitMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationalUnitArgs extends js.Object {
  /**
    * The name for the organizational unit
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the parent organizational unit, which may be the root
    */
  val parentId: Input[String] = js.native
}

object OrganizationalUnitArgs {
  @scala.inline
  def apply(parentId: Input[String]): OrganizationalUnitArgs = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationalUnitArgs]
  }
  @scala.inline
  implicit class OrganizationalUnitArgsOps[Self <: OrganizationalUnitArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
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
  }
  
}

