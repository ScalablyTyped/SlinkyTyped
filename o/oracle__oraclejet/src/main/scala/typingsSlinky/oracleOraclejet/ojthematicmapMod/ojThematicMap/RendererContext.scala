package typingsSlinky.oracleOraclejet.ojthematicmapMod.ojThematicMap

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.Focused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait RendererContext[K1, K2, K3, D1, D2, D3] extends js.Object {
  var color: String = js.native
  var componentElement: Element = js.native
  var data: js.Object = js.native
  var id: K1 | K2 | K3 = js.native
  var itemData: D1 | D2 | D3 = js.native
  var label: String = js.native
  var location: String | Null = js.native
  var parentElement: Element = js.native
  var previousState: Focused = js.native
  var root: Element | Null = js.native
  var state: Focused = js.native
  var x: Double | Null = js.native
  var y: Double | Null = js.native
  def renderDefaultFocus(): Unit = js.native
  def renderDefaultHover(): Unit = js.native
  def renderDefaultSelection(): Unit = js.native
}

object RendererContext {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    color: String,
    componentElement: Element,
    data: js.Object,
    id: K1 | K2 | K3,
    itemData: D1 | D2 | D3,
    label: String,
    parentElement: Element,
    previousState: Focused,
    renderDefaultFocus: () => Unit,
    renderDefaultHover: () => Unit,
    renderDefaultSelection: () => Unit,
    state: Focused
  ): RendererContext[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], renderDefaultFocus = js.Any.fromFunction0(renderDefaultFocus), renderDefaultHover = js.Any.fromFunction0(renderDefaultHover), renderDefaultSelection = js.Any.fromFunction0(renderDefaultSelection), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererContext[K1, K2, K3, D1, D2, D3]]
  }
  @scala.inline
  implicit class RendererContextOps[Self[k1, k2, k3, d1, d2, d3] <: RendererContext[k1, k2, k3, d1, d2, d3], K1, K2, K3, D1, D2, D3] (val x: Self[K1, K2, K3, D1, D2, D3]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K1, K2, K3, D1, D2, D3] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K1, K2, K3, D1, D2, D3]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K1, K2, K3, D1, D2, D3]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K1, K2, K3, D1, D2, D3]) with Other]
    @scala.inline
    def withColor(value: String): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentElement(value: Element): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: K1 | K2 | K3): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemData(value: D1 | D2 | D3): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentElement(value: Element): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousState(value: Focused): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderDefaultFocus(value: () => Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDefaultFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderDefaultHover(value: () => Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDefaultHover")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderDefaultSelection(value: () => Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDefaultSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withState(value: Focused): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(null)
        ret
    }
    @scala.inline
    def withRoot(value: Element): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withX(value: Double): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(null)
        ret
    }
    @scala.inline
    def withY(value: Double): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(null)
        ret
    }
  }
  
}

