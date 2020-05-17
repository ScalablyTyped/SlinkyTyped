package typingsSlinky.cytoscape.anon

import typingsSlinky.cytoscape.mod.CollectionReturnValue
import typingsSlinky.cytoscape.mod.EdgeCollection
import typingsSlinky.cytoscape.mod.NodeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Components extends js.Object {
  var components: CollectionReturnValue = js.native
  var cut: EdgeCollection = js.native
  var partitionFirst: NodeCollection = js.native
  var partitionSecond: NodeCollection = js.native
}

object Components {
  @scala.inline
  def apply(
    components: CollectionReturnValue,
    cut: EdgeCollection,
    partitionFirst: NodeCollection,
    partitionSecond: NodeCollection
  ): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], partitionFirst = partitionFirst.asInstanceOf[js.Any], partitionSecond = partitionSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  @scala.inline
  implicit class ComponentsOps[Self <: Components] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: CollectionReturnValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCut(value: EdgeCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitionFirst(value: NodeCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitionSecond(value: NodeCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionSecond")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

