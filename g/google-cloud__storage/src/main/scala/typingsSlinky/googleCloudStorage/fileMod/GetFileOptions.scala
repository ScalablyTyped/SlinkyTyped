package typingsSlinky.googleCloudStorage.fileMod

import typingsSlinky.googleCloudCommon.serviceObjectMod.GetConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileOptions extends GetConfig {
  var userProject: js.UndefOr[String] = js.native
}

object GetFileOptions {
  @scala.inline
  def apply(): GetFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileOptions]
  }
  @scala.inline
  implicit class GetFileOptionsOps[Self <: GetFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(js.undefined)
        ret
    }
  }
  
}

