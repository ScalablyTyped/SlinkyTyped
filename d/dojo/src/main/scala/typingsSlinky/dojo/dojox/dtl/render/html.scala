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
trait html extends js.Object {
  /**
    *
    * @param attachPoint               Optional
    * @param tpl               Optional
    */
  def Render(attachPoint: HTMLElement, tpl: DomTemplated): Unit
}

object html {
  @scala.inline
  def apply(Render: (HTMLElement, DomTemplated) => Unit): html = {
    val __obj = js.Dynamic.literal(Render = js.Any.fromFunction2(Render))
  
    __obj.asInstanceOf[html]
  }
}

