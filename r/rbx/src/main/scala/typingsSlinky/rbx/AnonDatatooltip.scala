package typingsSlinky.rbx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDatatooltip extends js.Object {
  var className: js.UndefOr[String] = js.native
  var `data-badge`: js.UndefOr[String | Double] = js.native
  var `data-tooltip`: js.UndefOr[String | Double] = js.native
}

object AnonDatatooltip {
  @scala.inline
  def apply(): AnonDatatooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDatatooltip]
  }
  @scala.inline
  implicit class AnonDatatooltipOps[Self <: AnonDatatooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def `withData-badge`(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutData-badge`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-badge")(js.undefined)
        ret
    }
    @scala.inline
    def `withData-tooltip`(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutData-tooltip`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-tooltip")(js.undefined)
        ret
    }
  }
  
}

