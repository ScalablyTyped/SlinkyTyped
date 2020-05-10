package typingsSlinky.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsafari extends js.Object {
  var application: SafariApplication = js.native
  var extension: SafariExtension = js.native
  var self: SafariExtensionGlobalPage | SafariExtensionBar = js.native
}

object Typeofsafari {
  @scala.inline
  def apply(
    application: SafariApplication,
    extension: SafariExtension,
    self: SafariExtensionGlobalPage | SafariExtensionBar
  ): Typeofsafari = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsafari]
  }
  @scala.inline
  implicit class TypeofsafariOps[Self <: Typeofsafari] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: SafariApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtension(value: SafariExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: SafariExtensionGlobalPage | SafariExtensionBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

