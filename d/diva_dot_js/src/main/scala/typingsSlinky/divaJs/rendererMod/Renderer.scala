package typingsSlinky.divaJs.rendererMod

import typingsSlinky.divaJs.interfacesMod.SourceProvider
import typingsSlinky.divaJs.interfacesMod.ViewportPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  var layout: typingsSlinky.divaJs.documentLayoutMod.default | Null = js.native
  def adjust(): Unit = js.native
  def destroy(): Unit = js.native
  def getRenderedPages(): js.Any = js.native
  def goto(pageIndex: Double, verticalOffset: Double, horizontalOffset: Double): Unit = js.native
  def isPageVisible(pageIndex: Double): Boolean = js.native
  def load(config: js.Object, viewportPosition: ViewportPosition, sourceResolver: SourceProvider): Unit = js.native
  def transitionViewportPosition(options: js.Object): Unit = js.native
}

object Renderer {
  @scala.inline
  def apply(
    adjust: () => Unit,
    destroy: () => Unit,
    getRenderedPages: () => js.Any,
    goto: (Double, Double, Double) => Unit,
    isPageVisible: Double => Boolean,
    load: (js.Object, ViewportPosition, SourceProvider) => Unit,
    transitionViewportPosition: js.Object => Unit
  ): Renderer = {
    val __obj = js.Dynamic.literal(adjust = js.Any.fromFunction0(adjust), destroy = js.Any.fromFunction0(destroy), getRenderedPages = js.Any.fromFunction0(getRenderedPages), goto = js.Any.fromFunction3(goto), isPageVisible = js.Any.fromFunction1(isPageVisible), load = js.Any.fromFunction3(load), transitionViewportPosition = js.Any.fromFunction1(transitionViewportPosition))
    __obj.asInstanceOf[Renderer]
  }
  @scala.inline
  implicit class RendererOps[Self <: Renderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjust(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRenderedPages(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderedPages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGoto(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goto")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIsPageVisible(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPageVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoad(value: (js.Object, ViewportPosition, SourceProvider) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTransitionViewportPosition(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionViewportPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayout(value: typingsSlinky.divaJs.documentLayoutMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(null)
        ret
    }
  }
  
}

