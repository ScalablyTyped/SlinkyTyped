package typingsSlinky.d3pie.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ID3PieTextOptions extends ID3PieStyleOptions {
  var text: js.UndefOr[String] = js.native
}

object ID3PieTextOptions {
  @scala.inline
  def apply(): ID3PieTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ID3PieTextOptions]
  }
  @scala.inline
  implicit class ID3PieTextOptionsOps[Self <: ID3PieTextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

