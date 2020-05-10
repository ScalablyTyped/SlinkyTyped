package typingsSlinky.cytoscape

import typingsSlinky.cytoscape.mod.CollectionReturnValue
import typingsSlinky.cytoscape.mod.NodeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCut extends js.Object {
  var components: CollectionReturnValue = js.native
  var cut: NodeCollection = js.native
}

object AnonCut {
  @scala.inline
  def apply(components: CollectionReturnValue, cut: NodeCollection): AnonCut = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCut]
  }
  @scala.inline
  implicit class AnonCutOps[Self <: AnonCut] (val x: Self) extends AnyVal {
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
    def withCut(value: NodeCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

