package typingsSlinky.agGrid.componentResolverMod

import typingsSlinky.agGrid.Anon1
import typingsSlinky.agGrid.AnonInstantiableB
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedComponent[A /* <: IComponent[_] with B */, B] extends js.Object {
  var component: (Anon1[A, B]) | AnonInstantiableB[B] = js.native
  var dynamicParams: js.Any = js.native
  var source: ComponentSource = js.native
  var `type`: ComponentType = js.native
}

object ResolvedComponent {
  @scala.inline
  def apply[A, B](
    component: (Anon1[A, B]) | AnonInstantiableB[B],
    dynamicParams: js.Any,
    source: ComponentSource,
    `type`: ComponentType
  ): ResolvedComponent[A, B] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dynamicParams = dynamicParams.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedComponent[A, B]]
  }
  @scala.inline
  implicit class ResolvedComponentOps[Self[a, b] <: ResolvedComponent[a, b], A, B] (val x: Self[A, B]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, B] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, B]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, B]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, B]) with Other]
    @scala.inline
    def withComponent(value: (Anon1[A, B]) | AnonInstantiableB[B]): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamicParams(value: js.Any): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: ComponentSource): Self[A, B] = {
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

