package typingsSlinky.pkgcloud.mod

import typingsSlinky.pkgcloud.pkgcloudStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleProviderOptions extends js.Object {
  var keyFilename: String = js.native
  var projectId: String = js.native
  var provider: google = js.native
}

object GoogleProviderOptions {
  @scala.inline
  def apply(keyFilename: String, projectId: String, provider: google): GoogleProviderOptions = {
    val __obj = js.Dynamic.literal(keyFilename = keyFilename.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleProviderOptions]
  }
  @scala.inline
  implicit class GoogleProviderOptionsOps[Self <: GoogleProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: google): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

