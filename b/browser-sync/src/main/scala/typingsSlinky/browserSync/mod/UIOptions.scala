package typingsSlinky.browserSync.mod

import typingsSlinky.browserSync.AnonPort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIOptions extends js.Object {
  /** set the default port */
  var port: js.UndefOr[Double] = js.native
  /** set the default weinre port */
  var weinre: js.UndefOr[AnonPort] = js.native
}

object UIOptions {
  @scala.inline
  def apply(): UIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIOptions]
  }
  @scala.inline
  implicit class UIOptionsOps[Self <: UIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withWeinre(value: AnonPort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weinre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeinre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weinre")(js.undefined)
        ret
    }
  }
  
}

