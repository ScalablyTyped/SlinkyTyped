package typingsSlinky.agGrid.componentResolverMod

import typingsSlinky.agGrid.anon.InstantiableB
import typingsSlinky.agGrid.anon.`1`
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedComponent[A /* <: IComponent[_] with B */, B] extends js.Object {
  var component: (`1`[A, B]) | InstantiableB[B] = js.native
  var dynamicParams: js.Any = js.native
  var source: ComponentSource = js.native
  var `type`: ComponentType = js.native
}

object ResolvedComponent {
  @scala.inline
  def apply[A, B](
    component: (`1`[A, B]) | InstantiableB[B],
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
    def withComponent(value: (`1`[A, B]) | InstantiableB[B]): Self[A, B] = {
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

