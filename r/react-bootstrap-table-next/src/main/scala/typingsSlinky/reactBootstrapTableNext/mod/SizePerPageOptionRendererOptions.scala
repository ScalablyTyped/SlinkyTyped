package typingsSlinky.reactBootstrapTableNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizePerPageOptionRendererOptions extends js.Object {
  /**
    * size of per page option
    */
  var page: Double = js.native
  /**
    * text of the option
    */
  var text: String = js.native
  /**
    * call it when you need to change size per page
    */
  def onSizePerPageChange(page: Double, sizePerPage: Double): Unit = js.native
}

object SizePerPageOptionRendererOptions {
  @scala.inline
  def apply(onSizePerPageChange: (Double, Double) => Unit, page: Double, text: String): SizePerPageOptionRendererOptions = {
    val __obj = js.Dynamic.literal(onSizePerPageChange = js.Any.fromFunction2(onSizePerPageChange), page = page.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePerPageOptionRendererOptions]
  }
  @scala.inline
  implicit class SizePerPageOptionRendererOptionsOps[Self <: SizePerPageOptionRendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSizePerPageChange(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSizePerPageChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

