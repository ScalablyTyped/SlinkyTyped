package typingsSlinky.browserfs.dropboxMod

import typingsSlinky.dropboxjs.Dropbox.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropboxFileSystemOptions extends js.Object {
  var client: Client = js.native
}

object DropboxFileSystemOptions {
  @scala.inline
  def apply(client: Client): DropboxFileSystemOptions = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropboxFileSystemOptions]
  }
  @scala.inline
  implicit class DropboxFileSystemOptionsOps[Self <: DropboxFileSystemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: Client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

