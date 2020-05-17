package typingsSlinky.angular.angular

import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents either a component type (`type` is `component`) or a loader function
  * (`type` is `loader`).
  *
  * See also {@link RouteDefinition}.
  */
@js.native
trait ComponentDefinition extends js.Object {
  var component: js.UndefOr[Type] = js.native
  var loader: js.UndefOr[Function] = js.native
  var `type`: String = js.native
}

object ComponentDefinition {
  @scala.inline
  def apply(`type`: String): ComponentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDefinition]
  }
  @scala.inline
  implicit class ComponentDefinitionOps[Self <: ComponentDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withLoader(value: Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
  }
  
}

