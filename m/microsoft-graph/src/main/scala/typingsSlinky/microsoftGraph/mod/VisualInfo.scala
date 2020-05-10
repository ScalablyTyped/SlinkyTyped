package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisualInfo extends js.Object {
  // Optional. JSON object used to represent an icon which represents the application used to generate the activity
  var attribution: js.UndefOr[ImageInfo] = js.native
  /**
    * Optional. Background color used to render the activity in the UI - brand color for the application source of the
    * activity. Must be a valid hex color
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell
    * UI
    */
  var content: js.UndefOr[js.Any] = js.native
  /**
    * Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or
    * metadata)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. Short text description of the user's unique activity (for example, document name in cases where an activity
    * refers to document creation)
    */
  var displayText: js.UndefOr[String] = js.native
}

object VisualInfo {
  @scala.inline
  def apply(): VisualInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualInfo]
  }
  @scala.inline
  implicit class VisualInfoOps[Self <: VisualInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribution(value: ImageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(js.undefined)
        ret
    }
  }
  
}

