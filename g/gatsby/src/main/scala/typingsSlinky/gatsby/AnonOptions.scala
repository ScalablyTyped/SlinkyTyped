package typingsSlinky.gatsby

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptions extends js.Object {
  var options: Record[String, _] = js.native
  var resolve: String = js.native
}

object AnonOptions {
  @scala.inline
  def apply(options: Record[String, _], resolve: String): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
  @scala.inline
  implicit class AnonOptionsOps[Self <: AnonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolve(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

