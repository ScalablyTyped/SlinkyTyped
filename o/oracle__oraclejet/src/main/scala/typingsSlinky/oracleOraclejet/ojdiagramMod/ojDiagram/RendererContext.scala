package typingsSlinky.oracleOraclejet.ojdiagramMod.ojDiagram

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.ElementHeight
import typingsSlinky.oracleOraclejet.anon.Expanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait RendererContext[K1, D1] extends js.Object {
  var componentElement: Element = js.native
  var content: ElementHeight = js.native
  var data: js.Object = js.native
  var id: K1 = js.native
  var itemData: D1 = js.native
  var parentElement: Element = js.native
  var previousState: Expanded = js.native
  var state: Expanded = js.native
  var `type`: String = js.native
  def renderDefaultFocus(): Unit = js.native
  def renderDefaultHover(): Unit = js.native
  def renderDefaultSelection(): Unit = js.native
}

object RendererContext {
  @scala.inline
  def apply[K1, D1](
    componentElement: Element,
    content: ElementHeight,
    data: js.Object,
    id: K1,
    itemData: D1,
    parentElement: Element,
    previousState: Expanded,
    renderDefaultFocus: () => Unit,
    renderDefaultHover: () => Unit,
    renderDefaultSelection: () => Unit,
    state: Expanded,
    `type`: String
  ): RendererContext[K1, D1] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], renderDefaultFocus = js.Any.fromFunction0(renderDefaultFocus), renderDefaultHover = js.Any.fromFunction0(renderDefaultHover), renderDefaultSelection = js.Any.fromFunction0(renderDefaultSelection), state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererContext[K1, D1]]
  }
  @scala.inline
  implicit class RendererContextOps[Self[k1, d1] <: RendererContext[k1, d1], K1, D1] (val x: Self[K1, D1]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K1, D1] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K1, D1]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K1, D1]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K1, D1]) with Other]
    @scala.inline
    def withComponentElement(value: Element): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: ElementHeight): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: K1): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemData(value: D1): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentElement(value: Element): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousState(value: Expanded): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderDefaultFocus(value: () => Unit): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDefaultFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderDefaultHover(value: () => Unit): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDefaultHover")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderDefaultSelection(value: () => Unit): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDefaultSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withState(value: Expanded): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[K1, D1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

