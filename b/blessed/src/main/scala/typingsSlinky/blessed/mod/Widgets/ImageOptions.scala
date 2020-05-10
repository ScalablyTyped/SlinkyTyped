package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.blessedStrings.ansi
import typingsSlinky.blessed.blessedStrings.overlay
import typingsSlinky.blessed.blessedStrings.w3m
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageOptions extends BoxOptions {
  /**
    * path to image.
    */
  var file: String = js.native
  /**
    * path to w3mimgdisplay. if a proper w3mimgdisplay path is not given, blessed will search the
    * entire disk for the binary.
    */
  var `type`: ansi | overlay | w3m = js.native
}

object ImageOptions {
  @scala.inline
  def apply(file: String, `type`: ansi | overlay | w3m): ImageOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
  @scala.inline
  implicit class ImageOptionsOps[Self <: ImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ansi | overlay | w3m): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

