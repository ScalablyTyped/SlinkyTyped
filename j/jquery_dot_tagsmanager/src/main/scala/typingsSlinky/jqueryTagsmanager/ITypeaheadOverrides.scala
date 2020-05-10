package typingsSlinky.jqueryTagsmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITypeaheadOverrides extends js.Object {
  var instanceSelectHandler: js.UndefOr[js.Function] = js.native
  var select: js.UndefOr[js.Function] = js.native
  var selectedClass: js.UndefOr[String] = js.native
}

object ITypeaheadOverrides {
  @scala.inline
  def apply(): ITypeaheadOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeaheadOverrides]
  }
  @scala.inline
  implicit class ITypeaheadOverridesOps[Self <: ITypeaheadOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceSelectHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceSelectHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceSelectHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceSelectHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedClass")(js.undefined)
        ret
    }
  }
  
}

