package typingsSlinky.oracleOraclejet.ojtreemapMod.ojTreemap

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.WidthX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait NodeContentContext[K, D] extends js.Object {
  var bounds: WidthX = js.native
  var componentElement: Element = js.native
  var data: js.Object = js.native
  var id: K = js.native
  var itemData: D = js.native
}

object NodeContentContext {
  @scala.inline
  def apply[K, D](bounds: WidthX, componentElement: Element, data: js.Object, id: K, itemData: D): NodeContentContext[K, D] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeContentContext[K, D]]
  }
  @scala.inline
  implicit class NodeContentContextOps[Self[k, d] <: NodeContentContext[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withBounds(value: WidthX): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentElement(value: Element): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: K): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemData(value: D): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

