package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiConfig extends js.Object {
  /**
    * The Amazon S3 bucket location of the UI template. For more information about the contents of a UI template, see  Creating Your Custom Labeling Task Template.
    */
  var UiTemplateS3Uri: S3Uri = js.native
}

object UiConfig {
  @scala.inline
  def apply(UiTemplateS3Uri: S3Uri): UiConfig = {
    val __obj = js.Dynamic.literal(UiTemplateS3Uri = UiTemplateS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiConfig]
  }
  @scala.inline
  implicit class UiConfigOps[Self <: UiConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUiTemplateS3Uri(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UiTemplateS3Uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

