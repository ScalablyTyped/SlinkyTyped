package typingsSlinky.d3Graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeOptions extends js.Object {
  var shortening: Double = js.native
}

object EdgeOptions {
  @scala.inline
  def apply(shortening: Double): EdgeOptions = {
    val __obj = js.Dynamic.literal(shortening = shortening.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeOptions]
  }
  @scala.inline
  implicit class EdgeOptionsOps[Self <: EdgeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShortening(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortening")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

