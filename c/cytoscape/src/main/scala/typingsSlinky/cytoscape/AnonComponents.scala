package typingsSlinky.cytoscape

import typingsSlinky.cytoscape.mod.CollectionReturnValue
import typingsSlinky.cytoscape.mod.EdgeCollection
import typingsSlinky.cytoscape.mod.NodeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponents extends js.Object {
  var components: CollectionReturnValue
  var cut: EdgeCollection
  var partitionFirst: NodeCollection
  var partitionSecond: NodeCollection
}

object AnonComponents {
  @scala.inline
  def apply(
    components: CollectionReturnValue,
    cut: EdgeCollection,
    partitionFirst: NodeCollection,
    partitionSecond: NodeCollection
  ): AnonComponents = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], partitionFirst = partitionFirst.asInstanceOf[js.Any], partitionSecond = partitionSecond.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComponents]
  }
}

