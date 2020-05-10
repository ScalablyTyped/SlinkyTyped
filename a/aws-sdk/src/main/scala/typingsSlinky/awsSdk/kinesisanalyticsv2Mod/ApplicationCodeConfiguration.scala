package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCodeConfiguration extends js.Object {
  /**
    * The location and type of the application code.
    */
  var CodeContent: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CodeContent] = js.native
  /**
    * Specifies whether the code content is in text or zip format.
    */
  var CodeContentType: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CodeContentType = js.native
}

object ApplicationCodeConfiguration {
  @scala.inline
  def apply(CodeContentType: CodeContentType): ApplicationCodeConfiguration = {
    val __obj = js.Dynamic.literal(CodeContentType = CodeContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCodeConfiguration]
  }
  @scala.inline
  implicit class ApplicationCodeConfigurationOps[Self <: ApplicationCodeConfiguration] (val x: Self) extends AnyVal {
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
    def withCodeContent(value: CodeContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeContent")(js.undefined)
        ret
    }
  }
  
}

