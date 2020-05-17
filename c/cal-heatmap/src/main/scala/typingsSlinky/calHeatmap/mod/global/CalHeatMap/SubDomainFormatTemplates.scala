package typingsSlinky.calHeatmap.mod.global.CalHeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubDomainFormatTemplates extends js.Object {
  /** Format of the title when there is no value associated to the date. Default value: "{date}" */
  var empty: js.UndefOr[String] = js.native
  /** Format of the title when it's associated to a value. Default value: "{count} {name} {connector} {date}" */
  var filled: js.UndefOr[String] = js.native
}

object SubDomainFormatTemplates {
  @scala.inline
  def apply(): SubDomainFormatTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubDomainFormatTemplates]
  }
  @scala.inline
  implicit class SubDomainFormatTemplatesOps[Self <: SubDomainFormatTemplates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmpty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withFilled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filled")(js.undefined)
        ret
    }
  }
  
}

