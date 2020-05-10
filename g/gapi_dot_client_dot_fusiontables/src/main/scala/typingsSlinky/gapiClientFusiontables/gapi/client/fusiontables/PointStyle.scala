package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointStyle extends js.Object {
  /** Name of the icon. Use values defined in http://www.google.com/fusiontables/DataSource?dsrcid=308519 */
  var iconName: js.UndefOr[String] = js.native
  /** Column or a bucket value from which the icon name is to be determined. */
  var iconStyler: js.UndefOr[StyleFunction] = js.native
}

object PointStyle {
  @scala.inline
  def apply(): PointStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStyle]
  }
  @scala.inline
  implicit class PointStyleOps[Self <: PointStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyler(value: StyleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyler")(js.undefined)
        ret
    }
  }
  
}

