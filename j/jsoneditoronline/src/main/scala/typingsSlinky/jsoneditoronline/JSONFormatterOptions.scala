package typingsSlinky.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONFormatterOptions extends js.Object {
  var change: js.UndefOr[js.Function0[Unit]] = js.native
  var indentation: js.UndefOr[Double] = js.native
}

object JSONFormatterOptions {
  @scala.inline
  def apply(): JSONFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONFormatterOptions]
  }
  @scala.inline
  implicit class JSONFormatterOptionsOps[Self <: JSONFormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentation")(js.undefined)
        ret
    }
  }
  
}

