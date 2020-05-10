package typingsSlinky.pulumiAws.getOrganizationalUnitsMod

import typingsSlinky.pulumiAws.outputMod.organizations.GetOrganizationalUnitsChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationalUnitsResult extends js.Object {
  /**
    * List of child organizational units, which have the following attributes:
    */
  val childrens: js.Array[GetOrganizationalUnitsChildren] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val parentId: String = js.native
}

object GetOrganizationalUnitsResult {
  @scala.inline
  def apply(childrens: js.Array[GetOrganizationalUnitsChildren], id: String, parentId: String): GetOrganizationalUnitsResult = {
    val __obj = js.Dynamic.literal(childrens = childrens.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationalUnitsResult]
  }
  @scala.inline
  implicit class GetOrganizationalUnitsResultOps[Self <: GetOrganizationalUnitsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrens(value: js.Array[GetOrganizationalUnitsChildren]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

