package typingsSlinky.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteFileProviderOptions extends FileProviderOptions[RemoteFileProvider] {
  /** Specifies the URL of an endpoint used to access and modify a file system located on the server. */
  var endpointUrl: js.UndefOr[String] = js.native
  /** Specifies which data field provides information about whether a directory has subdirectories. */
  var hasSubDirectoriesExpr: js.UndefOr[String | js.Function] = js.native
}

object RemoteFileProviderOptions {
  @scala.inline
  def apply(): RemoteFileProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteFileProviderOptions]
  }
  @scala.inline
  implicit class RemoteFileProviderOptionsOps[Self <: RemoteFileProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSubDirectoriesExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSubDirectoriesExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSubDirectoriesExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSubDirectoriesExpr")(js.undefined)
        ret
    }
  }
  
}

