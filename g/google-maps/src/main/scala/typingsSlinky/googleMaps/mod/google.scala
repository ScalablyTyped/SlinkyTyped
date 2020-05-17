package typingsSlinky.googleMaps.mod

import typingsSlinky.googleMaps.anon.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait google extends js.Object {
  var maps: Typeofmaps = js.native
}

object google {
  @scala.inline
  def apply(maps: Typeofmaps): google = {
    val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
    __obj.asInstanceOf[google]
  }
  @scala.inline
  implicit class googleOps[Self <: google] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaps(value: Typeofmaps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

