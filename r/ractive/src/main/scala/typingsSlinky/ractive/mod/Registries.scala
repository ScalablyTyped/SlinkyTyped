package typingsSlinky.ractive.mod

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Registries[T /* <: Ractive[T] */] extends js.Object {
  var adaptors: Registry[Adaptor] = js.native
  var components: Registry[Component] = js.native
  var decorators: Registry[Decorator[T]] = js.native
  var easings: Registry[Easing] = js.native
  var events: Registry[Event_] = js.native
  var helpers: Registry[Helper] = js.native
  var interpolators: Registry[Interpolator] = js.native
  var partials: Registry[Partial] = js.native
}

object Registries {
  @scala.inline
  def apply[T](
    adaptors: Registry[Adaptor],
    components: Registry[Component],
    decorators: Registry[Decorator[T]],
    easings: Registry[Easing],
    events: Registry[Event_],
    helpers: Registry[Helper],
    interpolators: Registry[Interpolator],
    partials: Registry[Partial]
  ): Registries[T] = {
    val __obj = js.Dynamic.literal(adaptors = adaptors.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], easings = easings.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], interpolators = interpolators.asInstanceOf[js.Any], partials = partials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registries[T]]
  }
  @scala.inline
  implicit class RegistriesOps[Self[t] <: Registries[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdaptors(value: Registry[Adaptor]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(value: Registry[Component]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecorators(value: Registry[Decorator[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasings(value: Registry[Easing]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: Registry[Event_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpers(value: Registry[Helper]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpolators(value: Registry[Interpolator]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartials(value: Registry[Partial]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partials")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

