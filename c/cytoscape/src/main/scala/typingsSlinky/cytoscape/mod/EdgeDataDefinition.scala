package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeDataDefinition
  extends ElementDataDefinition
     with /* key */ StringDictionary[js.Any] {
  /**
    * the source node id (edge comes from this node)
    */
  var source: String = js.native
  /**
    * the target node id (edge goes to this node)
    */
  var target: String = js.native
}

object EdgeDataDefinition {
  @scala.inline
  def apply(source: String, target: String): EdgeDataDefinition = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeDataDefinition]
  }
  @scala.inline
  implicit class EdgeDataDefinitionOps[Self <: EdgeDataDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

