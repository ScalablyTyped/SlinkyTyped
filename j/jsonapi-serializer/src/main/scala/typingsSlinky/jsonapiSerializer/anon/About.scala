package typingsSlinky.jsonapiSerializer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait About extends js.Object {
  var about: js.UndefOr[String] = js.native
}

object About {
  @scala.inline
  def apply(): About = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[About]
  }
  @scala.inline
  implicit class AboutOps[Self <: About] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(js.undefined)
        ret
    }
  }
  
}

