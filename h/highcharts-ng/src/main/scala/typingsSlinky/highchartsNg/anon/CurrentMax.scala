package typingsSlinky.highchartsNg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentMax extends js.Object {
  var currentMax: js.UndefOr[Double] = js.native
  var currentMin: js.UndefOr[Double] = js.native
  var title: js.UndefOr[Text] = js.native
}

object CurrentMax {
  @scala.inline
  def apply(): CurrentMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMax]
  }
  @scala.inline
  implicit class CurrentMaxOps[Self <: CurrentMax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMax")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMin")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Text): Self = {
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
  }
  
}

