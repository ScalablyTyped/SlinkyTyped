package typingsSlinky.baseui.tableSemanticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuilderOverrides extends Overrides {
  var SortAscIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var SortDescIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var SortNoneIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var TableHeadCellSortable: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object BuilderOverrides {
  @scala.inline
  def apply(): BuilderOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuilderOverrides]
  }
  @scala.inline
  implicit class BuilderOverridesOps[Self <: BuilderOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSortAscIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortAscIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAscIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortAscIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDescIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortDescIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDescIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortDescIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSortNoneIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortNoneIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortNoneIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortNoneIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadCellSortable(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadCellSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeadCellSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadCellSortable")(js.undefined)
        ret
    }
  }
  
}

