package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceVisualization extends js.Object {
  var containerDisplayName: js.UndefOr[String] = js.native
  var containerType: js.UndefOr[String] = js.native
  var containerWebUrl: js.UndefOr[String] = js.native
  var mediaType: js.UndefOr[String] = js.native
  var previewImageUrl: js.UndefOr[String] = js.native
  var previewText: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object ResourceVisualization {
  @scala.inline
  def apply(): ResourceVisualization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceVisualization]
  }
  @scala.inline
  implicit class ResourceVisualizationOps[Self <: ResourceVisualization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerType")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerWebUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWebUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerWebUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWebUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewText")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

