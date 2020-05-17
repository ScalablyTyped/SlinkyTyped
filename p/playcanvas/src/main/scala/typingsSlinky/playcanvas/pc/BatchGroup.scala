package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.BatchGroup
  * @classdesc Holds mesh batching settings and a unique id. Created via {@link pc.BatchManager#addGroup}.
  * @param {number} id - Unique id. Can be assigned to model and element components.
  * @param {string} name - The name of the group.
  * @param {boolean} dynamic - Whether objects within this batch group should support transforming at runtime.
  * @param {number} maxAabbSize - Maximum size of any dimension of a bounding box around batched objects.
  * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
  * @param {number[]} [layers] - Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
  * to these layers. Layers of source models will be ignored.
  * @property {boolean} dynamic Whether objects within this batch group should support transforming at runtime.
  * @property {number} maxAabbSize Maximum size of any dimension of a bounding box around batched objects.
  * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
  * @property {number} id Unique id. Can be assigned to model and element components.
  * @property {string} name Name of the group.
  * @property {number[]} [layers] Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
  * to these layers. Layers of source models will be ignored.
  */
@js.native
trait BatchGroup extends js.Object {
  /**
    * Whether objects within this batch group should support transforming at runtime.
    */
  var dynamic: Boolean = js.native
  /**
    * Unique id. Can be assigned to model and element components.
    */
  var id: Double = js.native
  /**
    * Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
    * to these layers. Layers of source models will be ignored.
    */
  var layers: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Maximum size of any dimension of a bounding box around batched objects.
    * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
    */
  var maxAabbSize: Double = js.native
  /**
    * Name of the group.
    */
  var name: String = js.native
}

object BatchGroup {
  @scala.inline
  def apply(dynamic: Boolean, id: Double, maxAabbSize: Double, name: String): BatchGroup = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxAabbSize = maxAabbSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGroup]
  }
  @scala.inline
  implicit class BatchGroupOps[Self <: BatchGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxAabbSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAabbSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
  }
  
}

