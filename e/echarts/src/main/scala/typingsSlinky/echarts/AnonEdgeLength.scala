package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEdgeLength extends js.Object {
  /**
    * The distance between 2 nodes on edge.
    * This distance is also affected by
    * [repulsion](https://echarts.apache.org/en/option.html#series-graph.force.repulsion)
    * .
    *
    * It can be an array to represent the range of edge length.
    * In this case edge with larger value will be shorter, which
    * means two nodes are closer.
    * And edge with smaller value will be longer.
    *
    *
    * @default
    * 30
    * @see https://echarts.apache.org/en/option.html#series-graph.force.edgeLength
    */
  var edgeLength: js.UndefOr[js.Array[_] | Double] = js.native
  /**
    * The gravity factor enforcing nodes approach to the center.
    * The nodes will be closer to the center as the value becomes
    * larger.
    *
    *
    * @default
    * 0.1
    * @see https://echarts.apache.org/en/option.html#series-graph.force.gravity
    */
  var gravity: js.UndefOr[Double] = js.native
  /**
    * The initial layout before force-directed layout, which will
    * influence on the result of force-directed layout.
    *
    * It defaults not to do any layout and use
    * [x](https://echarts.apache.org/en/option.html#series-graph.data.x)
    * ,
    * [y](https://echarts.apache.org/en/option.html#series-graph.data.y)
    * provided in
    * [node](https://echarts.apache.org/en/option.html#series-graph.data)
    * as the position of node.
    * If it doesn't exist, the position will be generated randomly.
    *
    * You can also use circular layout `'circular'`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.force.initLayout
    */
  var initLayout: js.UndefOr[String] = js.native
  /**
    * Because the force-directed layout will be steady after several
    * iterations, this parameter will be decide whether to show
    * the iteration animation of layout.
    * It is not recommended to be closed on browser when there
    * are a lot of node data (>100) as the layout process will
    * cause browser to hang.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-graph.force.layoutAnimation
    */
  var layoutAnimation: js.UndefOr[Boolean] = js.native
  /**
    * The repulsion factor between nodes.
    * The repulsion will be stronger and the distance between 2
    * nodes becomes further as this value becomes larger.
    *
    * It can be an array to represent the range of repulsion.
    * In this case larger value have larger repulsion and smaller
    * value will have smaller repulsion.
    *
    *
    * @default
    * 50
    * @see https://echarts.apache.org/en/option.html#series-graph.force.repulsion
    */
  var repulsion: js.UndefOr[js.Array[_] | Double] = js.native
}

object AnonEdgeLength {
  @scala.inline
  def apply(): AnonEdgeLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEdgeLength]
  }
  @scala.inline
  implicit class AnonEdgeLengthOps[Self <: AnonEdgeLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgeLength(value: js.Array[_] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeLength")(js.undefined)
        ret
    }
    @scala.inline
    def withGravity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(js.undefined)
        ret
    }
    @scala.inline
    def withInitLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withRepulsion(value: js.Array[_] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repulsion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepulsion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repulsion")(js.undefined)
        ret
    }
  }
  
}

