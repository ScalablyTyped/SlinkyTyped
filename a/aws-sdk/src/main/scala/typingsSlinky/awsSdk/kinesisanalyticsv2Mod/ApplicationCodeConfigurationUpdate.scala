package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCodeConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the code content type.
    */
  var CodeContentTypeUpdate: js.UndefOr[CodeContentType] = js.native
  /**
    * Describes updates to the code content of an application.
    */
  var CodeContentUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CodeContentUpdate] = js.native
}

object ApplicationCodeConfigurationUpdate {
  @scala.inline
  def apply(): ApplicationCodeConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationCodeConfigurationUpdate]
  }
  @scala.inline
  implicit class ApplicationCodeConfigurationUpdateOps[Self <: ApplicationCodeConfigurationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeContentTypeUpdate(value: CodeContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeContentTypeUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeContentTypeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeContentTypeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeContentUpdate(value: CodeContentUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeContentUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeContentUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeContentUpdate")(js.undefined)
        ret
    }
  }
  
}

