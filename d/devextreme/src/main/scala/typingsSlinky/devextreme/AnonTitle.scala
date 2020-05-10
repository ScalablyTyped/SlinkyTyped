package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTitle extends js.Object {
  var label: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var weightIn: js.UndefOr[Double] = js.native
  var weightOut: js.UndefOr[Double] = js.native
}

object AnonTitle {
  @scala.inline
  def apply(): AnonTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTitle]
  }
  @scala.inline
  implicit class AnonTitleOps[Self <: AnonTitle] (val x: Self) extends AnyVal {
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightIn")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightOut")(js.undefined)
        ret
    }
  }
  
}

