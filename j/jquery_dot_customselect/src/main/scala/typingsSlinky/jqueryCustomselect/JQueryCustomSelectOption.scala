package typingsSlinky.jqueryCustomselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCustomSelectOption extends js.Object {
  var customClass: js.UndefOr[String] = js.native
  var mapClass: js.UndefOr[Boolean] = js.native
  var mapStyle: js.UndefOr[Boolean] = js.native
}

object JQueryCustomSelectOption {
  @scala.inline
  def apply(): JQueryCustomSelectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryCustomSelectOption]
  }
  @scala.inline
  implicit class JQueryCustomSelectOptionOps[Self <: JQueryCustomSelectOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMapClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMapStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapStyle")(js.undefined)
        ret
    }
  }
  
}

