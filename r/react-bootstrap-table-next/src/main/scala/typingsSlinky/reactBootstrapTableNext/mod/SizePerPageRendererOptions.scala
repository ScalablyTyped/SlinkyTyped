package typingsSlinky.reactBootstrapTableNext.mod

import typingsSlinky.reactBootstrapTableNext.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizePerPageRendererOptions extends js.Object {
  /**
    * current size per page
    */
  var currentSizePerPage: Double = js.native
  /**
    * dropdown options
    */
  var options: js.Array[AnonText] = js.native
  /**
    * call it when you need to change size per page
    */
  def onSizePerPageChange(page: Double, sizePerPage: Double): Unit = js.native
}

object SizePerPageRendererOptions {
  @scala.inline
  def apply(
    currentSizePerPage: Double,
    onSizePerPageChange: (Double, Double) => Unit,
    options: js.Array[AnonText]
  ): SizePerPageRendererOptions = {
    val __obj = js.Dynamic.literal(currentSizePerPage = currentSizePerPage.asInstanceOf[js.Any], onSizePerPageChange = js.Any.fromFunction2(onSizePerPageChange), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePerPageRendererOptions]
  }
  @scala.inline
  implicit class SizePerPageRendererOptionsOps[Self <: SizePerPageRendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSizePerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSizePerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSizePerPageChange(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSizePerPageChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[AnonText]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

