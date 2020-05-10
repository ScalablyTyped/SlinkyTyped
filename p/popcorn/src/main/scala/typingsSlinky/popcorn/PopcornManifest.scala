package typingsSlinky.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopcornManifest extends js.Object {
  var about: PopcornManifestAbout = js.native
  var options: PopcornManifestOptions = js.native
}

object PopcornManifest {
  @scala.inline
  def apply(about: PopcornManifestAbout, options: PopcornManifestOptions): PopcornManifest = {
    val __obj = js.Dynamic.literal(about = about.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopcornManifest]
  }
  @scala.inline
  implicit class PopcornManifestOps[Self <: PopcornManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbout(value: PopcornManifestAbout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: PopcornManifestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

