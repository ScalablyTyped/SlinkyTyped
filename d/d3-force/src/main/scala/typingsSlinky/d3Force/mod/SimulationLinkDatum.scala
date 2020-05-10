package typingsSlinky.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationLinkDatum[NodeDatum /* <: SimulationNodeDatum */] extends js.Object {
  /**
    * The zero-based index into the links array. Internally generated when calling ForceLink.links(...)
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Link’s source node.
    * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
    * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
    * is replaced by an object reference to the corresponding node with the given identifier.
    * After initialization, the source property represents the source node object.
    */
  var source: NodeDatum | String | Double = js.native
  /**
    * Link’s source link
    * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
    * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
    * is replaced by an object reference to the corresponding node with the given identifier.
    * After initialization, the target property represents the target node object.
    */
  var target: NodeDatum | String | Double = js.native
}

object SimulationLinkDatum {
  @scala.inline
  def apply[NodeDatum](source: NodeDatum | String | Double, target: NodeDatum | String | Double): SimulationLinkDatum[NodeDatum] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationLinkDatum[NodeDatum]]
  }
  @scala.inline
  implicit class SimulationLinkDatumOps[Self[nodedatum] <: SimulationLinkDatum[nodedatum], NodeDatum] (val x: Self[NodeDatum]) extends AnyVal {
    @scala.inline
    def duplicate: Self[NodeDatum] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[NodeDatum]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[NodeDatum] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[NodeDatum] with Other]
    @scala.inline
    def withSource(value: NodeDatum | String | Double): Self[NodeDatum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: NodeDatum | String | Double): Self[NodeDatum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[NodeDatum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[NodeDatum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

