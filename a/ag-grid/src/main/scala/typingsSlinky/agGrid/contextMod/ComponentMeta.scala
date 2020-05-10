package typingsSlinky.agGrid.contextMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentMeta extends js.Object {
  var componentName: String = js.native
  var theClass: Instantiable0[js.Object] = js.native
}

object ComponentMeta {
  @scala.inline
  def apply(componentName: String, theClass: Instantiable0[js.Object]): ComponentMeta = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], theClass = theClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentMeta]
  }
  @scala.inline
  implicit class ComponentMetaOps[Self <: ComponentMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheClass(value: Instantiable0[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

