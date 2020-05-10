package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchConditionEx extends js.Object {
  var Enabled: Boolean = js.native
  var Ignored: Boolean = js.native
  var SearchCondition: ISearchCondition = js.native
  var SpecialNULL: Boolean = js.native
  def Clone(): ISearchConditionEx = js.native
  def Set(SearchCondition: ISearchCondition, Enabled: Boolean, SpecialNULL: Boolean, Ignored: Boolean): Unit = js.native
}

object ISearchConditionEx {
  @scala.inline
  def apply(
    Clone: () => ISearchConditionEx,
    Enabled: Boolean,
    Ignored: Boolean,
    SearchCondition: ISearchCondition,
    Set: (ISearchCondition, Boolean, Boolean, Boolean) => Unit,
    SpecialNULL: Boolean
  ): ISearchConditionEx = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Enabled = Enabled.asInstanceOf[js.Any], Ignored = Ignored.asInstanceOf[js.Any], SearchCondition = SearchCondition.asInstanceOf[js.Any], Set = js.Any.fromFunction4(Set), SpecialNULL = SpecialNULL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchConditionEx]
  }
  @scala.inline
  implicit class ISearchConditionExOps[Self <: ISearchConditionEx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ISearchConditionEx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchCondition(value: ISearchCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (ISearchCondition, Boolean, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSpecialNULL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpecialNULL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

