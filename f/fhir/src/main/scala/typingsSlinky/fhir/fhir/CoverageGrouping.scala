package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional coverage classifications
  */
@js.native
trait CoverageGrouping extends BackboneElement {
  /**
    * Contains extended information for property 'class'.
    */
  var _class: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'classDisplay'.
    */
  var _classDisplay: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'group'.
    */
  var _group: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'groupDisplay'.
    */
  var _groupDisplay: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'plan'.
    */
  var _plan: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'planDisplay'.
    */
  var _planDisplay: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'subClass'.
    */
  var _subClass: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'subClassDisplay'.
    */
  var _subClassDisplay: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'subGroup'.
    */
  var _subGroup: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'subGroupDisplay'.
    */
  var _subGroupDisplay: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'subPlan'.
    */
  var _subPlan: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'subPlanDisplay'.
    */
  var _subPlanDisplay: js.UndefOr[Element] = js.native
  /**
    * An identifier for the class
    */
  var `class`: js.UndefOr[String] = js.native
  /**
    * Display text for the class
    */
  var classDisplay: js.UndefOr[String] = js.native
  /**
    * An identifier for the group
    */
  var group: js.UndefOr[String] = js.native
  /**
    * Display text for an identifier for the group
    */
  var groupDisplay: js.UndefOr[String] = js.native
  /**
    * An identifier for the plan
    */
  var plan: js.UndefOr[String] = js.native
  /**
    * Display text for the plan
    */
  var planDisplay: js.UndefOr[String] = js.native
  /**
    * An identifier for the subsection of the class
    */
  var subClass: js.UndefOr[String] = js.native
  /**
    * Display text for the subsection of the subclass
    */
  var subClassDisplay: js.UndefOr[String] = js.native
  /**
    * An identifier for the subsection of the group
    */
  var subGroup: js.UndefOr[String] = js.native
  /**
    * Display text for the subsection of the group
    */
  var subGroupDisplay: js.UndefOr[String] = js.native
  /**
    * An identifier for the subsection of the plan
    */
  var subPlan: js.UndefOr[String] = js.native
  /**
    * Display text for the subsection of the plan
    */
  var subPlanDisplay: js.UndefOr[String] = js.native
}

object CoverageGrouping {
  @scala.inline
  def apply(): CoverageGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageGrouping]
  }
  @scala.inline
  implicit class CoverageGroupingOps[Self <: CoverageGrouping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(js.undefined)
        ret
    }
    @scala.inline
    def with_classDisplay(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_classDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_classDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_classDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def with_group(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_group")(js.undefined)
        ret
    }
    @scala.inline
    def with_groupDisplay(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groupDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_groupDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groupDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def with_plan(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_plan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_plan")(js.undefined)
        ret
    }
    @scala.inline
    def with_planDisplay(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_planDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_planDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_planDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def with_subClass(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_subClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subClass")(js.undefined)
        ret
    }
    @scala.inline
    def with_subClassDisplay(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subClassDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_subClassDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subClassDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def with_subGroup(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_subGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subGroup")(js.undefined)
        ret
    }
    @scala.inline
    def with_subGroupDisplay(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subGroupDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_subGroupDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subGroupDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def with_subPlan(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_subPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subPlan")(js.undefined)
        ret
    }
    @scala.inline
    def with_subPlanDisplay(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subPlanDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_subPlanDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subPlanDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withClassDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withSubClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSubClassDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subClassDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubClassDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subClassDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withSubGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withSubGroupDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subGroupDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubGroupDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subGroupDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withSubPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPlan")(js.undefined)
        ret
    }
    @scala.inline
    def withSubPlanDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPlanDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubPlanDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPlanDisplay")(js.undefined)
        ret
    }
  }
  
}

