package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeProperties extends ComponentProperties {
  var withCheckbox: js.UndefOr[Boolean] = js.native
}

object TreeProperties {
  @scala.inline
  def apply(): TreeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeProperties]
  }
  @scala.inline
  implicit class TreePropertiesOps[Self <: TreeProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCheckbox")(js.undefined)
        ret
    }
  }
  
}

