package typingsSlinky.heatmapJs.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapConfiguration[V /* <: String */, X /* <: String */, Y /* <: String */] extends BaseHeatmapConfiguration[V] {
  /**
    * A DOM node where the heatmap canvas should be appended (heatmap will adapt to
    * the node's size)
    */
  var container: HTMLElement = js.native
  /**
    * The property name of your x coordinate in a datapoint
    * Default value: 'x'
    */
  var xField: js.UndefOr[X] = js.native
  /**
    * The property name of your y coordinate in a datapoint
    * Default value: 'y'
    */
  var yField: js.UndefOr[Y] = js.native
}

object HeatmapConfiguration {
  @scala.inline
  def apply[V, X, Y](container: HTMLElement): HeatmapConfiguration[V, X, Y] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapConfiguration[V, X, Y]]
  }
  @scala.inline
  implicit class HeatmapConfigurationOps[Self[v, x, y] <: HeatmapConfiguration[v, x, y], V, X, Y] (val x: Self[V, X, Y]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, X, Y] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, X, Y]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, X, Y]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, X, Y]) with Other]
    @scala.inline
    def withContainer(value: HTMLElement): Self[V, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXField(value: X): Self[V, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXField: Self[V, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xField")(js.undefined)
        ret
    }
    @scala.inline
    def withYField(value: Y): Self[V, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYField: Self[V, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yField")(js.undefined)
        ret
    }
  }
  
}

