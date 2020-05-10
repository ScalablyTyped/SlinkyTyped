package typingsSlinky.dojo.dojox.dtl.base

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.dom.html
  *
  *
  */
@js.native
trait dom extends js.Object {
  /**
    *
    * @param text
    */
  def getTemplate(text: js.Any): js.Object = js.native
  /**
    *
    * @param nodes
    */
  def tokenize(nodes: HTMLElement): js.Array[_] = js.native
}

object dom {
  @scala.inline
  def apply(getTemplate: js.Any => js.Object, tokenize: HTMLElement => js.Array[_]): dom = {
    val __obj = js.Dynamic.literal(getTemplate = js.Any.fromFunction1(getTemplate), tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[dom]
  }
  @scala.inline
  implicit class domOps[Self <: dom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTemplate(value: js.Any => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTokenize(value: HTMLElement => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

