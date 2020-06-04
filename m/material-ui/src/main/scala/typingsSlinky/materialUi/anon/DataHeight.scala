package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataHeight extends js.Object {
  var dataHeight: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var rightIconDesktopFill: js.UndefOr[String] = js.undefined
  var selectedTextColor: js.UndefOr[String] = js.undefined
}

object DataHeight {
  @scala.inline
  def apply(): DataHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHeight]
  }
  @scala.inline
  implicit class DataHeightOps[Self <: DataHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataHeight(value: Double): Self = this.set("dataHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataHeight: Self = this.set("dataHeight", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverColor: Self = this.set("hoverColor", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRightIconDesktopFill(value: String): Self = this.set("rightIconDesktopFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIconDesktopFill: Self = this.set("rightIconDesktopFill", js.undefined)
    @scala.inline
    def setSelectedTextColor(value: String): Self = this.set("selectedTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedTextColor: Self = this.set("selectedTextColor", js.undefined)
  }
  
}

