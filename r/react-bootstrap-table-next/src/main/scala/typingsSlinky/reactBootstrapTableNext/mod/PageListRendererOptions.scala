package typingsSlinky.reactBootstrapTableNext.mod

import typingsSlinky.reactBootstrapTableNext.anon.Active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageListRendererOptions extends js.Object {
  /**
    * current page
    */
  var pages: js.Array[Active] = js.native
  /**
    * call it when you need to change page
    */
  def onPageChange(page: Double, sizePerPage: Double): Unit = js.native
}

object PageListRendererOptions {
  @scala.inline
  def apply(onPageChange: (Double, Double) => Unit, pages: js.Array[Active]): PageListRendererOptions = {
    val __obj = js.Dynamic.literal(onPageChange = js.Any.fromFunction2(onPageChange), pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageListRendererOptions]
  }
  @scala.inline
  implicit class PageListRendererOptionsOps[Self <: PageListRendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPageChange(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPages(value: js.Array[Active]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

