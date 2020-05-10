package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.add
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.edit
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsViewModelProperties extends js.Object {
  /**
    * The current [AttachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html) being edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#activeAttachmentInfo)
    */
  var activeAttachmentInfo: js.UndefOr[AttachmentInfoProperties] = js.native
  /**
    * The graphic for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  /**
    * The current mode performed by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#mode)
    *
    * @default "view"
    */
  var mode: js.UndefOr[view | add | edit] = js.native
  /**
    * Defines whether or not the feature supports resizing attachments. This depends on whether the feature layer's [capabilities.operations.supportsResizeAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#supportsResizeAttachments)
    */
  var supportsResizeAttachments: js.UndefOr[Boolean] = js.native
}

object AttachmentsViewModelProperties {
  @scala.inline
  def apply(): AttachmentsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsViewModelProperties]
  }
  @scala.inline
  implicit class AttachmentsViewModelPropertiesOps[Self <: AttachmentsViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveAttachmentInfo(value: AttachmentInfoProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAttachmentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveAttachmentInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAttachmentInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphic(value: GraphicProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphic")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: view | add | edit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsResizeAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsResizeAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsResizeAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsResizeAttachments")(js.undefined)
        ret
    }
  }
  
}

