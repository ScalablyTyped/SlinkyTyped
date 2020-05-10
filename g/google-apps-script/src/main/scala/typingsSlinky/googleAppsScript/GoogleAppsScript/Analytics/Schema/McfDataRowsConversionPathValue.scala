package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait McfDataRowsConversionPathValue extends js.Object {
  var interactionType: js.UndefOr[String] = js.native
  var nodeValue: js.UndefOr[String] = js.native
}

object McfDataRowsConversionPathValue {
  @scala.inline
  def apply(): McfDataRowsConversionPathValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[McfDataRowsConversionPathValue]
  }
  @scala.inline
  implicit class McfDataRowsConversionPathValueOps[Self <: McfDataRowsConversionPathValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteractionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionType")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(js.undefined)
        ret
    }
  }
  
}

