package typingsSlinky.cytoscape.anon

import typingsSlinky.cytoscape.mod.CollectionReturnValue
import typingsSlinky.cytoscape.mod.EdgeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentsCut extends js.Object {
  var components: CollectionReturnValue = js.native
  var cut: EdgeCollection = js.native
}

object ComponentsCut {
  @scala.inline
  def apply(components: CollectionReturnValue, cut: EdgeCollection): ComponentsCut = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentsCut]
  }
  @scala.inline
  implicit class ComponentsCutOps[Self <: ComponentsCut] (val x: Self) extends AnyVal {
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
  }
  
}

