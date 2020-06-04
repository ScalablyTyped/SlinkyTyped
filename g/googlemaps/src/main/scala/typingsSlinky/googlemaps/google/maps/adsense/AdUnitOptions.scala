package typingsSlinky.googlemaps.google.maps.adsense

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.ControlPosition
import typingsSlinky.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var channelNumber: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[AdFormat] = js.undefined
  var map: js.UndefOr[Map[Element]] = js.undefined
  var position: js.UndefOr[ControlPosition] = js.undefined
  var publisherId: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var titleColor: js.UndefOr[String] = js.undefined
  var urlColor: js.UndefOr[String] = js.undefined
}

object AdUnitOptions {
  @scala.inline
  def apply(): AdUnitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdUnitOptions]
  }
  @scala.inline
  implicit class AdUnitOptionsOps[Self <: AdUnitOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setChannelNumber(value: String): Self = this.set("channelNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelNumber: Self = this.set("channelNumber", js.undefined)
    @scala.inline
    def setFormat(value: AdFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPublisherId(value: String): Self = this.set("publisherId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherId: Self = this.set("publisherId", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTitleColor(value: String): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
    @scala.inline
    def setUrlColor(value: String): Self = this.set("urlColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlColor: Self = this.set("urlColor", js.undefined)
  }
  
}

