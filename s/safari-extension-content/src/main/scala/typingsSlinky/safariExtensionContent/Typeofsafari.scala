package typingsSlinky.safariExtensionContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsafari extends js.Object {
  var extension: SafariContentExtension = js.native
  var self: SafariContentWebPage = js.native
}

object Typeofsafari {
  @scala.inline
  def apply(extension: SafariContentExtension, self: SafariContentWebPage): Typeofsafari = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsafari]
  }
  @scala.inline
  implicit class TypeofsafariOps[Self <: Typeofsafari] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: SafariContentExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: SafariContentWebPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

