package typingsSlinky.dojo.dojox.dtl.render

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dojox.dtl._DomTemplated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/render/dom.html
  *
  *
  */
trait dom extends js.Object {
  /**
    *
    * @param attachPoint               Optional
    * @param tpl               Optional
    */
  def Render(attachPoint: HTMLElement, tpl: _DomTemplated): Unit
}

object dom {
  @scala.inline
  def apply(Render: (HTMLElement, _DomTemplated) => Unit): dom = {
    val __obj = js.Dynamic.literal(Render = js.Any.fromFunction2(Render))
  
    __obj.asInstanceOf[dom]
  }
}

