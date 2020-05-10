package typingsSlinky.jqueryRowgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryRowGridJSOptions extends js.Object {
  var itemSelector: String = js.native
  var maxMargin: js.UndefOr[Double] = js.native
  var minMargin: js.UndefOr[Double] = js.native
}

object JQueryRowGridJSOptions {
  @scala.inline
  def apply(itemSelector: String): JQueryRowGridJSOptions = {
    val __obj = js.Dynamic.literal(itemSelector = itemSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryRowGridJSOptions]
  }
  @scala.inline
  implicit class JQueryRowGridJSOptionsOps[Self <: JQueryRowGridJSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMargin")(js.undefined)
        ret
    }
  }
  
}

