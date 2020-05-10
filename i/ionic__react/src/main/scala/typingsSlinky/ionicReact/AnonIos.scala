package typingsSlinky.ionicReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIos extends js.Object {
  var ios: String = js.native
  var md: String = js.native
}

object AnonIos {
  @scala.inline
  def apply(ios: String, md: String): AnonIos = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIos]
  }
  @scala.inline
  implicit class AnonIosOps[Self <: AnonIos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

