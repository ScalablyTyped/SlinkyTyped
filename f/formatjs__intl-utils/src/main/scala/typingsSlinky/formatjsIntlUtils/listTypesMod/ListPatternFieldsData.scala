package typingsSlinky.formatjsIntlUtils.listTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPatternFieldsData extends js.Object {
  var conjunction: js.UndefOr[ListPatternData] = js.native
  var disjunction: js.UndefOr[ListPatternData] = js.native
  var unit: js.UndefOr[ListPatternData] = js.native
}

object ListPatternFieldsData {
  @scala.inline
  def apply(): ListPatternFieldsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPatternFieldsData]
  }
  @scala.inline
  implicit class ListPatternFieldsDataOps[Self <: ListPatternFieldsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConjunction(value: ListPatternData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConjunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisjunction(value: ListPatternData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disjunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisjunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disjunction")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: ListPatternData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

