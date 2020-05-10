package typingsSlinky.mapnik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImageformat extends js.Object {
  var image_format: js.UndefOr[String] = js.native
  var image_scaling: js.UndefOr[String] = js.native
}

object AnonImageformat {
  @scala.inline
  def apply(): AnonImageformat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonImageformat]
  }
  @scala.inline
  implicit class AnonImageformatOps[Self <: AnonImageformat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_format")(js.undefined)
        ret
    }
    @scala.inline
    def withImage_scaling(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_scaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_scaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_scaling")(js.undefined)
        ret
    }
  }
  
}

