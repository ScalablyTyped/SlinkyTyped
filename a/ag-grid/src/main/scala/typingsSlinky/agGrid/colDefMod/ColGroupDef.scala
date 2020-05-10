package typingsSlinky.agGrid.colDefMod

import typingsSlinky.agGrid.AnonInstantiableAny
import typingsSlinky.agGrid.AnonInstantiableIHeaderGroupComp
import typingsSlinky.agGrid.componentResolverMod.ComponentHolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColGroupDef
  extends AbstractColDef
     with ComponentHolder {
  /** Columns in this group */
  var children: js.Array[ColDef | ColGroupDef] = js.native
  /** Group ID */
  var groupId: js.UndefOr[String] = js.native
  /** The custom header group component to be used for rendering the component header. If none specified the default ag-Grid is used**/
  var headerGroupComponent: js.UndefOr[String | AnonInstantiableIHeaderGroupComp] = js.native
  /** The custom header group component to be used for rendering the component header in the hosting framework (ie: React/Angular). If none specified the default ag-Grid is used**/
  var headerGroupComponentFramework: js.UndefOr[AnonInstantiableAny] = js.native
  /** The custom header group component to be used for rendering the component header. If none specified the default ag-Grid is used**/
  var headerGroupComponentParams: js.UndefOr[js.Any] = js.native
  /** If true, group cannot be broken up by column moving, child columns will always appear side by side, however you can rearrange child columns within the group */
  var marryChildren: js.UndefOr[Boolean] = js.native
  /** Open by Default */
  var openByDefault: js.UndefOr[Boolean] = js.native
}

object ColGroupDef {
  @scala.inline
  def apply(children: js.Array[ColDef | ColGroupDef]): ColGroupDef = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColGroupDef]
  }
  @scala.inline
  implicit class ColGroupDefOps[Self <: ColGroupDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[ColDef | ColGroupDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderGroupComponent(value: String | AnonInstantiableIHeaderGroupComp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerGroupComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderGroupComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerGroupComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderGroupComponentFramework(value: AnonInstantiableAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerGroupComponentFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderGroupComponentFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerGroupComponentFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderGroupComponentParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerGroupComponentParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderGroupComponentParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerGroupComponentParams")(js.undefined)
        ret
    }
    @scala.inline
    def withMarryChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marryChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarryChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marryChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openByDefault")(js.undefined)
        ret
    }
  }
  
}

