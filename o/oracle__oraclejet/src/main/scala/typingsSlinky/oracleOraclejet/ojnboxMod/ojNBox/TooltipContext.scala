package typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait TooltipContext[K] extends js.Object {
  var color: String = js.native
  var column: String = js.native
  var componentElement: Element = js.native
  var id: K = js.native
  var indicatorColor: String = js.native
  var label: String = js.native
  var parentElement: Element = js.native
  var row: String = js.native
  var secondaryLabel: String = js.native
}

object TooltipContext {
  @scala.inline
  def apply[K](
    color: String,
    column: String,
    componentElement: Element,
    id: K,
    indicatorColor: String,
    label: String,
    parentElement: Element,
    row: String,
    secondaryLabel: String
  ): TooltipContext[K] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indicatorColor = indicatorColor.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], secondaryLabel = secondaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContext[K]]
  }
  @scala.inline
  implicit class TooltipContextOps[Self[k] <: TooltipContext[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withColor(value: String): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: String): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentElement(value: Element): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorColor(value: String): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentElement(value: Element): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: String): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryLabel(value: String): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

