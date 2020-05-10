package typingsSlinky.reactFilepond.mod

import typingsSlinky.reactFilepond.AnonFetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondServerConfigProps extends js.Object {
  var instantUpload: js.UndefOr[Boolean] = js.native
  var server: js.UndefOr[String | AnonFetch] = js.native
}

object FilePondServerConfigProps {
  @scala.inline
  def apply(): FilePondServerConfigProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondServerConfigProps]
  }
  @scala.inline
  implicit class FilePondServerConfigPropsOps[Self <: FilePondServerConfigProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstantUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstantUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: String | AnonFetch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
  }
  
}

