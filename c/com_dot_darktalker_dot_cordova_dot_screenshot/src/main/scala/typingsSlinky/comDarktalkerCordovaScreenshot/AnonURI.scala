package typingsSlinky.comDarktalkerCordovaScreenshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonURI extends js.Object {
  var URI: String = js.native
}

object AnonURI {
  @scala.inline
  def apply(URI: String): AnonURI = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonURI]
  }
  @scala.inline
  implicit class AnonURIOps[Self <: AnonURI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

