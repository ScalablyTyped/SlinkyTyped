package typingsSlinky.betterScroll.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfinityOption extends js.Object {
  def createTombstone(): Element = js.native
  def fetch(count: Double): Unit = js.native
  def render(item: js.Any, div: Element): Element = js.native
}

object InfinityOption {
  @scala.inline
  def apply(createTombstone: () => Element, fetch: Double => Unit, render: (js.Any, Element) => Element): InfinityOption = {
    val __obj = js.Dynamic.literal(createTombstone = js.Any.fromFunction0(createTombstone), fetch = js.Any.fromFunction1(fetch), render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[InfinityOption]
  }
  @scala.inline
  implicit class InfinityOptionOps[Self <: InfinityOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTombstone(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTombstone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFetch(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRender(value: (js.Any, Element) => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

