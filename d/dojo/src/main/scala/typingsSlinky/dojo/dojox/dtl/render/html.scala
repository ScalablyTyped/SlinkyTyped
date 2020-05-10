package typingsSlinky.dojo.dojox.dtl.render

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dojox.dtl.DomTemplated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/render/html.html
  *
  *
  */
@js.native
trait html extends js.Object {
  /**
    *
    * @param attachPoint               Optional
    * @param tpl               Optional
    */
  def Render(attachPoint: HTMLElement, tpl: DomTemplated): Unit = js.native
}

object html {
  @scala.inline
  def apply(Render: (HTMLElement, DomTemplated) => Unit): html = {
    val __obj = js.Dynamic.literal(Render = js.Any.fromFunction2(Render))
    __obj.asInstanceOf[html]
  }
  @scala.inline
  implicit class htmlOps[Self <: html] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: (HTMLElement, DomTemplated) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Render")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

