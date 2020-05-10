package typingsSlinky.agGrid.componentProviderMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.componentResolverMod.ComponentType
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisteredComponent[A /* <: IComponent[_] with B */, B] extends js.Object {
  var component: RegisteredComponentInput[A, B] = js.native
  var source: RegisteredComponentSource = js.native
  var `type`: ComponentType = js.native
}

object RegisteredComponent {
  @scala.inline
  def apply[A, B](
    component: RegisteredComponentInput[A, B],
    source: RegisteredComponentSource,
    `type`: ComponentType
  ): RegisteredComponent[A, B] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredComponent[A, B]]
  }
  @scala.inline
  implicit class RegisteredComponentOps[Self[a, b] <: RegisteredComponent[a, b], A, B] (val x: Self[A, B]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, B] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, B]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, B]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, B]) with Other]
    @scala.inline
    def withComponentFunction1(value: /* params */ js.Any => String | HTMLElement): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponent(value: RegisteredComponentInput[A, B]): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: RegisteredComponentSource): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ComponentType): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

