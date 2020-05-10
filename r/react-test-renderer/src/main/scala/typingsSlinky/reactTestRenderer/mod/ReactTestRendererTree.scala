package typingsSlinky.reactTestRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactTestRenderer.reactTestRendererStrings.component
import typingsSlinky.reactTestRenderer.reactTestRendererStrings.host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTestRendererTree extends ReactTestRendererJSON {
  var instance: js.Any = js.native
  var nodeType: component | host = js.native
  var rendered: Null | ReactTestRendererTree = js.native
}

object ReactTestRendererTree {
  @scala.inline
  def apply(instance: js.Any, nodeType: component | host, props: StringDictionary[js.Any], `type`: String): ReactTestRendererTree = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTestRendererTree]
  }
  @scala.inline
  implicit class ReactTestRendererTreeOps[Self <: ReactTestRendererTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: component | host): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendered(value: ReactTestRendererTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(null)
        ret
    }
  }
  
}

