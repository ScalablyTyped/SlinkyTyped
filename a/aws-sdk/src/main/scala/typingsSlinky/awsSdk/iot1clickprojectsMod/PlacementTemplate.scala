package typingsSlinky.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementTemplate extends js.Object {
  /**
    * The default attributes (key/value pairs) to be applied to all placements using this template.
    */
  var defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap] = js.native
  /**
    * An object specifying the DeviceTemplate for all placements using this (PlacementTemplate) template.
    */
  var deviceTemplates: js.UndefOr[DeviceTemplateMap] = js.native
}

object PlacementTemplate {
  @scala.inline
  def apply(): PlacementTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTemplate]
  }
  @scala.inline
  implicit class PlacementTemplateOps[Self <: PlacementTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultAttributes(value: DefaultPlacementAttributeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceTemplates(value: DeviceTemplateMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceTemplates")(js.undefined)
        ret
    }
  }
  
}

