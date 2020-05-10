package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookFilterCriteria extends js.Object {
  var color: js.UndefOr[String] = js.native
  var criterion1: js.UndefOr[String] = js.native
  var criterion2: js.UndefOr[String] = js.native
  var dynamicCriteria: js.UndefOr[String] = js.native
  var filterOn: js.UndefOr[String] = js.native
  var icon: js.UndefOr[WorkbookIcon] = js.native
  var operator: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Any] = js.native
}

object WorkbookFilterCriteria {
  @scala.inline
  def apply(): WorkbookFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilterCriteria]
  }
  @scala.inline
  implicit class WorkbookFilterCriteriaOps[Self <: WorkbookFilterCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCriterion1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criterion1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriterion1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criterion1")(js.undefined)
        ret
    }
    @scala.inline
    def withCriterion2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criterion2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriterion2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criterion2")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicCriteria(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOn")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: WorkbookIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

