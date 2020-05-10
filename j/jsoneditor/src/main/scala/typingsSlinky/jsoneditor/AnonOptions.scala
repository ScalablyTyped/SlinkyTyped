package typingsSlinky.jsoneditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptions extends js.Object {
  var options: js.Array[String] = js.native
  var startFrom: Double = js.native
}

object AnonOptions {
  @scala.inline
  def apply(options: js.Array[String], startFrom: Double): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], startFrom = startFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
  @scala.inline
  implicit class AnonOptionsOps[Self <: AnonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFrom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

