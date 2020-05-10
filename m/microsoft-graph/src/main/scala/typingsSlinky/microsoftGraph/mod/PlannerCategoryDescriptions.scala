package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerCategoryDescriptions extends js.Object {
  // The label associated with Category 1
  var category1: js.UndefOr[String] = js.native
  // The label associated with Category 2
  var category2: js.UndefOr[String] = js.native
  // The label associated with Category 3
  var category3: js.UndefOr[String] = js.native
  // The label associated with Category 4
  var category4: js.UndefOr[String] = js.native
  // The label associated with Category 5
  var category5: js.UndefOr[String] = js.native
  // The label associated with Category 6
  var category6: js.UndefOr[String] = js.native
}

object PlannerCategoryDescriptions {
  @scala.inline
  def apply(): PlannerCategoryDescriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerCategoryDescriptions]
  }
  @scala.inline
  implicit class PlannerCategoryDescriptionsOps[Self <: PlannerCategoryDescriptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category1")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category2")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category3")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category4")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category5")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory6(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category6")(js.undefined)
        ret
    }
  }
  
}

