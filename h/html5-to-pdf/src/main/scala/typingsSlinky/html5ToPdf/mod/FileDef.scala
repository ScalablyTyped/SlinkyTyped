package typingsSlinky.html5ToPdf.mod

import typingsSlinky.html5ToPdf.html5ToPdfStrings.css
import typingsSlinky.html5ToPdf.html5ToPdfStrings.js_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDef extends js.Object {
  /**
    * File path
    */
  var filePath: String = js.native
  /**
    * File type
    */
  var `type`: css | js_ = js.native
}

object FileDef {
  @scala.inline
  def apply(filePath: String, `type`: css | js_): FileDef = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDef]
  }
  @scala.inline
  implicit class FileDefOps[Self <: FileDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: css | js_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

