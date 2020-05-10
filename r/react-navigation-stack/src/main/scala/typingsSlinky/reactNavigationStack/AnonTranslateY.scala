package typingsSlinky.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTranslateY extends js.Object {
  var translateX: Double = js.native
  var translateY: js.UndefOr[scala.Nothing] = js.native
}

object AnonTranslateY {
  @scala.inline
  def apply(translateX: Double): AnonTranslateY = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslateY]
  }
  @scala.inline
  implicit class AnonTranslateYOps[Self <: AnonTranslateY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslateX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateY(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(js.undefined)
        ret
    }
  }
  
}

