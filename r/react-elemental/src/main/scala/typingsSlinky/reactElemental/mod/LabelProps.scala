package typingsSlinky.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelProps extends js.Object {
  val label: js.UndefOr[String] = js.native
  val sublabel: js.UndefOr[String] = js.native
}

object LabelProps {
  @scala.inline
  def apply(): LabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelProps]
  }
  @scala.inline
  implicit class LabelPropsOps[Self <: LabelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
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
    @scala.inline
    def withSublabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSublabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublabel")(js.undefined)
        ret
    }
  }
  
}

