package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCodeConfigurationDescription extends js.Object {
  /**
    * Describes details about the location and format of the application code.
    */
  var CodeContentDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CodeContentDescription] = js.native
  /**
    * Specifies whether the code content is in text or zip format.
    */
  var CodeContentType: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CodeContentType = js.native
}

object ApplicationCodeConfigurationDescription {
  @scala.inline
  def apply(CodeContentType: CodeContentType): ApplicationCodeConfigurationDescription = {
    val __obj = js.Dynamic.literal(CodeContentType = CodeContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCodeConfigurationDescription]
  }
  @scala.inline
  implicit class ApplicationCodeConfigurationDescriptionOps[Self <: ApplicationCodeConfigurationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeContentType(value: CodeContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeContentDescription(value: CodeContentDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeContentDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeContentDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeContentDescription")(js.undefined)
        ret
    }
  }
  
}

