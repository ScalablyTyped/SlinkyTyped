package typingsSlinky.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacePlusCode extends js.Object {
  var compound_code: js.UndefOr[String] = js.native
  var global_code: String = js.native
}

object PlacePlusCode {
  @scala.inline
  def apply(global_code: String): PlacePlusCode = {
    val __obj = js.Dynamic.literal(global_code = global_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacePlusCode]
  }
  @scala.inline
  implicit class PlacePlusCodeOps[Self <: PlacePlusCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobal_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompound_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compound_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompound_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compound_code")(js.undefined)
        ret
    }
  }
  
}

