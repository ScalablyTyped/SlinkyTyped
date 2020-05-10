package typingsSlinky.materialUiStyles.mergeClassesMergeClassesMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeClassesOption extends js.Object {
  var Component: ReactElement = js.native
  var baseClasses: Classes = js.native
  var newClasses: Classes = js.native
}

object MergeClassesOption {
  @scala.inline
  def apply(Component: ReactElement, baseClasses: Classes, newClasses: Classes): MergeClassesOption = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], baseClasses = baseClasses.asInstanceOf[js.Any], newClasses = newClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeClassesOption]
  }
  @scala.inline
  implicit class MergeClassesOptionOps[Self <: MergeClassesOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseClasses(value: Classes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewClasses(value: Classes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClasses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

