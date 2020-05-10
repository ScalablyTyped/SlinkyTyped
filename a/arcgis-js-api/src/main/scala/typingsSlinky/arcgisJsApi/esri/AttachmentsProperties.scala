package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.list
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsProperties extends WidgetProperties {
  /**
    * A string value indicating how to display the attachment.  If `list` is specified, attachments show as links. If `preview` is specified, a thumbnail of each attachment will be shown.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#displayType)
    *
    * @default "list"
    */
  var displayType: js.UndefOr[preview | list] = js.native
  /**
    * The graphic for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [AttachmentsViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#viewModel)
    */
  var viewModel: js.UndefOr[AttachmentsViewModelProperties] = js.native
}

object AttachmentsProperties {
  @scala.inline
  def apply(): AttachmentsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsProperties]
  }
  @scala.inline
  implicit class AttachmentsPropertiesOps[Self <: AttachmentsProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayType(value: preview | list): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(js.undefined)
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
    def withViewModel(value: AttachmentsViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
  }
  
}

