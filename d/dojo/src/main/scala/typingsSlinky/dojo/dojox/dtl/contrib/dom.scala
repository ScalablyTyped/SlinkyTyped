package typingsSlinky.dojo.dojox.dtl.contrib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/dom.html
  *
  *
  */
@js.native
trait dom extends js.Object {
  /**
    *
    * @param nodelist
    * @param options
    */
  def BufferNode(nodelist: js.Any, options: js.Any): Unit = js.native
  /**
    *
    * @param styles
    */
  def StyleNode(styles: js.Any): Unit = js.native
  /**
    * Buffer large DOM manipulations during re-render.
    * When using DomTemplate, wrap any content
    * that you expect to change often during
    * re-rendering. It will then remove its parent
    * from the main document while it re-renders that
    * section of code. It will only remove it from
    * the main document if a mainpulation of somes sort
    * happens. ie It won't swap out if it diesn't have to.
    *
    * @param parser
    * @param token
    */
  def buffer(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def html(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def style_(parser: js.Any, token: js.Any): js.Any = js.native
}

object dom {
  @scala.inline
  def apply(
    BufferNode: (js.Any, js.Any) => Unit,
    StyleNode: js.Any => Unit,
    buffer: (js.Any, js.Any) => js.Any,
    html: (js.Any, js.Any) => js.Any,
    style_ : (js.Any, js.Any) => js.Any
  ): dom = {
    val __obj = js.Dynamic.literal(BufferNode = js.Any.fromFunction2(BufferNode), StyleNode = js.Any.fromFunction1(StyleNode), buffer = js.Any.fromFunction2(buffer), html = js.Any.fromFunction2(html), style_ = js.Any.fromFunction2(style_))
    __obj.asInstanceOf[dom]
  }
  @scala.inline
  implicit class domOps[Self <: dom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferNode(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStyleNode(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuffer(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHtml(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStyle_(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style_")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

