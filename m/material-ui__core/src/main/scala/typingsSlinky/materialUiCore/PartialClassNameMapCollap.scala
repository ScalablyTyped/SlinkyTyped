package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Collapse/Collapse.CollapseClassKey>> */
@js.native
trait PartialClassNameMapCollap extends js.Object {
  var container: js.UndefOr[String] = js.native
  var entered: js.UndefOr[String] = js.native
  var wrapper: js.UndefOr[String] = js.native
  var wrapperInner: js.UndefOr[String] = js.native
}

object PartialClassNameMapCollap {
  @scala.inline
  def apply(): PartialClassNameMapCollap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCollap]
  }
  @scala.inline
  implicit class PartialClassNameMapCollapOps[Self <: PartialClassNameMapCollap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withEntered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entered")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperInner")(js.undefined)
        ret
    }
  }
  
}

