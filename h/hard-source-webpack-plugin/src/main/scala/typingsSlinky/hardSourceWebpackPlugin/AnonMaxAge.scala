package typingsSlinky.hardSourceWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxAge extends js.Object {
  var maxAge: Double = js.native
  var sizeThreshold: Double = js.native
}

object AnonMaxAge {
  @scala.inline
  def apply(maxAge: Double, sizeThreshold: Double): AnonMaxAge = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], sizeThreshold = sizeThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxAge]
  }
  @scala.inline
  implicit class AnonMaxAgeOps[Self <: AnonMaxAge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

