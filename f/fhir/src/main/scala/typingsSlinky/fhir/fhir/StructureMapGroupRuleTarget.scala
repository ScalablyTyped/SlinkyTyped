package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content to create because of this mapping rule
  */
@js.native
trait StructureMapGroupRuleTarget extends BackboneElement {
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'contextType'.
    */
  var _contextType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'element'.
    */
  var _element: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'listMode'.
    */
  var _listMode: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'listRuleId'.
    */
  var _listRuleId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'transform'.
    */
  var _transform: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[Element] = js.native
  /**
    * Type or variable this rule applies to
    */
  var context: js.UndefOr[id] = js.native
  /**
    * type | variable
    */
  var contextType: js.UndefOr[code] = js.native
  /**
    * Field to create in the context
    */
  var element: js.UndefOr[String] = js.native
  /**
    * first | share | last | collate
    */
  var listMode: js.UndefOr[js.Array[code]] = js.native
  /**
    * Internal rule reference for shared list items
    */
  var listRuleId: js.UndefOr[id] = js.native
  /**
    * Parameters to the transform
    */
  var parameter: js.UndefOr[js.Array[StructureMapGroupRuleTargetParameter]] = js.native
  /**
    * create | copy +
    */
  var transform: js.UndefOr[code] = js.native
  /**
    * Named context for field, if desired, and a field is specified
    */
  var variable: js.UndefOr[id] = js.native
}

object StructureMapGroupRuleTarget {
  @scala.inline
  def apply(): StructureMapGroupRuleTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructureMapGroupRuleTarget]
  }
  @scala.inline
  implicit class StructureMapGroupRuleTargetOps[Self <: StructureMapGroupRuleTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_context(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(js.undefined)
        ret
    }
    @scala.inline
    def with_contextType(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contextType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_contextType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contextType")(js.undefined)
        ret
    }
    @scala.inline
    def with_element(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_element: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_element")(js.undefined)
        ret
    }
    @scala.inline
    def with_listMode(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_listMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_listMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_listMode")(js.undefined)
        ret
    }
    @scala.inline
    def with_listRuleId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_listRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_listRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_listRuleId")(js.undefined)
        ret
    }
    @scala.inline
    def with_transform(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_transform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_transform")(js.undefined)
        ret
    }
    @scala.inline
    def with_variable(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_variable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_variable")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withContextType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextType")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withListMode(value: js.Array[code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMode")(js.undefined)
        ret
    }
    @scala.inline
    def withListRuleId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRuleId")(js.undefined)
        ret
    }
    @scala.inline
    def withParameter(value: js.Array[StructureMapGroupRuleTargetParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withVariable(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(js.undefined)
        ret
    }
  }
  
}

