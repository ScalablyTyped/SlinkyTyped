package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeLength extends StObject {
  
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
    * It will slow down the nodes' movement. The value range is from 0 to 1.
    * But it is still an experimental option, see [#11024](https://github.com/apache/incubator-echarts/issues/11024).
    *
    * Since v4.5.0
    *
    * @default
    * 0.6
    * @see https://echarts.apache.org/en/option.html#series-graph.force.friction
    */
  var friction: js.UndefOr[Double] = js.native
  
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
object EdgeLength {
  
  @scala.inline
  def apply(): EdgeLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeLength]
  }
  
  @scala.inline
  implicit class EdgeLengthMutableBuilder[Self <: EdgeLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdgeLength(value: js.Array[_] | Double): Self = StObject.set(x, "edgeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeLengthUndefined: Self = StObject.set(x, "edgeLength", js.undefined)
    
    @scala.inline
    def setEdgeLengthVarargs(value: js.Any*): Self = StObject.set(x, "edgeLength", js.Array(value :_*))
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    @scala.inline
    def setInitLayout(value: String): Self = StObject.set(x, "initLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitLayoutUndefined: Self = StObject.set(x, "initLayout", js.undefined)
    
    @scala.inline
    def setLayoutAnimation(value: Boolean): Self = StObject.set(x, "layoutAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutAnimationUndefined: Self = StObject.set(x, "layoutAnimation", js.undefined)
    
    @scala.inline
    def setRepulsion(value: js.Array[_] | Double): Self = StObject.set(x, "repulsion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepulsionUndefined: Self = StObject.set(x, "repulsion", js.undefined)
    
    @scala.inline
    def setRepulsionVarargs(value: js.Any*): Self = StObject.set(x, "repulsion", js.Array(value :_*))
  }
}
