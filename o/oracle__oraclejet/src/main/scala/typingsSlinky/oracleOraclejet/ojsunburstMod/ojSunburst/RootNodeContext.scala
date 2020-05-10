package typingsSlinky.oracleOraclejet.ojsunburstMod.ojSunburst

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.AnonWidthX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait RootNodeContext[K, D] extends js.Object {
  var componentElement: Element = js.native
  var data: js.Object = js.native
  var id: K = js.native
  var innerBounds: AnonWidthX = js.native
  var itemData: D = js.native
  var outerBounds: AnonWidthX = js.native
}

object RootNodeContext {
  @scala.inline
  def apply[K, D](
    componentElement: Element,
    data: js.Object,
    id: K,
    innerBounds: AnonWidthX,
    itemData: D,
    outerBounds: AnonWidthX
  ): RootNodeContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootNodeContext[K, D]]
  }
  @scala.inline
  implicit class RootNodeContextOps[Self[k, d] <: RootNodeContext[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
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
    def withInnerBounds(value: AnonWidthX): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemData(value: D): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterBounds(value: AnonWidthX): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerBounds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

