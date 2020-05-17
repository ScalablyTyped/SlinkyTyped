package typingsSlinky.c3.anon

import typingsSlinky.c3.mod.ExpandOptions
import typingsSlinky.c3.mod.LabelOptionsWithThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expand extends js.Object {
  /**
    * Enable or disable expanding pie pieces.
    */
  var expand: js.UndefOr[ExpandOptions] = js.native
  var label: js.UndefOr[LabelOptionsWithThreshold] = js.native
}

object Expand {
  @scala.inline
  def apply(): Expand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expand]
  }
  @scala.inline
  implicit class ExpandOps[Self <: Expand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpand(value: ExpandOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: LabelOptionsWithThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

